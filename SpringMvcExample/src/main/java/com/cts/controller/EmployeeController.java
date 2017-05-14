package com.cts.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cts.util.EmployeeUtil;

@Controller
public class EmployeeController {

	/*@Autowired
	public EmployeeUtil employeeUtil;*/
	@RequestMapping(value="/login")
	public void getLogin(HttpServletRequest request,HttpServletResponse response)
	{
		
	}
}
