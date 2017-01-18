package com.encar.blog.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.encar.blog.domain.Member;
import com.encar.blog.domain.MemberAuth;

@Transactional
@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private SqlSessionTemplate template;
	
	@SuppressWarnings("unchecked")
	@Transactional(readOnly=true)
	@Override
	public List<Member> selectMember() {
		return (List<Member>) template.selectList("member.selectMember");
	}

	@Transactional(readOnly=true)
	@Override
	public Member selectMemberWithAccountAndAuthName(MemberAuth ma) {
		return (Member) template.selectOne("member.selectMemberWithAccountAndAuthName", ma);
	}
}
