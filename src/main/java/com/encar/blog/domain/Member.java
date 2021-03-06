package com.encar.blog.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"handler"})
public class Member implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long memberId;
	private String account;
	private String password;
	private String email;
	private String profilePic;
	private List<Auth> authories = new ArrayList<>();

	public Member() {}

	public Long getMemberId() {
		return memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getProfilePic() {
		return profilePic;
	}

	public void setProfilePic(String profilePic) {
		this.profilePic = profilePic;
	}

	public List<Auth> getAuthories() {
		return authories;
	}

	public void setAuthories(List<Auth> authories) {
		this.authories = authories;
	}

	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", account=" + account
				+ ", password=" + password + ", email=" + email
				+ ", profilePic=" + profilePic + ", authories=" + authories
				+ "]";
	}
}
