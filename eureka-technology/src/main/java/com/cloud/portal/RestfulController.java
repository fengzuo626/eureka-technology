package com.cloud.portal;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.base.common.vo.CommonVO;
import com.cloud.dao.user.entity.SaasUser;
import com.cloud.facade.UserFacade;

@RestController
@RequestMapping(value = "restful")
@CrossOrigin
public class RestfulController {
	
	@Autowired
	private UserFacade userFacade;
	
	// 插入
	@PostMapping
	public CommonVO insertUser(@RequestBody SaasUser user) {
		CommonVO vo = new CommonVO();
		return vo;
	}
	
	// 删除
	@DeleteMapping("/{id}")
	public CommonVO deleteUser(@PathVariable(value = "id",required = true)String id) {
		CommonVO vo = new CommonVO();
		return vo;
	}
	
	// 获取列表，必须在getMapping{id}前面，否则被拦截
	@GetMapping
	public CommonVO listUser(
			@RequestParam(value = "name",required = false)String name,
			@RequestParam(value = "pageNo",required = false)String pageNo,
			@RequestParam(value = "pageSize",required = false)String pageSize) {
		CommonVO vo = new CommonVO();
		return vo;
	}
	
	// 详情
	@GetMapping("{id}")
    public CommonVO getUser(@PathVariable(value = "id",required = true)Integer id) {
		CommonVO vo = new CommonVO();
		Map<String, Object> data = userFacade.findByid(id);
		vo.setData(data);
		vo.setCode(200);
		vo.setMessage("查询成功");
		return vo;
	}
	
	@GetMapping("/findByID")
	public CommonVO test(@RequestParam (value = "id",required = true)Integer id) {
		CommonVO vo = new CommonVO();
		Map<String, Object> data = userFacade.findByid(id);
		vo.setData(data);
		vo.setCode(200);
		vo.setMessage("查询成功");
		return vo;
	}
	
	// 修改
	@PutMapping()
	public CommonVO updateUser(
			@PathVariable(value = "id",required = true)String id,
			@RequestBody SaasUser user) {
		CommonVO vo = new CommonVO();
		return vo;
	}

}
