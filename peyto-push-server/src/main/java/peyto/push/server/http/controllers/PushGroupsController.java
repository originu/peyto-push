package peyto.push.server.http.controllers;

import org.codehaus.jackson.node.ObjectNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import peyto.push.core.engine.dto.PushFireMessage;
import peyto.push.service.api.IPushGroupsService;

@Controller
public class PushGroupsController {

	
	@Autowired
	private IPushGroupsService	pushGroupsService;
	
	
	@RequestMapping( value="/groups/", method = RequestMethod.POST )
	@ResponseBody
	public ResponseEntity< ObjectNode > create( @RequestBody PushFireMessage pushFireMessage ) {
		// invalidation
//		return pushKeysService.add( pushkey );
		return new ResponseEntity< ObjectNode >( HttpStatus.OK );
	}

}
