package com.encar.blog.handler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.SimpleUrlLogoutSuccessHandler;

import com.encar.blog.domain.Member;
import com.encar.blog.mapper.MemberMapper;

public class LogoutSuccessHandler extends SimpleUrlLogoutSuccessHandler {

	private static Logger logger = LoggerFactory.getLogger(LogoutSuccessHandler.class);
	
	private MemberMapper memberMapper;
	

	@Override
	public void onLogoutSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {

		response.setContentType("application/json; charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		try {
			Member authenticatedMember = (Member)authentication.getPrincipal();
			logger.info("사용자 " + authenticatedMember.getAccount() +" 가 로그아웃을 시도합니다.");
			
			super.onLogoutSuccess(request, response, authentication);
		} catch(Exception e) {
			logger.error("로그아웃에 실패하였습니다.");
			
			response.getOutputStream().write("로그아웃에 실패하였습니다.".getBytes("UTF-8"));
		}
	}

	public void setMemberMapper(MemberMapper memberMapper) {
		this.memberMapper = memberMapper;
	}
	
}
