package com.encar.blog;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.encar.blog.domain.Member;
import com.encar.blog.service.MemberService;

@Controller
public class MainController {
	
	private static final Logger logger = LoggerFactory.getLogger(MainController.class);
	
	@Autowired
	private MemberService memberService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		if(memberService == null) {
			System.err.println("memberSerivice 가 또 null");
		}else {
			System.err.println("memberSerivice 가 또 null은 아니구려");
		}
		
		List<Member> members = memberService.selectMember();
		for(Member m : members)
			System.err.println(m.getAccount());
		
		return "home";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		return "login/login";
	}
	
	@RequestMapping(value = "/posting", method = RequestMethod.GET)
	public String posting() {
		return "posting/posting";
	}
	
	@RequestMapping(value = "/guest-book", method = RequestMethod.GET)
	public String guestBook() {
		return "guest-book/guest-book";
	}
}
