package vn.de.example.parkingregistration.controller.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import vn.de.example.parkingregistration.model.Student;

@Getter
@Setter
@AllArgsConstructor
public class ResourceStudent {

	public ResourceStudent() {
		// TODO Auto-generated constructor stub
	}
	private Integer totalPages;
	private Integer total;
	private Integer perPage;
	private Integer currentPage;
	private List<Student> dataStudent;
	
}