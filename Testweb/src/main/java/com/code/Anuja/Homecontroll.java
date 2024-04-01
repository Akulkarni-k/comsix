package com.code.Anuja;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Homecontroll {
	@GetMapping("/")
	public String getting()
	{
		return "Hi";
		
	}
}
