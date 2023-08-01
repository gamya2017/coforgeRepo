package com.coforge.mypkg.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@RequestMapping(value = "/hello")
	public String hello() {
		return "Hai all well come to java world";
	}

}
