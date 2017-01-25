package com.encar.blog.controller;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.encar.blog.domain.Member;
import com.encar.blog.security.SecurityPrincipalProvider;

@Controller
@RequestMapping(value="/posting")
public class PostController {

	private static final Logger logger = LoggerFactory.getLogger(PostController.class);
	
	@Autowired
	private SecurityPrincipalProvider principalProvider;
	
	@RequestMapping(value="/add-posting")
	public String addPosting(){
		return "posting/add-posting";
	}
	
	@RequestMapping(value="/upload", method=RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<?> upload(MultipartHttpServletRequest req) throws IOException {
		Member authorizedMember = principalProvider.getMember();
		
		logger.info("member info : " + authorizedMember.toString());
		
		return new ResponseEntity<String>("포스팅 업로드에 성공하였습니다.", HttpStatus.OK);
	}
}
