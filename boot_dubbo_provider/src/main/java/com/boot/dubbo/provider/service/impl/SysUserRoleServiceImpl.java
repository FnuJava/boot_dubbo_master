package com.boot.dubbo.provider.service.impl;

import java.util.List;

import com.boot.dubbo.entity.SysUserRole;
import com.boot.dubbo.entity.UserRole;
import com.boot.dubbo.provider.mapper.SysUserRoleMapper;
import com.boot.dubbo.service.ISysUserRoleService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;

import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户-角色表 服务实现类
 * </p>
 *
 * @author Reggie
 * @since 2017-04-24
 */
@Service
public class SysUserRoleServiceImpl extends ServiceImpl<SysUserRoleMapper, SysUserRole> implements ISysUserRoleService {

	@Override
	public List<UserRole> getListByUserId(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getRoleIdsByUserId(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(String[] roleIds, String userId) {
		// TODO Auto-generated method stub
		
	}
	
}
