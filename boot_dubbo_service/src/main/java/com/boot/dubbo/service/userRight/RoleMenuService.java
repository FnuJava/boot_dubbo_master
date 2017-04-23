package com.boot.dubbo.service.userRight;



import java.util.List;

import com.boot.dubbo.entity.RoleMenu;

public interface RoleMenuService {

    List<RoleMenu> getList(String roleId);

    void update(String roleId, String[] menuIds);

	List<String> getMenuByRole(String roleId);
}
