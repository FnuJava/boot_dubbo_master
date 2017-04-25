package com.boot.dubbo.service;

import com.boot.dubbo.entity.SysMenu;
import com.boot.dubbo.entity.User;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 * 资源表 服务类
 * </p>
 *
 * @author Reggie
 * @since 2017-04-24
 */
public interface ISysMenuService extends IService<SysMenu> {
	User doLogin(String account, String clientIp);
}
