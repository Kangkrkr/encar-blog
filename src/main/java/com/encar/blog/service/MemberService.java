package com.encar.blog.service;

import java.util.List;

import com.encar.blog.domain.Member;
import com.encar.blog.domain.MemberAuth;


public interface MemberService {
	
	public List<Member> selectMember();
	
	public Member selectMemberWithAccountAndAuthName(MemberAuth ma);
	
}
