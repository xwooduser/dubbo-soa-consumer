package com.xwood.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xwood.globel.iprovider.ISessionProvider;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-dubbo.xml"})
public class SessionProviderTest{
	
	    @Autowired
	    private ISessionProvider spr;
	 
	   @Test
	    public void testDataSource() {
		   System.out.println(spr.get());
	   }

}
