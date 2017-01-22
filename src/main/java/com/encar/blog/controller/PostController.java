package com.encar.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/posting")
public class PostController {

	@RequestMapping(value="/add-posting")
	public String addPosting(){
		return "posting/add-posting";
	}
	
}
