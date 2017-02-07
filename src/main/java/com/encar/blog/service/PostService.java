package com.encar.blog.service;

import java.util.List;

import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.encar.blog.domain.CmMap;

public interface PostService {
	
	public List<String> sortItems(MultipartHttpServletRequest req);
	
	public boolean write(MultipartHttpServletRequest req, CmMap currentMember, String subject);
	
}
