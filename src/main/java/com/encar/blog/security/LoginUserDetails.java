package com.encar.blog.security;

import org.springframework.security.core.userdetails.User;

import com.encar.blog.domain.CmMap;

public class LoginUserDetails extends User {

	private static final long serialVersionUID = 1L;
	
	private CmMap member = null;
	
	public LoginUserDetails(CmMap member) {
		super(member.getString("account"), member.getString("password"), member.getList("authories"));
		this.member = member;
	}
 
	public CmMap getMember() {
		return member;
	}

	public void setMember(CmMap member) {
		this.member = member;
	}
	
}
