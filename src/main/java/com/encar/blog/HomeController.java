package com.encar.blog;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.encar.blog.service.MemberService;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private MemberService memberService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		
		//Member member = template.selectOne("member.selectMemberWithAccountAndAuthName", new MemberAuth("kangkrkr", "ADMIN"));
		
//		if(member == null){
//			logger.error("member 객체가 null 입니다.");
//		}
		logger.info(".." + memberService.selectMember());
		
		return "home";
	}
	
}
