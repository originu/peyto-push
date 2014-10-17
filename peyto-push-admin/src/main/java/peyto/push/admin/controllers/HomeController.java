package peyto.push.admin.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	@RequestMapping( value="/", method = RequestMethod.GET )
	public String home() {
		return "index";
	}
	
	@RequestMapping( value="/main", method = RequestMethod.GET )
	public String main() {
		return "main/main";
	}

	@RequestMapping( value="/login", method = RequestMethod.GET )
	public String login() {
		return "login/login";
	}
}