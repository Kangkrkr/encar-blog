package com.encar.blog.domain;

public class MemberAuth {

	private String account;
	private String authName;
	
	public MemberAuth(){}

	public MemberAuth(String account, String authName) {
		this.account = account;
		this.authName = authName;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getAuthName() {
		return authName;
	}

	public void setAuthName(String authName) {
		this.authName = authName;
	}
	
}
