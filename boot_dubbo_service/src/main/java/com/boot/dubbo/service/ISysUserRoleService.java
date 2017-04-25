package com.boot.dubbo.service;

import java.util.List;

import com.boot.dubbo.entity.SysUserRole;
import com.boot.dubbo.entity.UserRole;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 * 用户-角色表 服务类
 * </p>
 *
 * @author Reggie
 * @since 2017-04-24
 */
public interface ISysUserRoleService extends IService<SysUserRole> {

    List<UserRole> getListByUserId(String userId);

    List<String> getRoleIdsByUserId(String userId);

    void add(String[] roleIds,String userId);
}
