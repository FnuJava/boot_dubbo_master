package com.boot.dubbo.service.userRight;


import java.util.List;

import com.boot.dubbo.entity.UserRole;

public interface UserRoleService {

    List<UserRole> getListByUserId(String userId);

    List<String> getRoleIdsByUserId(String userId);

    void add(String[] roleIds,String userId);
}
