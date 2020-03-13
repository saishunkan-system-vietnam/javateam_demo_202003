package vn.de.example.parkingregistration.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

        List<String> roles = appRoleService.getRoleNames(appUser.getUserId());

        List<GrantedAuthority> grants = new ArrayList<GrantedAuthority>();

        roles.forEach(role -> {
            GrantedAuthority grant = new SimpleGrantedAuthority(role);
            grants.add(grant);
        });

        UserDetails userDetails = (UserDetails) new User(appUser.getUserName(), appUser.getEncrytedPassword(), grants);
        return userDetails;
    }

}
