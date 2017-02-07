package com.encar.blog.service;

import java.nio.file.Path;

import org.springframework.web.multipart.MultipartHttpServletRequest;

public interface FileService {
	
	public String store(MultipartHttpServletRequest req, Path storePath, String name);
	
}
