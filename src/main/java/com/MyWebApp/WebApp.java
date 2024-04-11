package com.MyWebApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebApp {
	
	@GetMapping(value = "/MyName")
	public String name() {
		return "Sriram";
	}

}
