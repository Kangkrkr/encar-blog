package com.encar.blog.service;

import java.util.List;

import org.springframework.web.multipart.MultipartHttpServletRequest;

public interface PostService {
	
	public List<String> sortItems(MultipartHttpServletRequest req);
	
}
