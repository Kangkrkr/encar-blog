package com.encar.blog.mapper;

import com.encar.blog.domain.CmMap;

public interface MemberMapper {
	public CmMap selectMemberByAccount(String account);
	
	public void insertMember(CmMap member);
	
	public void insertMemberAuth(CmMap params);
}
