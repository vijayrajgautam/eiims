package com.h3.eiims;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/inquire")
	public String sayHelloToUser() {
		return "Hello, thanks for coming to inquire...";
	}

}
