package vn.de.example.parkingregistration.repository;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import vn.de.example.parkingregistration.controller.dto.StudentDTO;
import vn.de.example.parkingregistration.model.Student;
import vn.de.example.parkingregistration.model.mapper.StudentModelMapper;

@Repository
public class StudentReponsitory {
	 @Autowired
	 private StudentModelMapper mapper;
	 public List<StudentDTO> findAllStudent(){
		 return mapper.findAllStudent().stream().map(student -> new StudentDTO(student)).collect(Collectors.toList());
	 }
	 public List<Student> search(StudentDTO student){
		 return mapper.search(student);
	 }
	 public void addStudent(Student student) {
		 mapper.addStudent(student);
	 }
	 public void updateStudent(Student student) {
		 mapper.updateStudent(student);
	 }
	 public void deleteStudent(Student student) {
		 mapper.deleteStudent(student);
	 }
}
