package com.cloud.facade;

import java.util.List;
import java.util.Map;

import com.cloud.dao.user.entity.SaasUser;

public interface UserFacade {

	public boolean insertUser(SaasUser user);
	
	public boolean deleteById(Integer id);
	
	public boolean updateUser(SaasUser user);
	
	public Map<String, Object> findByid(Integer id);
	
	public List<SaasUser> findUsers();
	
}
