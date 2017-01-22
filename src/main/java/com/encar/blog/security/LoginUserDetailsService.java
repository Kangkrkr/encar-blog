//package com.encar.blog.security;
//
//import java.util.List;
//
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import com.encar.blog.domain.Member;
//import com.encar.blog.service.MemberService;
//
//@Service
//@Transactional
//public class LoginUserDetailsService implements UserDetailsService {
//
//	private MemberService memberService;
//	
//	@Transactional(readOnly=true)
//	@Override
//	public UserDetails loadUserByUsername(String account) throws UsernameNotFoundException {
//		if(memberService == null)
//			System.err.println("memberService 가 null임..");
//		else
//			System.err.println("memberService 가 null은 아님..");
//		
//		System.err.println("loadUserByUsername : " + account);
//		
//		List<Member> members = memberService.selectMember();
//		if(members == null)
//			System.err.println("members가 null 입니다.");
//		else
//			System.err.println("members가 null 은 아닌데...");
//		
//		System.err.println(members.get(0).getAccount());
//		
//		return new LoginUserDetails(members.get(0));
//	}
//
//	public void setMemberService(MemberService memberService) {
//		this.memberService = memberService;
//	}
//
//}
