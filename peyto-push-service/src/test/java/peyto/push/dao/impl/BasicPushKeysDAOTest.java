package peyto.push.dao.impl;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import peyto.push.service.config.TestDataSourceConfig;
import peyto.push.service.config.TestHibernate4PersistenceConfig;
import peyto.push.service.config.TestServiceConfig;


@RunWith( SpringJUnit4ClassRunner.class )
@ContextConfiguration( classes = { 
//		TestConfigLoader.class,
		TestDataSourceConfig.class,
		TestHibernate4PersistenceConfig.class,
		TestServiceConfig.class
		} )
public class BasicPushKeysDAOTest {

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
	public void test() {
		fail("Not yet implemented");
	}

}
