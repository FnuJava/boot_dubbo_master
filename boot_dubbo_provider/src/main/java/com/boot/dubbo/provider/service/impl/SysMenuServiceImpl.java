package com.boot.dubbo.provider.service.impl;

import com.boot.dubbo.entity.SysMenu;
import com.boot.dubbo.entity.User;
import com.boot.dubbo.provider.mapper.SysMenuMapper;
import com.boot.dubbo.service.ISysMenuService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;

import org.springframework.stereotype.Service;

/**
 * <p>
 * 资源表 服务实现类
 * </p>
 *
 * @author Reggie
 * @since 2017-04-24
 */
@Service
public class SysMenuServiceImpl extends ServiceImpl<SysMenuMapper, SysMenu> implements ISysMenuService {

	@Override
	public User doLogin(String account, String clientIp) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
