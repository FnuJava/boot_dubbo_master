package com.boot.dubbo.entity;

import java.io.Serializable;
		
public class UserRole extends BaseEntity implements Serializable{
	private static final long serialVersionUID = 267861377230595751L;

	private String userId;
	
	private String roleId;

	public String getUserId( ) {
		return userId;
	}

	public void setUserId( String userId ) {
		this.userId = userId;
	}

	public String getRoleId( ) {
		return roleId;
	}

	public void setRoleId( String roleId ) {
		this.roleId = roleId;
	}
	
}
