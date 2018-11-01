package com.h3.eiims.executives;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExecutivesService {

	@Autowired
	private ExecutiveRepository ER;

	public List<Executive> getAllExecutives() {
		List<Executive> executives = new ArrayList<>();
		ER.findAll().forEach(executives::add);
		return executives;

	}

	public Executive getExecutive(int Id) {
		return ER.findById(Id).get();
	}

	public void AddExecutive(Executive ex) {
		ER.save(ex);
	}

	public void UpdateExecutive(Executive ex) {
		ER.save(ex);
	}

	public void deleteExecutive(Executive ex) {
		ER.delete(ex);
	}

	public void deleteExecutive(Integer Id) {
		ER.deleteById(Id);
	}

}
