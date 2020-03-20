package vn.de.example.parkingregistration.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AppUser extends EntityImpl {

    private Long userId;

    private String phone;

    private String userName;

    private String encrytedPassword;

    private Boolean enabled;

}
