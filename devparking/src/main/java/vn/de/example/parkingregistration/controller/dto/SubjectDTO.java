package vn.de.example.parkingregistration.controller.dto;


import lombok.Getter;
import lombok.Setter;
import vn.de.example.parkingregistration.model.Subject;

@Getter
@Setter
public class SubjectDTO implements DTO {
	private int id_sub;
	private String sub;

	public SubjectDTO(Subject subject) {
		copyProperties(this, subject);
	}
}
