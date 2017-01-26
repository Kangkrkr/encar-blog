package com.encar.blog.mapper;

import com.encar.blog.domain.CmMap;

public interface AuthMapper {
	
	public CmMap selectAuthByAuthName(String authority);
	
}
