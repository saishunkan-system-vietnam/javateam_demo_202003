package vn.de.example.parkingregistration.controller.dto;

import lombok.Getter;
import lombok.Setter;
import vn.de.example.parkingregistration.model.AppUser;

@Getter
@Setter
public class AppUserDTO implements DTO {

    private Long userId;

    private String userName;

    private String encrytedPassword;

    private Boolean enabled;

    public AppUserDTO(AppUser appUser) {
        copyProperties(this, appUser);
    }

}
