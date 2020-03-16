package vn.de.example.parkingregistration.model;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EntityImpl {

    private LocalDateTime createdDatetime;

    private LocalDateTime updateDatetime;

    private Boolean isDeleted;
}
