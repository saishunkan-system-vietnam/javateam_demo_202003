package vn.de.example.parkingregistration.controller.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import vn.de.example.parkingregistration.model.Student;
import vn.de.example.parkingregistration.model.StudentSubject;
import vn.de.example.parkingregistration.model.Subject;

@Getter
@Setter
@AllArgsConstructor
public class StudentDTO implements DTO {
	private int id;
	private String name;
	private String branch;
	private String phone;
	//List<Subject> subjects;
	List<StudentSubject> studentSubjects;
	
	public StudentDTO() {}
	
	public StudentDTO(Student student) {
	        copyProperties(this, student);
	}
	
	private int soMon;
	private String diemTB;
	private Integer page = 1;
	private Integer pageSize = 3;
	public Integer getOffset() {
		return (page - 1) * pageSize;
	}
	
}
