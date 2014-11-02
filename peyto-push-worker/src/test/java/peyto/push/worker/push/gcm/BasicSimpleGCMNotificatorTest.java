package peyto.push.worker.push.gcm;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import peyto.push.dto.PushGCMCertDTO;
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
public class BasicSimpleGCMNotificatorTest {

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
		PushGCMCertDTO pushCert	= new PushGCMCertDTO();
		SinglePushNotificationMessage	message = new SinglePushNotificationMessage();
		
		BasicSimpleGCMNotificator	notificator	= new BasicSimpleGCMNotificator( pushCert );
		notificator.activate();

		notificator.handle( message );
		
		notificator.deactivate();
	}

	@Test
	public void handle_multi() {
		PushGCMCertDTO pushCert	= new PushGCMCertDTO();
		MultiPushNotificationMessage	message = new MultiPushNotificationMessage();
		
		BasicSimpleGCMNotificator	notificator	= new BasicSimpleGCMNotificator( pushCert );
		notificator.activate();
		
		notificator.handle( message );
		
		notificator.deactivate();
	}

}
