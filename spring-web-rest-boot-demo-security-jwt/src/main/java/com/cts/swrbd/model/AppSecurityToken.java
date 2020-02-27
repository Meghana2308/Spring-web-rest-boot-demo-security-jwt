package com.cts.swrbd.model;

import java.io.Serializable;

public class AppSecurityToken implements Serializable {
	private static final long serialVersionUID = -3645247583458346L;
	private final String jwttoken;
	
	public AppSecurityToken(String jwttoken) {
		this.jwttoken =jwttoken;
		
	}
	public String getToken() {
		return this.jwttoken;
	}
}
