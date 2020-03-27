package vn.de.example.parkingregistration.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import vn.de.example.parkingregistration.model.StudentSubject;
import vn.de.example.parkingregistration.model.mapper.StudentSubjectModelMapper;

@Repository
public class StudentSubjectRespository {
	@Autowired 
	StudentSubjectModelMapper mapper;
	
	public void addSS(StudentSubject studentSubject) {
		mapper.addSS(studentSubject);
	}
}
