package com.encar.blog;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.encar.blog.domain.Member;
import com.encar.blog.domain.MemberAuth;
import com.encar.blog.service.MemberService;

@Controller
public class MainController {
	
	private static final Logger logger = LoggerFactory.getLogger(MainController.class);
	
	@Autowired
	private MemberService memberService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		
		Member member = memberService.selectMemberWithAccountAndAuthName(new MemberAuth("kangkrkr", "ADMIN"));
		model.addAttribute("member", member);
		
		return "home";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		return "login/login";
	}
	
	@RequestMapping(value = "/login2", method = RequestMethod.GET)
	public String login2() {
		return "login/login2";
	}
}