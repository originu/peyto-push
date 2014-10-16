package peyto.push.server.http.controllers;

import java.util.Arrays;

import org.apache.log4j.BasicConfigurator;
import org.codehaus.jackson.node.JsonNodeFactory;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import peyto.push.common.test.PeytoPushHomeConfigurator;
import peyto.push.core.engine.dto.PushFireMessage;
import peyto.push.types.PushSendType;

@RunWith( SpringJUnit4ClassRunner.class )
@ContextConfiguration( locations = "/appcontext-test.xml" )
public class PushGroupsControllerTest {

	@Autowired
	PushGroupsController	controller;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		BasicConfigurator.configure();
		PeytoPushHomeConfigurator.configure();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	private PushFireMessage	createGeneralMockup() {
		PushFireMessage	msg	= new PushFireMessage();
		msg.setPushSendType( PushSendType.INSTANT );
		msg.setSenderId( "kevin" );
		msg.setAppId( "testApp" );
		msg.setTextDesc( "" );
		msg.setCategoryId( "basic" );
		msg.setPayloadMessage( JsonNodeFactory.instance.objectNode() );
		msg.setCustomMessage( JsonNodeFactory.instance.objectNode() );
		msg.setBroadcast( false );
		msg.setUserIdItems( Arrays.asList( "kevin" ) );
		msg.setGroupIdItems( Arrays.asList( "peyto" ) );
		return msg;
	}
	
	@Test
	public void processSync() {
		PushFireMessage	msg	= createGeneralMockup();
//		ResponseEntity< ObjectNode > result = controller.processSync( msg );
	}

	@Test
	public void processASync() {
		PushFireMessage	msg	= createGeneralMockup();
//		ResponseEntity< ObjectNode > result = controller.processASync( msg );
	}
	
}
