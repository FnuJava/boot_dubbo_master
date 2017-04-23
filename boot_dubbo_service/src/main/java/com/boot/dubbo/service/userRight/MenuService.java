package com.boot.dubbo.service.userRight;


import java.util.List;

import com.boot.dubbo.common.core.Response;
import com.boot.dubbo.common.mybatis.ParamFilter;
import com.boot.dubbo.entity.Menu;
import com.boot.dubbo.entity.pojo.MenuTitle;

public interface MenuService {

	void add(Menu menu);

	void delete(List<String> menuIds);

	void update(Menu menu);

	List<MenuTitle> getListByRoleId(String roleId);
	
	List<Menu> getList(ParamFilter param);

	List<Menu> getByParentId(String menuId);
	
	Response getResTree(String roleId);
	
	Response getSelectResTree();

	Menu detail(String menuId);

	Response getTree();

}
