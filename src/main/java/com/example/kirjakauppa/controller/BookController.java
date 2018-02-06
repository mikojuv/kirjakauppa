package com.example.kirjakauppa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {

	@RequestMapping("/index")
	public String home(){
		//do something
		return "index";
	}
}
