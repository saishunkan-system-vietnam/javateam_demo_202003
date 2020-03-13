package vn.de.example.parkingregistration.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AppUser {

    private Long userId;

    private String userName;

    private String encrytedPassword;

    private Boolean enabled;
}
