package vn.de.example.parkingregistration.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Subject extends EntityImpl {
	
	private int idSub;
	private String sub;
}
