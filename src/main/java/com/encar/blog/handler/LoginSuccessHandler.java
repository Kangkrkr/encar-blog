package com.encar.blog.handler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import com.encar.blog.domain.CmMap;
import com.encar.blog.mapper.MemberMapper;

public class LoginSuccessHandler implements AuthenticationSuccessHandler {

	private static Logger logger = LoggerFactory.getLogger(LoginSuccessHandler.class);
	
	private MemberMapper memberMapper;
	
	@Override
	public void onAuthenticationSuccess(HttpServletRequest req, HttpServletResponse res, Authentication auth) throws IOException, ServletException {
		
		logger.info("account : " + req.getParameter("account"));
		logger.info("password : " + req.getParameter("password"));

		req.getSession().setMaxInactiveInterval(60 * 60);
		
		CmMap member = memberMapper.selectMemberByAccount(req.getParameter("account"));
		
		SecurityContextHolder.getContext().setAuthentication(new UsernamePasswordAuthenticationToken(member, null, member.getList("authories")));
		
		logger.info("인증 유저의 권한 정보 : " + member.getList("authories"));
		
		res.sendRedirect("/blog");
	}

	public void setMemberMapper(MemberMapper memberMapper) {
		this.memberMapper = memberMapper;
	}
	
}
