package com.encar.blog.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.encar.blog.domain.Auth;
import com.encar.blog.domain.CmMap;
import com.encar.blog.domain.Member;
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
	public List<Member> selectMember() {
		return memberMapper.selectMember();
	}
	
	@Transactional(readOnly=true)
	@Override
	public Member selectMemberByAccount(String account) {
		return memberMapper.selectMemberByAccount(account);
	}

	@Transactional(readOnly=true)
	@Override
	public List<Auth> selectAuthListByMemberId(Long memberId) {
		return memberMapper.selectAuthListByMemberId(memberId);
	}

	// 회원가입시 기본 권한은 USER
	@Override
	public void insertMember(Member member) {
		// logger.info("Before Insert memberId : " + member.getMemberId()); (매퍼 xml에서 member 객체에시퀀스가 삽입되기 전.)
		
		memberMapper.insertMember(member);
		Auth userAuth = authMapper.selectAuthByAuthName("USER");
		
		CmMap params = new CmMap();
		params.put("memberId", member.getMemberId());
		params.put("authId", userAuth.getAuthId());
		
		insertMemberAuth(params);
		// logger.info("After Insert memberId : " + member.getMemberId()); (매퍼 xml에서 member 객체에시퀀스가 삽입된 후.)
	}

	@Override
	public void insertMemberAuth(CmMap params) {
		memberMapper.insertMemberAuth(params);
	}

}
