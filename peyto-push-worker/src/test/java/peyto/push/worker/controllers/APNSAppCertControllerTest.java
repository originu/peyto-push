package peyto.push.worker.controllers;

import java.util.Calendar;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import peyto.push.common.types.PushType;
import peyto.push.dto.PushAPNSCertDTO;
import peyto.push.worker.config.TestConfig;

@RunWith( SpringJUnit4ClassRunner.class )
@ContextConfiguration( classes = { 
		TestConfig.class
		} )
public class APNSAppCertControllerTest {

	@Autowired
	private APNSAppCertController controller;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
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

	@Test
	public void add() {
		PushAPNSCertDTO	cert	= new PushAPNSCertDTO();
		cert.setAppId( "appId::0" );
		cert.setAppDesc( "test description" );
		cert.setPushType( PushType.APNS );
		cert.setCertBin( new byte[1024] );
		cert.setCertPW( "test_pw" );
		cert.setCertExpDate( Calendar.getInstance().getTime() );
		cert.setCreatedDate( Calendar.getInstance().getTime() );
		controller.add( cert );
	}

	@Test
	public void delete() {
		int	apnsCertId	= 0;
		controller.deleteByApnsCertId( apnsCertId );
	}

}
