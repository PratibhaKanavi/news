package com.ps.mock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MasterController {
	
	
	@RequestMapping(value="/")
	@ResponseBody
	public String home() {
		return "Modified the return type";
	}
	

}
