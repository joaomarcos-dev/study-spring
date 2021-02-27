package com.jodev.spring.springmvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jodev.spring.springmvc.config.LogNdc;

@Controller
@RequestMapping("/registration01")
public class Controller01 {
	
	@Autowired
	//This bean/dependency will be obtained from the root application context
	Service01 service01;
	
	//relative to the DispatcherServlet path
	@RequestMapping("/reg")
	public String getReport() {
		LogNdc.log();
		return "home";
	}
	
	//relative to the DispatcherServlet path
	@RequestMapping("/info")
	@ResponseBody
	public String getInfo() {
		LogNdc.log();
		return service01.getInfo();
	}

	public Controller01() {
		super();
		LogNdc.log();
	}
	
	
}

