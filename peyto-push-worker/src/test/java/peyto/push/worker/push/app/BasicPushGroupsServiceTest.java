package peyto.push.service.impl;

import static org.junit.Assert.assertEquals;

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
import peyto.push.dto.PushGroupDTO;

/**
 * 
 * 
 * @author kevin
 *
 */
@RunWith( SpringJUnit4ClassRunner.class )
@ContextConfiguration( locations = "/appcontext-test.xml" )
public class BasicPushGroupsServiceTest {

	@Autowired
	BasicPushGroupsService	service;
	
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

	private PushGroupDTO createMock() {
		PushGroupDTO	group	= new PushGroupDTO();
		group.setItemId( "g1" );
		group.setParentItemId( "pg1" );
		group.setItemName( "test group" );
		group.setItemType( "sub" );
		group.setItemDescription( "junit test push group..." );
		group.setAppId( "testApp" );
		return group;
	}
	
	@Test
	public void add() {
		PushGroupDTO	group	= createMock();
		assertEquals( 1, service.add( group ) );
	}

	@Test
	public void getByGroupId() {
		PushGroupDTO	pushGroup	= createMock();
		service.add( pushGroup );
		PushGroupDTO resultOfPushGroup = service.getByItemId( pushGroup.getItemId() );
		assertEquals( pushGroup.getItemId(), resultOfPushGroup.getItemId() );
	}

	@Test
	public void getByGroupName() {
		PushGroupDTO	pushGroup	= createMock();
		service.add( pushGroup );
		PushGroupDTO resultOfPushGroup = service.getByItemName( pushGroup.getItemName() );
		assertEquals( pushGroup.getItemId(), resultOfPushGroup.getItemId() );
	}

}
