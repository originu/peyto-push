package peyto.push.server.http.controllers;

import org.codehaus.jackson.node.JsonNodeFactory;
import org.codehaus.jackson.node.ObjectNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import peyto.push.core.system.api.IPushCoreActorSystem;

@Controller
public class PushCoreActorSystemController {

	@Autowired
	private IPushCoreActorSystem	pushCoreActorSystem;
	
	@RequestMapping( value="/core/actorsystem/startup", method = RequestMethod.GET )
	public ResponseEntity< Object > startup() {
		pushCoreActorSystem.startup();
		return new ResponseEntity< Object > ( HttpStatus.OK );
	}

	@RequestMapping( value="/core/actorsystem/shutdown", method = RequestMethod.GET )
	public ResponseEntity< Object > shutdown() {
		pushCoreActorSystem.startup();
		return new ResponseEntity< Object > ( HttpStatus.OK );
	}

	@RequestMapping( value="/core/actorsystem/is-running", method = RequestMethod.GET )
	public ResponseEntity< ObjectNode > isRunning() {
		ObjectNode objectNode = JsonNodeFactory.instance.objectNode();
		objectNode.put( "running", pushCoreActorSystem.isRunning() );
		return new ResponseEntity< ObjectNode > ( objectNode, HttpStatus.OK );
	}
	
	

}