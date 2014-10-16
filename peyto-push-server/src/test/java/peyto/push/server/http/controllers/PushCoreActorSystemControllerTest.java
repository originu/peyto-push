package peyto.push.server.http.controllers;

import org.apache.log4j.BasicConfigurator;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import peyto.push.common.test.PeytoPushHomeConfigurator;

@RunWith( SpringJUnit4ClassRunner.class )
@ContextConfiguration( locations = "/appcontext-test.xml" )
public class PushCoreActorSystemControllerTest {

	@Autowired
	PushCoreActorSystemController	controller;
	
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
//		controller.deleteAll();
	}
//
//	@After
//	public void tearDown() throws Exception {
//	}
//
//	private PushKeyDTO createMock() {
//		PushKeyDTO	pushKey	= new PushKeyDTO();
//		pushKey.setPushkey( "AAAAA" ); 
//		pushKey.setUserId( "kevin" );
//		pushKey.setAppId( "testApp" );
//		pushKey.setDeviceUid( "D00000" );
//		pushKey.setDeviceModelName( "iphone4s" );
//		pushKey.setPushNotificatorType(PushNotificatorType.APNS);
//		pushKey.setOsVersion( "7.1.0" );
//		pushKey.setOsType(PushOSType.IOS);
//		pushKey.setSound( "PushAlarm" );
//		pushKey.setEnabled( true );
//		pushKey.setCreatedDate( "2014" );
//		pushKey.setUpdatedDate("2014");
//		return pushKey;
//	}
//	
//	@Test
//	public void add() {
//		PushKeyDTO	pushkey	= createMock();
//		assertEquals( 1, controller.add( pushkey ) );
//	}
//
//	@Test
//	public void get() {
//		PushKeyDTO	pushkey	= createMock();
//		assertEquals( 1, controller.add( pushkey ) );
//		assertEquals( pushkey.getPushkey(), controller.get( pushkey.getPushkey() ).getPushkey() );
//	}
//
//	@Test
//	public void getItems() {
//		ArrayList< PushKeyDTO >	inputs	= new ArrayList<PushKeyDTO>();
//		int	total	= 35;
//		for (int i = 0; i < total; i++) {
//			PushKeyDTO	pushkey	= createMock();
//			pushkey.setPushkey( StringUtils.leftPad( ( i + 1 ) + "", 10, '0' ) );
//			pushkey.setUserId( StringUtils.leftPad( ( i + 1 ) + "", 10, '0' ) );
//			assertEquals( 1, controller.add( pushkey ) );
//			inputs.add( pushkey );
//		}
//		PushKeyPaginationDTO	page	= new PushKeyPaginationDTO();
//		page.setPage( 1 );
//		page.setSize( 10 );
//		List<PushKeyDTO> items = controller.getItems( page );
//		assertEquals( 10, items.size() );
//	}
//
//	@Test
//	public void update() {
//		String	pushkey	= "AAAAA";
//		Object	obj		= new Object();
////		Object result = controller.updatePushKey( pushkey, obj );
//	}
//
//	@Test
//	public void delete() {
//		String	pushkey	= "AAAAA";
//		controller.delete( pushkey );
//	}
	
}
