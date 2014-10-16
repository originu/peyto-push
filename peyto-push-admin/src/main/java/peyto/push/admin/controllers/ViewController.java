package peyto.push.admin.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//@Controller
public class ViewController {

	@RequestMapping( value="/", method = RequestMethod.GET )
	public String viewLogin() {	
		return "app.view.login";
	}
	
	@RequestMapping( value="/dashboard/view", method = RequestMethod.GET )
	public String viewDashboard() {
		return "app.view.dashboard";
	}

	@RequestMapping( value="/pushnotification/view", method = RequestMethod.GET )
	public String viewPushNotification() {
		return "app.view.push_notification";
	}

	@RequestMapping( value="/pushrecord/view", method = RequestMethod.GET )
	public String viewPushRecord() {
		return "app.view.push_record";
	}

	@RequestMapping( value="/pushgroups/view", method = RequestMethod.GET )
	public String viewPushGroups() {
		return "app.view.push_groups";
	}
	
	@RequestMapping( value="/pushkeys/view", method = RequestMethod.GET )
	public String viewPushkeys() {
		return "app.view.push_keys";
	}

	@RequestMapping( value="/applications/view", method = RequestMethod.GET )
	public String viewApplications() {
		return "app.view.applications";
	}
	
}