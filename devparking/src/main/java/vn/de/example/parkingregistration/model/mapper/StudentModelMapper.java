package vn.de.example.parkingregistration.model.mapper;

import java.util.List;
import java.util.Optional;

import vn.de.example.parkingregistration.controller.dto.StudentDTO;
import vn.de.example.parkingregistration.model.Student;

public interface StudentModelMapper {
	List<Student> findAllStudent();
	List<Student> search(Student student);
	List<Student> findStudent(Student student);
	public void addStudent(Student student);
	public void updateStudent(StudentDTO student);
	public void deleteStudent(StudentDTO student);
	Optional<Student> findByIdStudent(int id);

}
