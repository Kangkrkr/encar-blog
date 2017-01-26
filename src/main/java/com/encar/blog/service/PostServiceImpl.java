package com.encar.blog.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@Service
public class PostServiceImpl implements PostService {
	
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
	
}
