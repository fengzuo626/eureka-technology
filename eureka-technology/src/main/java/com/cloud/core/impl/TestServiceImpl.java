package com.cloud.core.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import com.cloud.core.TestService;
import com.cloud.dao.user.entity.SaasUser;
import com.cloud.dao.user.mapper.SaasUserMapper;

@Component
public class TestServiceImpl implements TestService{

	@Autowired
	private SaasUserMapper saasUserMapper;
	
	@Override
	public String test(Integer id) {
		if(ObjectUtils.isEmpty(id)) {
			return "id is null";
		}else {
			SaasUser user = saasUserMapper.selectByPrimaryKey(id);
			if(ObjectUtils.isEmpty(user)) {
				return "hello testService";
			}else {
				return "userName:" + user.getUserName();
			}
		}
	}

}
