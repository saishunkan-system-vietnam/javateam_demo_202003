package vn.de.example.parkingregistration.controller.dto;

import lombok.Getter;
import lombok.Setter;
import vn.de.example.parkingregistration.model.StudentSubject;

@Getter
@Setter
public class StudentSubjectDTO implements DTO {
	private int idStuSub;
	private int id;
	private int idSub;
	private String sub;
	private float pointSub;
	public StudentSubjectDTO (StudentSubject studentSubject) {
		copyProperties(this,studentSubject);
	}
	
}
