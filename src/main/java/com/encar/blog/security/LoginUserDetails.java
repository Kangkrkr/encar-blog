//package com.encar.blog.security;
//
//import org.springframework.security.core.userdetails.User;
//
//import com.encar.blog.domain.Member;
//
//public class LoginUserDetails extends User {
//
//	private static final long serialVersionUID = -3541063887975984911L;
//	private Member member = null;
//	
//	public LoginUserDetails(Member member) {
//		super(member.getEmail(), member.getPassword(), true, true, true, true, member.getAuths());
//		System.err.println("LoginUserDetatils 까지 넘어왔다!");
//		this.member = member;
//	}
//
//	public Member getMember() {
//		return member;
//	}
//
//	public void setMember(Member member) {
//		this.member = member;
//	}
//	
//}
