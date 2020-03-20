package vn.de.example.parkingregistration.security;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import lombok.val;
import vn.de.example.parkingregistration.model.AppUser;
import vn.de.example.parkingregistration.service.AppRoleService;
import vn.de.example.parkingregistration.service.AppUserService;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    AppUserService appUserService;

    @Autowired
    AppRoleService appRoleService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Optional<AppUser> optAppUser = appUserService.findUserAccount(username);
        if (!optAppUser.isPresent()) {
            throw new UsernameNotFoundException(String.format("User %s was not found in the database", username));
        }

        val appUser = optAppUser.get();

        List<GrantedAuthority> grants = appRoleService.getRoleNames(appUser.getUserId()).stream()
                .map(SimpleGrantedAuthority::new).collect(Collectors.toList());

        UserDetails userDetails = (UserDetails) new User(appUser.getUserName(), appUser.getEncrytedPassword(), grants);

        return userDetails;
    }

}
