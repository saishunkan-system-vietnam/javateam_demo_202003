package vn.de.example.parkingregistration.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.de.example.parkingregistration.controller.dto.SubjectDTO;
import vn.de.example.parkingregistration.repository.SubjectRespository;

@Service
public class SubjectService {
	@Autowired
	private SubjectRespository respository;

	public List<SubjectDTO> findAllSubject() {
		return respository.findAllSubject();
	}
}
