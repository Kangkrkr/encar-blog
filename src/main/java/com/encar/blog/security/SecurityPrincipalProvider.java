package com.encar.blog.security;

import org.springframework.security.authentication.AuthenticationServiceException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import com.encar.blog.domain.Member;

public class SecurityPrincipalProvider {
	
	private Member member = null;
	
	public Member getMember(){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		
		if(null == auth)
			throw new AuthenticationServiceException("인증되지 않은 사용자입니다.");
		else
			member = (Member)auth.getPrincipal();
		
		return member;
	}
}
