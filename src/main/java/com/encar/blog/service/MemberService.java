package com.encar.blog.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.encar.blog.domain.CmMap;
import com.encar.blog.mapper.AuthMapper;
import com.encar.blog.mapper.MemberMapper;

// MemberMapper 인터페이스는 xml 매퍼 파일과 연결되어 DAO의 역할을 한다.
// 단순히 아래 서비스는 MemberMapper 인터페이스의 추상메소드들을 구현하는 역할이다.
@Service
@Transactional
public class MemberService implements MemberMapper {

	private static Logger logger = LoggerFactory.getLogger(MemberService.class);
	
	@Autowired
	private MemberMapper memberMapper;
	
	@Autowired
	private AuthMapper authMapper;
	
	@Transactional(readOnly=true)
	@Override
	public CmMap selectMemberByAccount(String account) {
		
		CmMap member = memberMapper.selectMemberByAccount(account);
		
		return member;
	}
	
	// 회원가입시 기본 권한은 USER
	@Override
	public void insertMember(CmMap member) {
		// logger.info("Before Insert memberId : " + member.getMemberId()); (매퍼 xml에서 member 객체에시퀀스가 삽입되기 전.)
		
		memberMapper.insertMember(member);
		CmMap userAuth = authMapper.selectAuthByAuthName("USER");
		
		CmMap params = new CmMap();
		params.put("memberId", member.getLong("memberId"));
		params.put("authId", userAuth.getLong("authId"));
		
		insertMemberAuth(params);
		// logger.info("After Insert memberId : " + member.getMemberId()); (매퍼 xml에서 member 객체에시퀀스가 삽입된 후.)
	}

	@Override
	public void insertMemberAuth(CmMap params) {
		memberMapper.insertMemberAuth(params);
	}

}
