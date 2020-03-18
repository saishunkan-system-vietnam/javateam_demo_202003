package vn.de.example.parkingregistration.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentSubject {
	@JsonIgnore
	private int idStuSub;
	@JsonIgnore
	private int id;
	private int idSub;
	private String sub;
	private float pointSub;
	
}
