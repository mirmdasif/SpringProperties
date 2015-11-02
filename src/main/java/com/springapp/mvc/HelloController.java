package com.springapp.mvc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HelloController {
    
    @Value("${jdbc.url}")
    String url;
    
	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("message", url);
		return "hello";
	}
}