package com.mjrousos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	@RequestMapping(value = "/greeting")
	public String sayHello(Model model) {
		
		// Model is basically a hashmap (like ViewDictionary)
		model.addAttribute("greeting", "Hello, world!");
		
		String viewName = "hello";
		return viewName;
	}
	
}
