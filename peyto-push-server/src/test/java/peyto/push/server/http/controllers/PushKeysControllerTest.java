package peyto.push.server.http.controllers;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.BasicConfigurator;
import org.codehaus.jackson.node.ObjectNode;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import peyto.push.common.test.PeytoPushHomeConfigurator;
import peyto.push.common.types.PushOSType;
import peyto.push.common.types.PushType;
import peyto.push.dto.PushKeyDTO;
import peyto.push.dto.PushKeyPaginationDTO;

@RunWith( SpringJUnit4ClassRunner.class )
@ContextConfiguration( locations = "/appcontext-test.xml" )
public class PushKeysControllerTest {

	@Autowired
	PushKeysController	controller;
	
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
		controller.deleteAll();
	}

	@After
	public void tearDown() throws Exception {
	}

	private PushKeyDTO createMock() {
		PushKeyDTO	pushKey	= new PushKeyDTO();
		pushKey.setPushkey( "AAAAA" ); 
		pushKey.setUserId( "kevin" );
		pushKey.setAppId( "testApp" );
		pushKey.setPushType( PushType.APNS);
		pushKey.setOsType( PushOSType.IOS );
		pushKey.setOsVer1( 1 );
		pushKey.setOsVer2( 0 );
		pushKey.setOsVer3( 0 );
		pushKey.setDeviceUid( "D00000" );
		pushKey.setDeviceType( "phone" );
		pushKey.setDeviceModel( "iphone4s" );
		pushKey.setSound( "PushAlarm" );
		pushKey.setEnabled( true );
		pushKey.setCreatedDate( Calendar.getInstance().getTime() );
		
		
//		private String	pushkey;
//		private String	userId;
//		private String	appId;
//		private String	pushType;
//		private String	osType;
//		private int		osVer1;
//		private int		osVer2;
//		private int		osVer3;
//		private String	deviceUid;
//		private String	deviceType;
//		private String	deviceModel;
//		private String	sound;
//		private boolean	enabled;
//		private Date	createdDate;
		
		return pushKey;
	}	
	@Test
	public void createOrUpdate() {
		PushKeyDTO	pushkey	= createMock();
		ResponseEntity<ObjectNode> createOrUpdate = controller.createOrUpdate( pushkey );
		assertEquals( 1, 1 );
	}

	@Test
	public void retrieve() {
		PushKeyDTO	pushkey	= createMock();
		assertEquals( 1, controller.createOrUpdate( pushkey ) );
		ResponseEntity<PushKeyDTO> retrieve = controller.retrieve( pushkey.getPushkey() );
		assertEquals( pushkey.getPushkey(), retrieve.getBody().getPushkey() );
	}

	@Test
	public void retrievePartially() {
		ArrayList< PushKeyDTO >	inputs	= new ArrayList<PushKeyDTO>();
		int	total	= 35;
		for (int i = 0; i < total; i++) {
			PushKeyDTO	pushkey	= createMock();
			pushkey.setPushkey( StringUtils.leftPad( ( i + 1 ) + "", 10, '0' ) );
			pushkey.setUserId( StringUtils.leftPad( ( i + 1 ) + "", 10, '0' ) );
			ResponseEntity<ObjectNode> createOrUpdate = controller.createOrUpdate( pushkey );
			inputs.add( pushkey );
		}
		PushKeyPaginationDTO	page	= new PushKeyPaginationDTO();
		page.setOffset( 0 );
		page.setLimit( 10 );
		ResponseEntity<List<PushKeyDTO>> retrieve = controller.retrieve( page );
		assertEquals( 10, retrieve.getBody().size() );
	}

	@Test
	public void update() {
		String	pushkey	= "AAAAA";
		Object	obj		= new Object();
//		Object result = controller.updatePushKey( pushkey, obj );
	}

//	@Test
//	public void delete() {
//		String	pushkey	= "AAAAA";
//		controller.delete( pushkey );
//	}
	
	@Test
	public void deleteAllByAppId() {
		String	appId	= "testApp";
		controller.deleteAllByAppId( appId );
	}
	
}
