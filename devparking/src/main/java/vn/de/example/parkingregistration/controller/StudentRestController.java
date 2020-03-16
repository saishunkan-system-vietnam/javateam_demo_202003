package vn.de.example.parkingregistration.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import vn.de.example.parkingregistration.controller.dto.StudentDTO;
import vn.de.example.parkingregistration.model.Student;
import vn.de.example.parkingregistration.service.StudentService;
@RestController
@RequestMapping(path = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
public class StudentRestController {
	@Autowired
	StudentService studentService;
	
	@GetMapping("/findAllStudent")
	public List<StudentDTO> findAllStudent() {
		return studentService.findAllStudent();
	}
	@PostMapping("/searchStudent")
	public List<Student> search(StudentDTO student){
		return studentService.search(student);
	}
	@PostMapping("/addStudent")
	public String addStudent(@Valid Student student) {
		Student student1 = new Student();
		return null;
	}
}
