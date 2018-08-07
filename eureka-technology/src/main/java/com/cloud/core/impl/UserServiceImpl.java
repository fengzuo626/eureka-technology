package com.cloud.core.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cloud.core.UserService;
import com.cloud.dao.user.entity.SaasUser;
import com.cloud.dao.user.mapper.SaasUserMapper;

@Component
public class UserServiceImpl implements UserService{

	@Autowired
	private SaasUserMapper saasUserMapper;
	
	@Override
	public Integer insertUser(SaasUser user) {
		return saasUserMapper.insert(user);
	}

	@Override
	public Integer deleteById(Integer id) {
		return saasUserMapper.deleteByPrimaryKey(id);
	}

	@Override
	public Integer updateUser(SaasUser user) {
		return saasUserMapper.updateByPrimaryKey(user);
	}

	@Override
	public SaasUser findByid(Integer id) {
		return saasUserMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<SaasUser> findUsers() {
		// TODO Auto-generated method stub
		return null;
	}

}
