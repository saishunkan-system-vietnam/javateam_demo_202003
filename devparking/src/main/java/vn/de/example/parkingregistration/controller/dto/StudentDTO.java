package vn.de.example.parkingregistration.controller.dto;

import lombok.Getter;
import lombok.Setter;
import vn.de.example.parkingregistration.model.Student;

@Getter
@Setter
public class StudentDTO implements DTO {
	private int id;
	private String name;
	private String branch;
	private String phone;
	 public StudentDTO(Student student) {
	        copyProperties(this, student);
	    }
}
