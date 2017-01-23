package com.encar.blog.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.encar.blog.domain.Auth;
import com.encar.blog.domain.CmMap;
import com.encar.blog.domain.Member;
import com.encar.blog.mapper.MemberMapper;

@Transactional
public class MemberService implements MemberMapper {

	private static Logger logger = LoggerFactory.getLogger(MemberService.class);
	
	@Autowired
	private MemberMapper memberMapper;
	
	@Transactional(readOnly=true)
	@Override
	public List<CmMap> selectMember() {
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

}
