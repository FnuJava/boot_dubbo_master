package com.boot.dubbo.service;

import java.util.List;

import com.boot.dubbo.entity.RoleMenu;
import com.boot.dubbo.entity.SysRoleMenu;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 * 角色-资源表 服务类
 * </p>
 *
 * @author Reggie
 * @since 2017-04-24
 */
public interface ISysRoleMenuService extends IService<SysRoleMenu> {
    List<RoleMenu> getList(String roleId);

    void update(String roleId, String[] menuIds);

	List<String> getMenuByRole(String roleId);
}
