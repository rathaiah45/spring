package com.cts.util;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class EmployeeUtil implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Value("${weblogic.user.get}")
	public String getUserId;
	@Value("${username}")
	public String username;
	@Value("${password}")
	public String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGetUserId() {
		return getUserId;
	}

	public void setGetUserId(String getUserId) {
		this.getUserId = getUserId;
	}

}
