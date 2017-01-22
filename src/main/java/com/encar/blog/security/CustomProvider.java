//package com.encar.blog.security;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.security.authentication.AuthenticationProvider;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.AuthenticationException;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Component;
//
//import com.encar.blog.domain.Auth;
//import com.encar.blog.domain.Member;
//import com.encar.blog.service.MemberService;
//
//@Component
//public class CustomProvider implements AuthenticationProvider, UserDetailsService {
//
//	private MemberService memberService;
//	
//	@Override
//	public Authentication authenticate(Authentication auth) throws AuthenticationException {
//		String name = auth.getName();
//		String password = auth.getCredentials().toString();
//		
//		System.err.println(name+" & "+password);
//		
//		return new UsernamePasswordAuthenticationToken(name, password);
//	}
//
//	@Override
//	public boolean supports(Class<?> clazz) {
//		// TODO Auto-generated method stub
//		return clazz.equals(UsernamePasswordAuthenticationToken.class);
//	}
//
//	@Override
//	public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
//		if(memberService == null)
//			System.err.println("memberService ∞° null");
//		else
//			System.err.println("memberService ∞° null¿∫ æ∆¥‘.");
//		
//		System.err.println("loadUserByUsername : " + name);
//		
//		Member member = memberService.selectMemberWithAccount2();
//		List<Auth> auths = new ArrayList<>();
//		
//		member.setAuths(auths);
//		
//		return new LoginUserDetails(memberService.selectMemberWithAccount2());
//	}
//
//	public void setMemberService(MemberService memberService) {
//		this.memberService = memberService;
//	}
//}
