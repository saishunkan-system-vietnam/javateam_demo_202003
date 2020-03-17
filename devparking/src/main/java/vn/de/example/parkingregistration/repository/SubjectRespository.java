package vn.de.example.parkingregistration.repository;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import vn.de.example.parkingregistration.controller.dto.SubjectDTO;
import vn.de.example.parkingregistration.model.mapper.SubjectModelMapper;

@Repository
public class SubjectRespository {

	@Autowired
	private SubjectModelMapper mapper;

	public List<SubjectDTO> findAllSubject() {
		return mapper.findAllSubject().stream().map(subject -> new SubjectDTO(subject)).collect(Collectors.toList());
	}
}
