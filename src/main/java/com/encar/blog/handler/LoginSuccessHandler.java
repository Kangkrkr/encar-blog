package com.encar.blog.handler;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import com.encar.blog.domain.Auth;
import com.encar.blog.domain.Member;
import com.encar.blog.mapper.MemberMapper;

public class LoginSuccessHandler implements AuthenticationSuccessHandler {

	private static Logger logger = LoggerFactory.getLogger(LoginSuccessHandler.class);
	
	private MemberMapper memberMapper;
	
	@Override
	public void onAuthenticationSuccess(HttpServletRequest req, HttpServletResponse res, Authentication auth) throws IOException, ServletException {
		
		logger.info("account : " + req.getParameter("account"));
		logger.info("password : " + req.getParameter("password"));

		req.getSession().setMaxInactiveInterval(60 * 60);
		
		Member member = memberMapper.selectMemberByAccount(req.getParameter("account"));
		List<Auth> authories = memberMapper.selectAuthListByMemberId(member.getMemberId());
		// 사용자 권한 임시 추가 (곧 제거될 코드임)
		Auth tempAuth = new Auth(new Long(1), "ADMIN");
		authories.add(tempAuth);
		
		member.setAuthories(authories);
		
		SecurityContextHolder.getContext().setAuthentication(new UsernamePasswordAuthenticationToken(member, null, member.getAuthories()));
		
		logger.info("account : " + req.getParameter("account") +" 가 인증에 성공하였습니다.");
		logger.info("해당 유저의 권한 목록 : " + member.getAuthories());
		
		res.sendRedirect("/blog");
	}

	public void setMemberMapper(MemberMapper memberMapper) {
		this.memberMapper = memberMapper;
	}
	
}
