package vn.de.example.parkingregistration.model;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EntityImpl {

	@JsonIgnore
    private LocalDateTime createdDatetime;
	
	@JsonIgnore
    private LocalDateTime updateDatetime;
	
	@JsonIgnore
    private Boolean isDeleted;
}
