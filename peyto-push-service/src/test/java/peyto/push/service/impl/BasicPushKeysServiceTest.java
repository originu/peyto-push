package peyto.push.service.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import peyto.push.common.pushkeys.PushOSType;
import peyto.push.common.pushkeys.PushType;
import peyto.push.dto.PushKeyDTO;
import peyto.push.dto.PushKeyPaginationDTO;
import peyto.push.service.Peyto;
import peyto.push.service.config.TestConfigLoader;
import peyto.push.service.config.TestDataSourceConfig;
import peyto.push.service.config.TestHibernate4PersistenceConfig;
import peyto.push.service.config.TestServiceConfig;

/**
 * 
 * 
public void testAdd() throws Exception {
    // wipe database
    // add something
    // assert that it was added
}
public void testUpdate() throws Exception {
    // wipe database
    // add something
    // update it
    // assert that it was updated
}
public void testDelete() throws Exception {
    // wipe database
    // add something
    // delete it
    // assert that it was deleted
}
public void testCRUD() throws Exception {
    // wipe database
    // add something
    // assert that it was added
    // update it
    // assert that it was updated
    // delete it 
    // assert that it was deleted
}
 * @author kevin
 *
 */

@RunWith( SpringJUnit4ClassRunner.class )
@ContextConfiguration( classes = { 
		TestConfigLoader.class,
		TestDataSourceConfig.class,
		TestHibernate4PersistenceConfig.class,
		TestServiceConfig.class
		} )
public class BasicPushKeysServiceTest {

	@Autowired
	BasicPushKeysService	service;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		Peyto.setTestMode();
		Peyto.setSpringProfilesActive( Peyto.PROFILE_DEVELOPMENT );
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
	public void add() {
		PushKeyDTO	pushkey	= createMock();
		assertEquals( 1, service.add( pushkey ) );
	}
	
	@Test
	public void get() {
		PushKeyDTO	pushkey	= createMock();
		assertEquals( 1, service.add( pushkey ) );
		PushKeyDTO	result	= service.get( pushkey.getPushkey() );
		assertEquals( pushkey.getPushkey(), result.getPushkey() );
	}

	@Test
	public void getItems() {
		ArrayList< PushKeyDTO >	inputs	= new ArrayList<PushKeyDTO>();
		int	total	= 35;
		for (int i = 0; i < total; i++) {
			PushKeyDTO	pushkey	= createMock();
			pushkey.setPushkey( StringUtils.leftPad( ( i + 1 ) + "", 10, '0' ) );
			pushkey.setUserId( StringUtils.leftPad( ( i + 1 ) + "", 10, '0' ) );
			assertEquals( 1, service.add( pushkey ) );
			inputs.add( pushkey );
		}
		
		PushKeyPaginationDTO	page	= new PushKeyPaginationDTO();
		page.setOffset( 0 );
		page.setLimit( 10 );
		List< PushKeyDTO >	result	= service.getItems( page );
		assertEquals( 10, result.size() );

		page	= new PushKeyPaginationDTO();
		page.setOffset( 30 );
		page.setLimit( 40 );
		result	= service.getItems( page );
		assertEquals( 5, result.size() );
	}
	
	@Test
	public void getSize() {
		int	total	= 35;
		for (int i = 0; i < total; i++) {
			PushKeyDTO	pushkey	= createMock();
			pushkey.setPushkey( StringUtils.leftPad( ( i + 1 ) + "", 10, '0' ) );
			pushkey.setUserId( StringUtils.leftPad( ( i + 1 ) + "", 10, '0' ) );
			assertEquals( 1, service.add( pushkey ) );
		}
		assertEquals( total, service.getSize() );
	}

	@Test
	public void delete() {
		PushKeyDTO	pushkey	= createMock();
		int	result	= service.add( pushkey );
		Assert.assertEquals( 1, result );
		result	= service.delete( pushkey.getPushkey() );
		assertEquals( 1, result );
	}
	
	@Test
	public void deleteAll() {
		service.deleteAll();
		assertTrue( true );
	}

	@Test
	public void deleteAllByAppId() {
		add();
		String	appId	= "testApp";
		service.deleteAllByAppId( appId );
		assertTrue( true );
	}


}
