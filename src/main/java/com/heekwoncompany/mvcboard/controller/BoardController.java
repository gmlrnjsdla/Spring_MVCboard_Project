package com.heekwoncompany.mvcboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BoardController {

	@RequestMapping(value="list")
	public String list() {
		
		
		
		return "list";
	}
	
}
