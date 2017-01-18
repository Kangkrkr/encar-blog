package com.encar.blog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.encar.blog.mapper.MemberMapper;

@Transactional
@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberMapper memberMapper;
	
	@Transactional(readOnly=true)
	@Override
	public Integer selectMember() {
		return memberMapper.selectMember();
	}

	/*
	@Transactional(readOnly=true)
	@Override
	public Member selectMemberWithAccountAndAuthName(MemberAuth ma) {
		return (Member) session.selectOne("selectMemberWithAccountAndAuthName", ma);
	}
	*/
}
