package com.encar.blog.mapper;

import java.util.List;

import com.encar.blog.domain.Auth;
import com.encar.blog.domain.CmMap;
import com.encar.blog.domain.Member;

public interface MemberMapper {
	
	public List<Member> selectMember();
	
	public Member selectMemberByAccount(String account);
	
	public List<Auth> selectAuthListByMemberId(Long memberId);
	
	public void insertMember(Member member);
	
	public void insertMemberAuth(CmMap params);
}
