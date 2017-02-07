package com.encar.blog.mapper;

import java.util.List;

import com.encar.blog.domain.CmMap;

public interface PostMapper {
	
	public void insertPosting(CmMap posting);
	
	public List<CmMap> selectPostingBySubject(String subject);
	
}
