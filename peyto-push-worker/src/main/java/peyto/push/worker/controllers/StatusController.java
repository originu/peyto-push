package peyto.push.worker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StatusController {
	
	@RequestMapping( value="/status", method = RequestMethod.GET )
	public String status() {
		return "status";
	}
	
}
