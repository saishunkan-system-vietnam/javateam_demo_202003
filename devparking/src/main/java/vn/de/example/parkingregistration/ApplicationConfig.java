package vn.de.example.parkingregistration;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.filter.CorsFilter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import lombok.val;

@Configuration
@EnableCaching
public class ApplicationConfig implements WebMvcConfigurer {

    @Bean
    public FilterRegistrationBean<CharacterEncodingFilter> encodingFilter() {
        val filter = new CharacterEncodingFilter();
        filter.setForceEncoding(true);
        filter.setEncoding("UTF-8");
        val bean = new FilterRegistrationBean<CharacterEncodingFilter>(filter);
        return bean;
    }

    @Bean
    public FilterRegistrationBean<CorsFilter> corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration().applyPermitDefaultValues();
        config.setAllowCredentials(true);
        source.registerCorsConfiguration("/**", config);
        FilterRegistrationBean<CorsFilter> bean = new FilterRegistrationBean<CorsFilter>(new CorsFilter(source));
        bean.setOrder(Ordered.HIGHEST_PRECEDENCE);
        return bean;
    }

    @Bean
    public DriverManagerDataSource dataSource() throws IOException {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        Properties properties = new Properties();
        InputStream user_props = this.getClass().getResourceAsStream("/application.properties");
        properties.load(user_props);
        dataSource.setDriverClassName(properties.getProperty("spring.datasource.driver-class-name"));
        dataSource.setUrl(properties.getProperty("spring.datasource.url"));
        dataSource.setUsername(properties.getProperty("spring.datasource.username"));
        dataSource.setPassword(properties.getProperty("spring.datasource.password"));
        return dataSource;
    }

    @Bean
    public SqlSessionFactoryBean sqlSessionFactory() throws IOException {
        Resource resource = new ClassPathResource("mybatis-config.xml");
        SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
        sessionFactoryBean.setDataSource(dataSource());
        sessionFactoryBean.setConfigLocation(resource);
        return sessionFactoryBean;
    }

    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer() {
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setBasePackage("vn.de.example.parkingregistration.model.mapper");
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
        return mapperScannerConfigurer;
    }

}
