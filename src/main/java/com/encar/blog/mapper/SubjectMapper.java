package com.encar.blog.mapper;

import java.util.List;

import com.encar.blog.domain.CmMap;


public interface SubjectMapper {

	public Long selectSubjectIdByName(String subjectName);
	
	public List<CmMap> selectSubjectName();
	
	public CmMap selectSubject(String subjectName);
	
}
