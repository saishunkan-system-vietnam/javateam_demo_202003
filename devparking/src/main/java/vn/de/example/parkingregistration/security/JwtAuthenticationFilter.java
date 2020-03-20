package vn.de.example.parkingregistration.security;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import lombok.val;
import vn.de.example.parkingregistration.model.AppUser;
import vn.de.example.parkingregistration.service.AppRoleService;
import vn.de.example.parkingregistration.service.AppUserService;

@Component
public class JwtAuthenticationFilter extends OncePerRequestFilter {

    @Autowired
    JwtTokenProvider jwtTokenProvider;

    @Autowired
    AppUserService appUserService;

    @Autowired
    AppRoleService appRoleService;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
        String jwt = getJwtFromRequest(request);

        if (jwt != null && jwtTokenProvider.validateToken(jwt)) {

            String userName = jwtTokenProvider.getUserNameFromJWT(jwt);

            Optional<AppUser> optAppUser = appUserService.findUserAccount(userName);

            if (optAppUser.isPresent()) {

                val appUser = optAppUser.get();

                List<GrantedAuthority> grants = appRoleService.getRoleNames(appUser.getUserId()).stream()
                        .map(SimpleGrantedAuthority::new).collect(Collectors.toList());

                UserDetails userDetails = (UserDetails) new User(appUser.getUserName(), appUser.getEncrytedPassword(),
                        grants);

                UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(
                        userDetails, null, userDetails.getAuthorities());

                authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));

                SecurityContextHolder.getContext().setAuthentication(authentication);
            }
        }

        filterChain.doFilter(request, response);

    }

    public String getJwtFromRequest(HttpServletRequest request) {
        return request.getHeader("Authorization");
    }
}
