package vn.de.example.parkingregistration;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("vn.de.example.parkingregistration")
public class DevparkingApplication {

    public static void main(String[] args) {
    	SpringApplication app = new SpringApplication(DevparkingApplication.class);
        app.setDefaultProperties(Collections
                .singletonMap("server.port", "8081"));
        app.run(args);   
    }

}
