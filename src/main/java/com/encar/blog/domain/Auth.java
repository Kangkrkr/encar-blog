package com.encar.blog.domain;

import java.io.Serializable;

import org.springframework.security.core.GrantedAuthority;


public class Auth implements Serializable, GrantedAuthority {
	
	private static final long serialVersionUID = 1L;
	
	private Long authId;
	private String authority;
	
	public Auth(){}
	
	public Auth(Long authId, String authority) {
		this.authId = authId;
		this.authority = authority;
	}

	public Long getAuthId() {
		return authId;
	}

	public void setAuthId(Long authId) {
		this.authId = authId;
	}
	
	public void setAuthority(String authority) {
		this.authority = authority;
	}

	@Override
	public String getAuthority() {
		return this.authority;
	}

	@Override
	public String toString() {
		return "Auth [authority=" + authority + "]";
	}
	
}
