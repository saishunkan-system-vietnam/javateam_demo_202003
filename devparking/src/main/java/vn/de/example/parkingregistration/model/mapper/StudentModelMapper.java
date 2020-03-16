package vn.de.example.parkingregistration.model.mapper;

import java.util.List;

import vn.de.example.parkingregistration.controller.dto.StudentDTO;
import vn.de.example.parkingregistration.model.Student;

public interface StudentModelMapper {
	List<Student> findAllStudent();
	List<Student> search(StudentDTO student);
	public void addStudent(Student student);
	public void updateStudent(Student student);
	public void deleteStudent(Student student);
}
