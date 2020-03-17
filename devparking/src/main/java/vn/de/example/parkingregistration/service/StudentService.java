package vn.de.example.parkingregistration.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import vn.de.example.parkingregistration.controller.dto.AppUserDTO;
import vn.de.example.parkingregistration.controller.dto.StudentDTO;
import vn.de.example.parkingregistration.model.Student;
//import vn.de.example.parkingregistration.model.Student;
import vn.de.example.parkingregistration.repository.StudentReponsitory;

@Service
public class StudentService extends BaseTransactionalService {
	@Autowired
	private StudentReponsitory reponsitory;

	public List<StudentDTO> findAllStudent() {
		return reponsitory.findAllStudent();
	}

	public List<StudentDTO> search(Student student) {
		return reponsitory.search(student);
	}

	public List<StudentDTO> findStudent(Student student) {
		return reponsitory.findStudent(student);
	}

	public void addStudent(Student student) {
		reponsitory.addStudent(student);
	}

	public void updateStudent(StudentDTO student) {
		reponsitory.updateStudent(student);
	}

	public void deleteStudent(StudentDTO student) {
		reponsitory.deleteStudent(student);
	}

	public StudentDTO findByIdStudent(int id) {
		Assert.notNull(id, "userId must not be null");
		return reponsitory.findByIdStudent(id);
	}
}
