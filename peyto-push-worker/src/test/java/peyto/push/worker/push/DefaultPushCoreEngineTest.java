package peyto.push.worker.push;

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

import peyto.push.service.Peyto;
import peyto.push.service.config.TestDataSourceConfig;
import peyto.push.service.config.TestMyBatisPersistenceConfig;
import peyto.push.service.config.TestPropertySourceLoader;
import peyto.push.service.config.TestServiceConfig;
import peyto.push.worker.config.TestConfig;

@RunWith( SpringJUnit4ClassRunner.class )
@ContextConfiguration(classes = { 
		TestPropertySourceLoader.class,
		TestDataSourceConfig.class,
		TestMyBatisPersistenceConfig.class,
		TestServiceConfig.class,
		TestConfig.class
		} )
@ActiveProfiles( Peyto.PROFILE_DEVELOPMENT )
public class DefaultPushCoreEngineTest {

	@Autowired
	DefaultPushCoreEngineWorker	pushCoreEngineWorker;
	
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
	public void process() {
		SinglePushNotificationMessage	message	= new SinglePushNotificationMessage(); 
		pushCoreEngineWorker.process( message );
	}

}
