package peyto.push.admin.controllers;

import org.codehaus.jackson.node.JsonNodeFactory;
import org.codehaus.jackson.node.ObjectNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import peyto.push.admin.dto.UserLoginDTO;

@Controller
public class LoginController {
	
private Logger	logger	= LoggerFactory.getLogger( LoginController.class );

	@RequestMapping( value="/authenticate", method = RequestMethod.POST )
	@ResponseBody
	public ResponseEntity< ObjectNode > login( @ModelAttribute UserLoginDTO userLogin ) {
		logger.debug( "login::" + userLogin.toString() );
		ObjectNode objectNode = JsonNodeFactory.instance.objectNode();
		if ( userLogin.getUserId().equals( "guest" ) ) {
			if ( userLogin.getUserPw().equals( "guest" ) ) {
				objectNode.put( "result", true );
			} else {
				objectNode.put( "result", false );
			}
		} else {
			objectNode.put( "result", false );
		}
		objectNode.put( "resultCode", 	 "" );
		objectNode.put( "resultMessage", "" );
		return new ResponseEntity< ObjectNode >( objectNode, HttpStatus.OK );
	}
}