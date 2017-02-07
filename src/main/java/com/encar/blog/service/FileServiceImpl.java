package com.encar.blog.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@Service
public class FileServiceImpl implements FileService {

	@Override
	public String store(MultipartHttpServletRequest req, Path storePath, String name) {
		
		String orgfName = req.getFile(name).getOriginalFilename();
		int lastIdx = orgfName.lastIndexOf('.');
		
		StringBuilder builder = new StringBuilder(orgfName.substring(0, lastIdx));
		builder
			.append('-')
			.append(System.currentTimeMillis())
			.append(orgfName.substring(lastIdx));
		
		try {
			Files.copy(req.getFile(name).getInputStream(), storePath.resolve(builder.toString()));
			
			return builder.toString();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return null;
	}

}
