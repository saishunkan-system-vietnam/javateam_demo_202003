package vn.de.example.parkingregistration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import vn.de.example.parkingregistration.model.StudentSubject;
import vn.de.example.parkingregistration.service.StudentSubjectService;

@RestController
@RequestMapping(path = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
public class StudentSubjectRestController {
	@Autowired
	StudentSubjectService service;
	
	@PostMapping("/add")
	public void addSS(@RequestBody StudentSubject studentSubject) {
		service.addSS(studentSubject);
	}
}
