package com.encar.blog.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.encar.blog.domain.CmMap;
import com.encar.blog.mapper.PostMapper;
import com.encar.blog.mapper.SubjectMapper;

@Service
public class PostServiceImpl implements PostService {
	
	// upload.uploadDir
	@Value("#{props['upload.uploadDir']}")
	private String rootPath;
	
	
	@Autowired
	private PostMapper postMapper;
	
	@Autowired
	private SubjectMapper subjectMapper;
	
	@Override
	public List<String> sortItems(MultipartHttpServletRequest req) {
		List<String> nameList = new ArrayList<>();
		
		Enumeration<String> names = req.getParameterNames();
		Iterator<String> it = req.getFileNames();
		
		while(names.hasMoreElements()) nameList.add(names.nextElement());
		while(it.hasNext()) nameList.add(it.next());
			
		Collections.sort(nameList, new Comparator<String>(){
			@Override
			public int compare(String left, String right) {
				return left.split("-")[1].compareTo(right.split("-")[1]);
			}
		});
		
		return nameList;
	}

	@Override
	public boolean write(MultipartHttpServletRequest req, CmMap currentMember, String subject) {
		
		try {
			Path storePath = Paths.get(rootPath + currentMember.getString("account"));
			
			if(!Files.exists(storePath))
				Files.createDirectory(storePath);
			
			List<String> items = this.sortItems(req);
			String title = req.getParameter(items.get(0));

			CmMap posting = new CmMap();
			
			posting.put("title", title);
			posting.put("subjectId", subjectMapper.selectSubjectIdByName(subject));
			posting.put("poster", currentMember.getLong("memberId"));
			posting.put("likeCount", 0);
			
			postMapper.insertPosting(posting);
			
			return true;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}
	
}
