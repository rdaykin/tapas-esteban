package com.tplace.tapasesteban.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AboutUsController {
	
	@Value("${welcome.message:test}")
	private String message = "Hello World";
	
	@RequestMapping("/aboutus")
	public String welcome(Map<String,Object> model) {
		model.put("message", this.message);
		return "aboutus";
	}

}
