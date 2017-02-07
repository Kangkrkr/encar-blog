package com.encar.blog.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.encar.blog.domain.CmMap;
import com.encar.blog.mapper.MemberMapper;
import com.encar.blog.mapper.SubjectMapper;

@Controller
public class MainController {
	
	private static final Logger logger = LoggerFactory.getLogger(MainController.class);
	
	@Autowired
	private MemberMapper memberMapper;
	
	@Autowired
	private SubjectMapper subjectMapper;
	
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "home";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		return "login/login";
	}
	
	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public String join() {
		return "join/join";
	}
	
	@RequestMapping(value = "/posting", method = RequestMethod.GET)
	public String posting(@ModelAttribute("reqVO") CmMap reqVO) {
		
		reqVO.put("subjects", subjectMapper.selectSubjectName());
		
		return "posting/posting";
	}
	
	@RequestMapping(value = "/guest-book", method = RequestMethod.GET)
	public String guestBook() {
		return "guest-book/guest-book";
	}
}
