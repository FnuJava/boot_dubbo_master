package com.boot.dubbo.provider.service.impl;

import java.util.List;
import java.util.Map;

import com.boot.dubbo.common.mybatis.ParamFilter;
import com.boot.dubbo.entity.SysUser;
import com.boot.dubbo.entity.User;
import com.boot.dubbo.provider.mapper.SysUserMapper;
import com.boot.dubbo.service.ISysUserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;

import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Reggie
 * @since 2017-04-24
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {

	@Override
	public List getList(ParamFilter param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateDefaultPwd(List<String> userIds) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updatePwd(String originPwd, String confirmPwd, String newPwd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(List<String> userIds) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Map getDetail(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getByUserId(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getPermission(String account) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
