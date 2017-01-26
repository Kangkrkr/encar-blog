package com.encar.blog.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.encar.blog.domain.CmMap;
import com.encar.blog.mapper.AuthMapper;

@Service
@Transactional
public class AuthService implements AuthMapper {

	private static Logger logger = LoggerFactory.getLogger(AuthService.class);
	
	@Autowired
	private AuthMapper authMapper;

	@Transactional(readOnly=true)
	@Override
	public CmMap selectAuthByAuthName(String authority) {
		logger.info("조회대상 권한 : " + authority);
		return authMapper.selectAuthByAuthName(authority);
	}

}
