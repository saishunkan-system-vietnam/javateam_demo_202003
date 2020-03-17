package vn.de.example.parkingregistration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import vn.de.example.parkingregistration.controller.dto.SubjectDTO;
import vn.de.example.parkingregistration.service.SubjectService;

@RestController
@RequestMapping(path = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
public class SubjectRestController {
	@Autowired
	SubjectService subjectService;
	@GetMapping("/subject")
	public List<SubjectDTO> findAllSubject() {
		return subjectService.findAllSubject();
	}
}
