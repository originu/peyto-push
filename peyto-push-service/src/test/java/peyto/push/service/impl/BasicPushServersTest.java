package peyto.push.service.impl;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

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

import peyto.push.dto.PushServerDTO;
import peyto.push.service.Peyto;
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
public class BasicPushServersTest {

	@Autowired
	BasicPushsServersService	service;
	
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

	@Test
	public void add() {
		PushServerDTO	dto	= new PushServerDTO();
		dto.setServerId( "testServerId" );
		dto.setServerName( "TEST Server" );
		dto.setServerDesc( "test server description" );
		service.add( dto );
		assertTrue( true );
	}

	@Test
	public void getByServerId() {
		add();
		String	serverId	= "testServerId";
		PushServerDTO	dto	= service.getByServerId( serverId );
		assertNotNull( dto );
	}
	
	@Test
	public void deleteByServerId() {
		add();
		String	serverId	= "testServerId";
		int deleteByServerId = service.deleteByServerId( serverId );
		assertTrue( deleteByServerId > 0 );
	}

	@Test
	public void deleteAll() {
		add();
		int deleteAll = service.deleteAll();
		assertTrue( deleteAll > 0 );
	}

}
