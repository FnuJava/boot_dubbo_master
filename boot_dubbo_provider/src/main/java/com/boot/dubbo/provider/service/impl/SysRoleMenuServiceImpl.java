package com.boot.dubbo.provider.service.impl;

import java.util.List;

import com.boot.dubbo.entity.RoleMenu;
import com.boot.dubbo.entity.SysRoleMenu;
import com.boot.dubbo.provider.mapper.SysRoleMenuMapper;
import com.boot.dubbo.service.ISysRoleMenuService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;

import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色-资源表 服务实现类
 * </p>
 *
 * @author Reggie
 * @since 2017-04-24
 */
@Service
public class SysRoleMenuServiceImpl extends ServiceImpl<SysRoleMenuMapper, SysRoleMenu> implements ISysRoleMenuService {

	@Override
	public List<RoleMenu> getList(String roleId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(String roleId, String[] menuIds) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<String> getMenuByRole(String roleId) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
