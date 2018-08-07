package com.cloud.core;

import java.util.List;

import com.cloud.dao.user.entity.SaasUser;

public interface UserService {

	public Integer insertUser(SaasUser user);
	
	public Integer deleteById(Integer id);
	
	public Integer updateUser(SaasUser user);
	
	public SaasUser findByid(Integer id);
	
	public List<SaasUser> findUsers();
}
