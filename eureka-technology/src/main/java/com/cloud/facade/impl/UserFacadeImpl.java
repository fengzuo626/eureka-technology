package com.cloud.facade.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.cloud.core.UserService;
import com.cloud.dao.user.entity.SaasUser;
import com.cloud.facade.UserFacade;

@Component
public class UserFacadeImpl implements UserFacade{

	@Autowired
	private UserService userService;
	
	@Override
	public boolean insertUser(SaasUser user) {
		Integer result = -1;
		try {
			result = userService.insertUser(user);
		} catch (Exception e) {
			// TODO: handle exception
		}
		Map<String, Object> map = new HashMap<>();
		if(result == 1) {
			map.put("result", true);
		}else {
			map.put("result", false);
		}
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteById(Integer id) {
		// TODO Auto-generated method stub
		Integer result = userService.deleteById(id);
		return false;
	}

	@Override
	public boolean updateUser(SaasUser user) {
		// TODO Auto-generated method stub
		Integer result = userService.updateUser(user);
		return false;
	}

	@Override
	public Map<String, Object> findByid(Integer id) {
		// TODO Auto-generated method stub
		SaasUser user = userService.findByid(id);
		Map<String, Object> map = new HashMap<>();
		map.put("result", user);
		return map;
	}

	@Override
	public List<SaasUser> findUsers() {
		// TODO Auto-generated method stub
		return null;
	}

}
