package vn.de.example.parkingregistration.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student {
	
	private int id;
	private String name;
	private String branch;
	private String phone;
	List<Subject> subjects;
	List<StudentSubject> studentSubjects;
}
