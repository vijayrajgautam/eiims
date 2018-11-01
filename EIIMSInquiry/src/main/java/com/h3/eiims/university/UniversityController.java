package com.h3.eiims.university;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UniversityController {

	@Autowired
	private UniversityService univ;

	@RequestMapping("/university")
	public List<University> getAllUniversities() {
		return univ.getAllUniversity();
	}

	@RequestMapping("/university/{Id}")
	public University getUniversity(@PathVariable int Id) {
		return univ.getUniversity(Id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/university")
	public void addUniversity(@RequestBody University ex) {
		univ.AddUniversity(ex);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/university")
	public void updateUniversity(@RequestBody University ex) {
		univ.UpdateUniversity(ex);
	}

};
