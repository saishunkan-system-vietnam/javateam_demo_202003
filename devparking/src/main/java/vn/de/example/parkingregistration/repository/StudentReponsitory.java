package vn.de.example.parkingregistration.repository;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import lombok.val;
import vn.de.example.parkingregistration.controller.dto.StudentDTO;
import vn.de.example.parkingregistration.exception.DataNotFoundException;
import vn.de.example.parkingregistration.model.Student;
import vn.de.example.parkingregistration.model.mapper.StudentModelMapper;

@Repository
public class StudentReponsitory {
	@Autowired
	private StudentModelMapper mapper;

	public List<StudentDTO> findAllStudent() {
		return mapper.findAllStudent().stream().map(student -> new StudentDTO(student)).collect(Collectors.toList());
	}

	public List<StudentDTO> search(Student student) {
		return mapper.search(student).stream().map(student1 -> new StudentDTO(student1)).collect(Collectors.toList());
	}
	
	public List<StudentDTO> findStudent(Student student) {
		return mapper.findStudent(student).stream().map(student2 -> new StudentDTO(student2)).collect(Collectors.toList());
	}
	
	public List<StudentDTO> find() {
		return mapper.find().stream().map(student3 -> new StudentDTO(student3)).collect(Collectors.toList());
	}

	public void addStudent(Student student) {
		mapper.addStudent(student);
	}

	public void updateStudent(StudentDTO student) {
		mapper.updateStudent(student);
	}

	public void deleteStudent(StudentDTO student) {
		mapper.deleteStudent(student);
	}

	public StudentDTO findByIdStudent(int id) {
		val studentDto = mapper.findByIdStudent(id)
				.orElseThrow(() -> new DataNotFoundException("Not found user : " + id));
		return new StudentDTO(studentDto);
	}
}
