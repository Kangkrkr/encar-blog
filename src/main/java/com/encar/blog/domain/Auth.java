package com.encar.blog.domain;

//import org.springframework.security.core.GrantedAuthority;

public class Auth {
	
	private Long authId;
	private String authName;
	
	public Auth(){}
	
	public Auth(Long authId, String authName) {
		this.authId = authId;
		this.authName = authName;
	}

	public Long getAuthId() {
		return authId;
	}

	public void setAuthId(Long authId) {
		this.authId = authId;
	}

	public String getAuthName() {
		return authName;
	}

	public void setAuthName(String authName) {
		this.authName = authName;
	}
	
}
