package com.heekwoncompany.mvcboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.heekwoncompany.mvcboard.command.BCommand;
import com.heekwoncompany.mvcboard.command.BListCommand;

@Controller
public class BoardController {
	
	BCommand command = null;
	
	@RequestMapping(value="list")
	public String list(Model model) {
		
		command = new BListCommand();
		command.excute(model);
		
		return "list";
	}
	
}
