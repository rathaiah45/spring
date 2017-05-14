package com.cts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cts.command.RestCommand;
import com.cts.form.User;
import com.cts.util.EmployeeUtil;

@RestController
public class SpringRestClient {

	@Autowired
	public EmployeeUtil employeeUtil;

	@RequestMapping(value = "/get-user-details/{id}", method = RequestMethod.GET)
	public @ResponseBody User getuser(@PathVariable("id") Integer id) {
		RestTemplate restTemplate = new RestTemplate();
		HttpEntity<String> request = new HttpEntity<String>(RestCommand.getHeaders());
		ResponseEntity<User> response = restTemplate.exchange(employeeUtil.getGetUserId(), HttpMethod.GET, request,
				User.class, id);
		User user = response.getBody();
		return user;
	}
}
