package com.code.Anuja;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingControllers {
	@Autowired
	private GreetingService service;
	@GetMapping("/hianuja")
	public String greeting()
	{
		return service.greet();
		
	}

}
