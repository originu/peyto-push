package peyto.push.service.impl;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.List;

import org.apache.log4j.BasicConfigurator;
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
import peyto.push.dto.PushAPNSCertDTO;
import peyto.push.dto.PushGCMCertDTO;
import peyto.push.worker.config.TestConfig;

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
		TestConfig.class
		} )
public class BasicPushCertsServiceTest {

	@Autowired
	BasicPushCertsService	service;
	
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

	// APNS
	@Test
	public void addPushAPNSCert() {
//		PushAPNSCertDTO	dto	= new PushAPNSCertDTO();
//		service.addPushAPNSCert( dto );
//		assertTrue( true );
	}

	@Test
	public void getPushAPNSCertByAppId() {
//		String	appId	= "";
//		PushAPNSCertDTO	dto	= service.getPushAPNSCertByAppId( appId );
//		assertTrue( true );
	}

	@Test
	public void deletePushAPNSCertByAppId() {
		String	appId	= "";
		service.deletePushAPNSCertByAppId( appId );
		assertTrue( true );
	}

	@Test
	public void deleteAllPushAPNSCertByAppId() {
		service.deleteAllPushAPNSCert();
		assertTrue( true );
	}

	
	
	// GCM
	@Test
	public void addPushGCMCert() {
		PushGCMCertDTO	dto	= new PushGCMCertDTO();
		dto.setAppId( "testAppId" );
		dto.setAppDesc( "test description" );
		dto.setCertApiKey( "AIzaSyCKRNR2wyVpzzx520jE-wCGXIbYzrYNqhg" );
		dto.setCertProductId( "1059560991536" );
		dto.setCertDelayWhileIdle( false );
		dto.setCertRetry( 5 );
		dto.setCertTimeToLive( 30*1000 );
		dto.setCertGMail( "originu@gmail.com" );
		dto.setCreatedDate( Calendar.getInstance().getTime() );
		service.addPushGCMCert( dto );
		assertTrue( true );
	}

	@Test
	public void getPushGCMCertByAppId() {
		String	appId	= "testAppId";
		PushGCMCertDTO	dto	= service.getPushGCMCertByAppId( appId );
		assertTrue( true );
	}
	
	@Test
	public void getPushGCMCerts() {
		addPushGCMCert();
		List< PushGCMCertDTO >	items	= service.getPushGCMCerts();
		assertEquals( 1, items.size() );
	}

	@Test
	public void deletePushGCMCertByAppId() {
		String	appId	= "";
		service.deletePushGCMCertByAppId( appId );
		assertTrue( true );
	}

	@Test
	public void deleteAllPushGCMCertByAppId() {
		service.deleteAllPushGCMCert();
		assertTrue( true );
	}

}
