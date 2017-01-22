package com.encar.blog.service;

import java.util.List;

import com.encar.blog.domain.Auth;
import com.encar.blog.domain.Member;


public interface MemberService {
	
	public List<Member> selectMember();
	
	public Member selectMemberWithAccount(String account);
	
	public Member selectMemberWithAccount2();
	
	public List<Auth> selectAuthListByMemberId(Integer memberId);
}
