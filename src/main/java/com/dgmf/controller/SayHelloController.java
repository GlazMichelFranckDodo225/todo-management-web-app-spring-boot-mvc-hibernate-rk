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
	
	// "say-hello-html" => "Hello ! What are you learning today ?"
	@RequestMapping("say-hello-html") // http://localhost:8080/say-hello
	@ResponseBody
	public String sayHelloHtml() {
		StringBuffer sb = new StringBuffer();
		sb.append("<!DOCTYPE html>");
		sb.append("<html lang=\"en\">");
		sb.append("<head>");
		sb.append("<meta charset=\"UTF-8\">");
		sb.append("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
		sb.append("<title>My First HTML Page - Changed</title>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append("My First HTML Page with Body - Changed.");
		sb.append("</body>");
		sb.append("</html>");
		
		return sb.toString();
	}
}
