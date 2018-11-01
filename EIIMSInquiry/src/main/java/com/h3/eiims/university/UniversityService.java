package com.h3.eiims.university;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UniversityService {

	@Autowired
	private UniversityRepository UR;

	public List<University> getAllUniversity() {
		List<University> universities = new ArrayList<>();
		UR.findAll().forEach(universities::add);
		return universities;

	}

	public University getUniversity(int Id) {
		return UR.findById(Id).get();
	}

	public void AddUniversity(University u) {
		UR.save(u);
	}

	public void UpdateUniversity(University u) {
		UR.save(u);
	}

	public void deleteUniversity(University u) {
		UR.delete(u);
	}

	public void deleteUniversity(Integer Id) {
		UR.deleteById(Id);
	}

}
