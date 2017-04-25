package com.boot.dubbo.provider.service.impl;

import java.util.List;

import com.boot.dubbo.common.mybatis.ParamFilter;
import com.boot.dubbo.entity.Role;
import com.boot.dubbo.entity.SysRole;
import com.boot.dubbo.provider.mapper.SysRoleMapper;
import com.boot.dubbo.service.ISysRoleService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;

import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色表 服务实现类
 * </p>
 *
 * @author Reggie
 * @since 2017-04-24
 */
@Service
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper, SysRole> implements ISysRoleService {

	@Override
	public void add(Role role) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(List<String> roleIds) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Role role) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Role> getList(ParamFilter param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Role getByRoleId(String roleId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List getRoleMap() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
