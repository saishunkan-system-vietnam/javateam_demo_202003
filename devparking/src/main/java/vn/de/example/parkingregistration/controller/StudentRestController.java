package vn.de.example.parkingregistration.controller;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.val;
import vn.de.example.parkingregistration.controller.dto.ResourceStudent;
import vn.de.example.parkingregistration.controller.dto.StudentDTO;
import vn.de.example.parkingregistration.model.Student;
import vn.de.example.parkingregistration.service.StudentService;
import vn.de.example.parkingregistration.service.StudentSubjectService;

@RestController
@RequestMapping(path = "/api/student", produces = MediaType.APPLICATION_JSON_VALUE)
public class StudentRestController {
	@Autowired
	StudentService studentService;

	@Autowired
	ModelMapper modelMapper;

//	@GetMapping("/findAllStudent")
//	public List<StudentDTO> findAllStudent() {
//		return studentService.findAllStudent();
//	}
	
	@GetMapping("/findAllStudent")
	public ResourceStudent findAllStudent() {
		return getResourceStudent(new StudentDTO());
	}

	@GetMapping("/findByIdStudent/{id}")
	public StudentDTO getReservation(@PathVariable int id) {
		val studentDTO = studentService.findByIdStudent(id);
		return studentDTO;
	}

	@PostMapping("/add")
	public void add(@RequestBody Student student) {
		studentService.addStudent(student);
	}

	@PutMapping("/edit/{id}")
	public void editStudent(@PathVariable int id, @RequestBody Student student) {
		val studentEdit = studentService.findByIdStudent(id);
		modelMapper.map(student, studentEdit);
		studentEdit.setStudentSubjects(student.getStudentSubjects());
		studentService.updateStudent(studentEdit);
	}

	@DeleteMapping("/delete/{id}")
	public void deleteStudent(@PathVariable int id) {
		val student = studentService.findByIdStudent(id);
		studentService.deleteStudent(student);
	}

	/*
	 * @PostMapping("/search") public List<StudentDTO> search(@RequestBody Student
	 * student) { return studentService.search(student); }
	 */
	@PostMapping("/search")
	public ResourceStudent search(@RequestBody StudentDTO student) {
		return getResourceStudent(student);
	}
	
	public ResourceStudent getResourceStudent(StudentDTO student) {
		
		int total = studentService.findCountStudents(student);
		int totalPages = (int) Math.ceil(((double)total / student.getPageSize()));
		int perPage = student.getPageSize();
		int currentPage = student.getPage();

		List<Student> students = studentService.search(student);
		ResourceStudent resoure = new ResourceStudent();
		resoure.setDataStudent(students);
		resoure.setTotal(total);
		resoure.setTotalPages(totalPages);
		resoure.setPerPage(perPage);
		resoure.setCurrentPage(currentPage);
		return resoure;
	}

	@GetMapping("/findStudent")
	public List<StudentDTO> findStudent(@RequestBody Student student) {
		return studentService.findStudent(student);
	}

	@GetMapping("/find")
	public List<StudentDTO> find() {
		return studentService.find();
	}
}
