package peyto.push.server.http.controllers;

import org.codehaus.jackson.node.JsonNodeFactory;
import org.codehaus.jackson.node.ObjectNode;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@RequestMapping( value="/", method = RequestMethod.GET )
	public String home() {
		return "hello";
	}

	@ResponseBody
	@RequestMapping( value="/version", method = RequestMethod.GET )
	public ResponseEntity< ObjectNode > version() {
		ObjectNode objectNode = JsonNodeFactory.instance.objectNode();
		objectNode.put( "version", "v1.0.0" );
		return new ResponseEntity< ObjectNode > ( objectNode, HttpStatus.OK );
	}

}
