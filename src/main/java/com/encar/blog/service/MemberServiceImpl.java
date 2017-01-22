package com.encar.blog.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.encar.blog.domain.Auth;
import com.encar.blog.domain.Member;

@Service
@Transactional
public class MemberServiceImpl implements MemberService {

	@Autowired
	private SqlSessionTemplate template;
	
	@SuppressWarnings("unchecked")
	@Transactional(readOnly=true)
	@Override
	public List<Member> selectMember() {
		return template.selectList("member.selectMember");
	}

	@Transactional(readOnly=true)
	@Override
	public Member selectMemberWithAccount(String account) {
		return template.selectOne("member.selectMemberWithAccount", account);
	}

	@Transactional(readOnly=true)
	@Override
	public Member selectMemberWithAccount2() {
		return template.selectOne("member.selectMemberWithAccount2");
	}

	@Override
	public List<Auth> selectAuthListByMemberId(Integer memberId) {
		if(template == null){
			System.err.println("template가 null임.");
		}else{
			System.err.println("template가 null은 아님.");
		}
		return template.selectList("member.selectAuthListByMemberId", memberId);
	}

}
