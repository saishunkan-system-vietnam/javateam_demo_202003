package vn.de.example.parkingregistration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.de.example.parkingregistration.model.StudentSubject;
import vn.de.example.parkingregistration.repository.StudentSubjectRespository;

@Service
public class StudentSubjectService {
	@Autowired
	StudentSubjectRespository repository;
	
	
	public void addSS(StudentSubject studentSubject) {
		repository.addSS(studentSubject);
	}
}
