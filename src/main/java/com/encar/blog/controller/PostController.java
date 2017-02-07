package com.encar.blog.controller;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.encar.blog.domain.CmMap;
import com.encar.blog.mapper.SubjectMapper;
import com.encar.blog.security.SecurityPrincipalProvider;
import com.encar.blog.service.PostService;

@Controller
@RequestMapping(value="/posting")
public class PostController {

	private static final Logger logger = LoggerFactory.getLogger(PostController.class);
	
	@Autowired
	private SecurityPrincipalProvider principalProvider;
	
	@Autowired
	private PostService postService;
	
	@Autowired
	private SubjectMapper subjectMapper;
	
	
	
	@RequestMapping(value="/{subject}")
	public ResponseEntity<?> getPosting(@PathVariable("subject") String subject) {
		
		logger.info(subject +" : " + subjectMapper.selectSubject(subject).toString());
		
		return new ResponseEntity<CmMap>(subjectMapper.selectSubject(subject), HttpStatus.OK);
	}
	
	@RequestMapping(value="/add-posting/{subject}")
	public String addPosting(@PathVariable("subject") String subject, @ModelAttribute("reqVO") CmMap reqVO){
		reqVO.put("subject", subject);
		
		return "posting/add-posting";
	}
	
	@RequestMapping(value="/upload/{subject}", method=RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<?> upload(@PathVariable("subject") String subject, MultipartHttpServletRequest req) throws IOException {
		CmMap authorizedMember = principalProvider.getAuthorizedMember();
		
		//logger.info("member info : " + authorizedMember.toString());
		//logger.info("item list : " + postService.sortItems(req));
		//logger.error("subject : " + subject);
		
		postService.write(req, authorizedMember, subject);
		
		return new ResponseEntity<String>("포스팅 업로드에 성공하였습니다.", HttpStatus.OK);
	}
}
