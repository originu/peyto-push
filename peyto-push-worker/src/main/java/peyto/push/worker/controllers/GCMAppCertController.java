package peyto.push.worker.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import peyto.push.dto.PushGCMCertDTO;
import peyto.push.service.api.PushGCMCertsService;

@RestController
public class GCMAppCertController {

	@Autowired
	private PushGCMCertsService	service;
	
	@RequestMapping( value = "/gcm", method=RequestMethod.POST )
	public void add( @RequestBody PushGCMCertDTO cert ) {
		service.add( cert );
	}

	@RequestMapping( value = "/gcm/{gcmCertId}", method=RequestMethod.POST )
	public void deleteByGCMCertId( @PathVariable( "gcmCertId" ) int gcmCertId ) {
		service.deleteByGcmCertId( gcmCertId );
	}
	
}
