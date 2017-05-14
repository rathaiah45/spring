package com.cts.command;

import java.io.Serializable;
import java.util.Arrays;

import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;

import com.cts.util.EmployeeUtil;

@Component
public class RestCommand implements Serializable {

	@Autowired
	public static EmployeeUtil employeeUtil;

	public static HttpHeaders getHeaders() {
		String credentials = employeeUtil.getUsername() + ":" + employeeUtil.getPassword();
		HttpHeaders headers = new HttpHeaders();
		String base64Credentials = new String(Base64.encodeBase64(credentials.getBytes()));
		headers.add("Authorization", "Basic " + base64Credentials);
    	headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
    	return headers;
	}
}
