package peyto.push.service.impl;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Calendar;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import peyto.push.common.types.PushType;
import peyto.push.dto.PushAPNSCertDTO;
import peyto.push.service.Peyto;
import peyto.push.service.api.PushAPNSCertsService;
import peyto.push.service.config.TestDataSourceConfig;
import peyto.push.service.config.TestMyBatisPersistenceConfig;
import peyto.push.service.config.TestPropertySourceLoader;
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
@ContextConfiguration(classes = { 
		TestPropertySourceLoader.class,
		TestDataSourceConfig.class,
		TestMyBatisPersistenceConfig.class,
		TestServiceConfig.class
		} )
@ActiveProfiles( Peyto.PROFILE_DEVELOPMENT )
public class BasicPushAPNSCertsServiceTest {

	@Autowired
	PushAPNSCertsService service;
	
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

	// APNS
	@Test
	public void add() {
		PushAPNSCertDTO	dto	= new PushAPNSCertDTO();
		dto.setAppId( "appId::0" );
		dto.setAppDesc( "test description" );
		dto.setPushType( PushType.APNS );
		dto.setCertBin( new byte[1024] );
		dto.setCertPW( "test_pw" );
		dto.setCertExpDate( Calendar.getInstance().getTime() );
		dto.setCreatedDate( Calendar.getInstance().getTime() );
		int add = service.add( dto );
		assertTrue( add > 0 );
	}

	@Test
	public void getByAppId() {
		add();
		String	appId	= "appId::0";
		PushAPNSCertDTO	dto	= service.getByAppId( appId );
		System.out.println( dto );
		assertNotNull( dto );
	}

	@Test
	public void deleteByAppId() {
		add();
		String	appId	= "appId::0";
		int deleteByAppId = service.deleteByAppId( appId );
		assertTrue( deleteByAppId > 0 );
	}

	@Test
	public void deleteAll() {
		add();
		int deleteAll = service.deleteAll();
		assertTrue( deleteAll > 0 );
	}

}