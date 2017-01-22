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
//			System.err.println("memberService �� null��..");
//		else
//			System.err.println("memberService �� null�� �ƴ�..");
//		
//		System.err.println("loadUserByUsername : " + account);
//		
//		List<Member> members = memberService.selectMember();
//		if(members == null)
//			System.err.println("members�� null �Դϴ�.");
//		else
//			System.err.println("members�� null �� �ƴѵ�...");
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
