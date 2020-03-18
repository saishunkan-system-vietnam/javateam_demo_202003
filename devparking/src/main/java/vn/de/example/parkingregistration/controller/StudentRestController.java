package vn.de.example.parkingregistration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import lombok.val;
import vn.de.example.parkingregistration.controller.dto.StudentDTO;
import vn.de.example.parkingregistration.model.Student;
import vn.de.example.parkingregistration.service.StudentService;

@RestController
@RequestMapping(path = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
public class StudentRestController {
	@Autowired
	StudentService studentService;

	@GetMapping("/student")
	public List<StudentDTO> findAllStudent() {
		return studentService.findAllStudent();
	}

	@GetMapping("/student/{id}")
	public StudentDTO getReservation(@PathVariable int id) {
		val studentDTO = studentService.findByIdStudent(id);
		return studentDTO;
	}

	@PostMapping("/student/add")
	@ResponseStatus(HttpStatus.CREATED)
	public void add(@RequestBody Student student) {
		studentService.addStudent(student);
	}

	@PutMapping("/student/edit/{id}")
	public void editStudent(@PathVariable int id, @RequestBody Student student) {
		val studentEdit = studentService.findByIdStudent(id);
		studentEdit.setName(student.getName());
		studentEdit.setBranch(student.getBranch());
		studentService.updateStudent(studentEdit);
	}

	@DeleteMapping("/student/delete/{id}")
	public void deleteStudent(@PathVariable int id) {
		val student = studentService.findByIdStudent(id);
		studentService.deleteStudent(student);
	}

	@GetMapping("/student/search")
	public List<StudentDTO> search(@RequestBody Student student) {
		return studentService.search(student);
	}

	@GetMapping("/student/findStudent")
	public List<StudentDTO> findStudent(@RequestBody Student student) {
		return studentService.findStudent(student);
	}

}
