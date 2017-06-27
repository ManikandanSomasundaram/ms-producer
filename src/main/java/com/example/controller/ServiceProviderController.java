package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ServiceProviderController {

	@RequestMapping(value = {"/"},  method = {RequestMethod.GET})
	public List<String> getDetails(){
		List<String> list = new ArrayList<String>();
		list.add("Provider1");
		list.add("eruka-client1");
		return list;
	}
}
