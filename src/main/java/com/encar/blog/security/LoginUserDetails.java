package com.encar.blog.security;

import org.springframework.security.core.userdetails.User;

import com.encar.blog.domain.Member;

public class LoginUserDetails extends User {

	private static final long serialVersionUID = 1L;
	
	private Member member = null;
	
	public LoginUserDetails(Member member) {
		super(member.getAccount(), member.getPassword(), member.getAuthories());
		this.member = member;
	}
 
	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}
	
}
