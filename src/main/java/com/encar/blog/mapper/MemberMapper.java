package com.encar.blog.mapper;

import java.util.List;

import com.encar.blog.domain.Auth;
import com.encar.blog.domain.CmMap;
import com.encar.blog.domain.Member;

public interface MemberMapper {
	
	public List<CmMap> selectMember();
	
	public Member selectMemberByAccount(String account);
	
	//public Member selectMemberWithAccount2();
	
	public List<Auth> selectAuthListByMemberId(Long memberId);
}
