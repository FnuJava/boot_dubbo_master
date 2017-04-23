package com.boot.dubbo.entity;

import java.io.Serializable;


public class RoleMenu extends BaseEntity implements Serializable{
	private static final long serialVersionUID = 3055368754757987269L;

	private String roleId;
	
	private String menuId;
	
	public String getRoleId( ) {
		return roleId;
	}

	public void setRoleId( String roleId ) {
		this.roleId = roleId;
	}

	public String getMenuId( ) {
		return menuId;
	}

	public void setMenuId( String menuId ) {
		this.menuId = menuId;
	}
}
