package com.encar.blog.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.encar.blog.domain.Member;
import com.encar.blog.mapper.MemberMapper;

@Service
@Transactional
public class LoginUserDetailsService implements UserDetailsService {

	@Autowired
	private MemberMapper memberMapper;
	
	@Transactional(readOnly=true)
	@Override
	public UserDetails loadUserByUsername(String account) throws UsernameNotFoundException {
		Member member = memberMapper.selectMemberByAccount(account);
		return new LoginUserDetails(member);
	}

	/*
	public void setMemberService(MemberMapper memberMapper) {
		this.memberMapper = memberMapper;
	}
	*/

}
