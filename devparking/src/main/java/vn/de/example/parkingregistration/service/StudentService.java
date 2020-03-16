package vn.de.example.parkingregistration.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.de.example.parkingregistration.controller.dto.StudentDTO;
import vn.de.example.parkingregistration.model.Student;
//import vn.de.example.parkingregistration.model.Student;
import vn.de.example.parkingregistration.repository.StudentReponsitory;

@Service
public class StudentService extends BaseTransactionalService {
	@Autowired
	private StudentReponsitory reponsitory;
	public List<StudentDTO> findAllStudent(){
		return reponsitory.findAllStudent();
	}
	public List<Student> search(StudentDTO student){
		return reponsitory.search(student);
	}
	 public void addStudent(Student student) {
		 reponsitory.addStudent(student);
	 }
	 public void updateStudent(Student student) {
		 reponsitory.updateStudent(student);
	 }
	 public void deleteStudent(Student student) {
		 reponsitory.deleteStudent(student);
	 }
}
