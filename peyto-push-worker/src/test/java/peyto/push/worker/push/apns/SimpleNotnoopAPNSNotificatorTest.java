package peyto.push.worker.push.apns;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import peyto.push.dto.PushAPNSCertDTO;
import peyto.push.service.Peyto;
import peyto.push.worker.push.MultiPushNotificationMessage;
import peyto.push.worker.push.SinglePushNotificationMessage;

@RunWith( SpringJUnit4ClassRunner.class )
//@ContextConfiguration(classes = { 
//		TestPropertySourceLoader.class,
//		TestDataSourceConfig.class,
//		TestMyBatisPersistenceConfig.class,
//		TestServiceConfig.class,
//		TestConfig.class
//		} )
//@ActiveProfiles( Peyto.PROFILE_DEVELOPMENT )
public class SimpleNotnoopAPNSNotificatorTest {

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
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void handle_single() {
		
		PushAPNSCertDTO pushCert	= new PushAPNSCertDTO();
		
		SinglePushNotificationMessage	message = new SinglePushNotificationMessage();
		
		SimpleNotnoopAPNSNotificator	notificator	= new SimpleNotnoopAPNSNotificator( pushCert );
		notificator.activate();

		notificator.handle( message );
		
		notificator.deactivate();
	}

	@Test
	public void handle_multi() {
		
		PushAPNSCertDTO pushCert	= new PushAPNSCertDTO();
		
		MultiPushNotificationMessage	message = new MultiPushNotificationMessage();
		
		SimpleNotnoopAPNSNotificator	notificator	= new SimpleNotnoopAPNSNotificator( pushCert );
		notificator.activate();
		
		notificator.handle( message );
		
		notificator.deactivate();
	}

}
