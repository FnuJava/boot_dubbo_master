package com.boot.dubbo.entity;

import java.io.Serializable;



public class Param extends BaseEntity implements Serializable{

	private static final long serialVersionUID = 922446722292291016L;

	private String paramId;
	
	private String name;
	
	private String value;

	public String getParamId( ) {
		return paramId;
	}

	public void setParamId( String paramId ) {
		this.paramId = paramId;
	}

	public String getName( ) {
		return name;
	}

	public void setName( String name ) {
		this.name = name;
	}

	public String getValue( ) {
		return value;
	}

	public void setValue( String value ) {
		this.value = value;
	}
	
	
	
}
