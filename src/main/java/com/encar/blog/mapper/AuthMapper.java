package com.encar.blog.mapper;

import com.encar.blog.domain.Auth;

public interface AuthMapper {
	
	public Auth selectAuthByAuthName(String authority);
	
}
