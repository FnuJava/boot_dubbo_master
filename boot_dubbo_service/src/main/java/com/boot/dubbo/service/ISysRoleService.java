package com.boot.dubbo.service;

import java.util.List;

import com.boot.dubbo.common.mybatis.ParamFilter;
import com.boot.dubbo.entity.Role;
import com.boot.dubbo.entity.SysRole;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 * 角色表 服务类
 * </p>
 *
 * @author Reggie
 * @since 2017-04-24
 */
public interface ISysRoleService extends IService<SysRole> {
   
	void add(Role role);

    void delete(List<String> roleIds);

    void update(Role role);

    List<Role> getList(ParamFilter param);

    Role getByRoleId(String roleId);

    List getRoleMap();
}
