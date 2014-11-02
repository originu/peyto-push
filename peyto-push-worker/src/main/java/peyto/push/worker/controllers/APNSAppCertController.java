package peyto.push.worker.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import peyto.push.dto.PushAPNSCertDTO;
import peyto.push.service.api.PushAPNSCertsService;

@RestController
public class APNSAppCertController {

	@Autowired
	private PushAPNSCertsService	service;
	
	@RequestMapping( value = "/apns", method=RequestMethod.POST )
	public void add(@RequestBody PushAPNSCertDTO cert) {
		service.add( cert );
	}

	@RequestMapping( value = "/apns/{apnsCertId}", method=RequestMethod.DELETE )
	public void deleteByApnsCertId(int apnsCertId) {
		service.deleteByApnsCertId( apnsCertId );
	}

	
	
}
