package com.boot.dubbo.service.userRight;



import java.util.List;

import com.boot.dubbo.common.mybatis.ParamFilter;
import com.boot.dubbo.entity.Role;

public interface RoleService{

    void add(Role role);

    void delete(List<String> roleIds);

    void update(Role role);

    List<Role> getList(ParamFilter param);

    Role getByRoleId(String roleId);

    List getRoleMap();
}
