package peyto.push.service.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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
import peyto.push.common.utils.PushDateUtils;
import peyto.push.dto.PushMessageDTO;
import peyto.push.dto.PushSendResultDTO;
import peyto.push.types.PushInputChannelType;
import peyto.push.types.PushResultType;

/**
 * 
 * @author kevin
 *
 */
@RunWith( SpringJUnit4ClassRunner.class )
@ContextConfiguration( locations = "/appcontext-test.xml" )
public class BasicPushMessagesServiceTest {

	@Autowired
	BasicPushMessagesService	service;
	
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
		service.deleteAll();
	}

	@After
	public void tearDown() throws Exception {
	}

//	private String	messageDay;         	
//	private int		messageId;          	
//	private String	resultCode; 	
//	private PushResultType	resultType;
//	private PushSendType	pushSendType;
//	private String	reservationDate;
//	private PushInputChannelType pushInputChannelType;
//	private String	senderId;
//	private String	appId;         	 	
//	private String	textDescription;   	
//	private String	categoryId;	
//	private ObjectNode	customMessage;      	
//	private boolean	processed; 	   		
//	private String	processType; 	   		
//	private String	processedTime;		
//	private boolean	deleted;      		
//	private String	deletedDate;
	
	private PushMessageDTO createMock() {
		PushMessageDTO	msg	= new PushMessageDTO();
		msg.setMessageDay( PushDateUtils.getCurrentYYYYMMDD() );
		msg.setMessageId( 1 );
		msg.setResultCode( "1" );
		msg.setResultType( PushResultType.INIT );
		msg.setPushInputChannelType( PushInputChannelType.HTTP );
		msg.setSenderId( "kevin" );
		msg.setAppId( "testApp" );
		msg.setTextDescription( "Hello, this is a test push message." );
		msg.setCategoryId( "general" );
		msg.setCustomMessage( JsonNodeFactory.instance.objectNode() );
		msg.setProcessed( true );
		msg.setDeleted( false );
		return msg;
	}
	
	private PushSendResultDTO createMockResult() {
		PushSendResultDTO	msg	= new PushSendResultDTO();

		return msg;
	}
	
	@Test
	public void add() {
		PushMessageDTO	pushkey	= createMock();
		assertEquals( 1, service.add( pushkey ) );
	}
	
	@Test
	public void add2() {
		PushMessageDTO	pushkey	= createMock();
		
		assertEquals( 1, service.add( pushkey ) );
	}
	
//	@Test
//	public void get() {
//		PushMessageDTO	pushkey	= createMock();
//		assertEquals( 1, service.add( pushkey ) );
//		PushKeyDTO	result	= service.get( pushkey.getPushkey() );
//		assertEquals( pushkey.getPushkey(), result.getPushkey() );
//	}
//
//	@Test
//	public void getItems() {
//		ArrayList< PushKeyDTO >	inputs	= new ArrayList<PushKeyDTO>();
//		int	total	= 35;
//		for (int i = 0; i < total; i++) {
//			PushMessageDTO	pushkey	= createMock();
//			pushkey.setPushkey( StringUtils.leftPad( ( i + 1 ) + "", 10, '0' ) );
//			pushkey.setUserId( StringUtils.leftPad( ( i + 1 ) + "", 10, '0' ) );
//			assertEquals( 1, service.add( pushkey ) );
//			inputs.add( pushkey );
//		}
//		
//		PushKeyPaginationDTO	page	= new PushKeyPaginationDTO();
//		page.setPage( 1 );
//		page.setSize( 10 );
//		List< PushKeyDTO >	result	= service.getItems( page );
//		assertEquals( 10, result.size() );
//
//		page	= new PushKeyPaginationDTO();
//		page.setPage( 4 );
//		page.setSize( 10 );
//		result	= service.getItems( page );
//		assertEquals( 5, result.size() );
//	}
//	
//	@Test
//	public void getSize() {
//		int	total	= 35;
//		for (int i = 0; i < total; i++) {
//			PushKeyDTO	pushkey	= createMock();
//			pushkey.setPushkey( StringUtils.leftPad( ( i + 1 ) + "", 10, '0' ) );
//			pushkey.setUserId( StringUtils.leftPad( ( i + 1 ) + "", 10, '0' ) );
//			assertEquals( 1, service.add( pushkey ) );
//		}
//		assertEquals( total, service.getSize() );
//	}
//
//	@Test
//	public void delete() {
//		PushKeyDTO	pushkey	= createMock();
//		int	result	= service.add( pushkey );
//		Assert.assertEquals( 1, result );
//		result	= service.delete( pushkey.getPushkey() );
//		assertEquals( 1, result );
//	}
//	
	@Test
	public void deleteAll() {
		service.deleteAll();
		assertTrue( true );
	}


}
