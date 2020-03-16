package vn.de.example.parkingregistration.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AppRole extends EntityImpl{

    private Long roleId;

    private String roleName;
}
