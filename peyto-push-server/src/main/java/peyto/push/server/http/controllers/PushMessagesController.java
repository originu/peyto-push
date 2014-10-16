package peyto.push.server.http.controllers;

import org.codehaus.jackson.node.ObjectNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import peyto.push.core.engine.api.IPushEngine;
import peyto.push.core.engine.dto.PushFireMessage;
import peyto.push.service.api.IPushMessagesService;

//@Controller
public class PushMessagesController {

	@Autowired
	private IPushMessagesService	pushMessagesService;
	
	@Autowired
	private IPushEngine	pushEngine;
	
	@RequestMapping( value="/pushmessages/", method = RequestMethod.POST )
	@ResponseBody
	public ResponseEntity< ObjectNode > processSync( @RequestBody PushFireMessage pushFireMessage ) {
		// invalidation
//		return pushKeysService.add( pushkey );
		return new ResponseEntity< ObjectNode >( HttpStatus.OK );
	}

	@RequestMapping( value="/pushmessages/", method = RequestMethod.POST )
	@ResponseBody
	public ResponseEntity< ObjectNode > processBroadcast( @RequestBody PushFireMessage pushFireMessage ) {
		// invalidation
//		return pushKeysService.add( pushkey );
		return new ResponseEntity< ObjectNode >( HttpStatus.OK );
	}

	public ResponseEntity<ObjectNode> processASync( PushFireMessage pushFireMessage ) {

		return new ResponseEntity< ObjectNode >( HttpStatus.ACCEPTED );
	}
	
//	@RequestMapping( value="/pushkeys/{pushkey}", method = RequestMethod.GET )
//	public ResponseEntity< PushKeyDTO > retrieve( @PathVariable( "pushkey" ) String pushkey ) {
//		PushKeyDTO pushKeyDTO = pushKeysService.get( pushkey );
//		if ( pushKeyDTO != null ) {
//			return new ResponseEntity< PushKeyDTO >( pushKeyDTO, HttpStatus.OK );
//		} else {
//			return new ResponseEntity< PushKeyDTO >( HttpStatus.NOT_FOUND );
//		}
//	}
	
}
