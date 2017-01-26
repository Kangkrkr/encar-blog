package com.encar.blog.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.encar.blog.domain.CmMap;
import com.encar.blog.service.MemberService;

@Controller
@RequestMapping(value="/join")
public class JoinController {
	
	@Autowired
	private MemberService memberService;
	
	@RequestMapping(value="/join-process", method=RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<?> join(@ModelAttribute CmMap member){
		Set<String> keys = member.keySet();

		System.err.println("size ★★★★★★★★★★★★★★★★★★" + keys.size());
		
		for(String key : keys)
			System.err.println(key);
		
		try {
			memberService.insertMember(member);
			return new ResponseEntity<>("회원가입이 되었습니다.", HttpStatus.OK);
		} catch(Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>("회원가입에 실패하였습니다.", HttpStatus.BAD_REQUEST);
		}
	}
	
}
