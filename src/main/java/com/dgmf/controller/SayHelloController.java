package com.dgmf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
	// "say-hello" => "Hello ! What are you learning today ?"
	@RequestMapping("say-hello") // http://localhost:8080/say-hello
	@ResponseBody
	public String sayHello() {
		return "Hello ! What are you learning today ?";
	}
}
