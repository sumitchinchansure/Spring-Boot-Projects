package io.human.topic;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller	
public class TemplateResolver {
	
	@RequestMapping("/hello")
	public String sayHello() {
		return "hello"; 
	}
	
	@RequestMapping("/welcome")
	public String sayWelcome() {
		return "welcomeForm"; 
	}

}
