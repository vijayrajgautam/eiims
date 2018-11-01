package com.h3.eiims.executives;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExecutivesController {
	
	@Autowired
	private ExecutivesService ES;
	
	@RequestMapping("/executives")
	public List<Executive> getAllExecutives() {
		return ES.getAllExecutives();
	}
	
	@RequestMapping("/executives/{Id}")
	public Executive getExecutive(@PathVariable int Id) {
		return ES.getExecutive(Id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/executive")
	public void addExecutive(@RequestBody Executive ex) {
		ES.AddExecutive(ex); 
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/executive")
	public void updateExecutive(@RequestBody Executive ex) {
		ES.UpdateExecutive(ex);
	}


};
