package com.sample;

import static org.junit.Assert.*;

import java.awt.PageAttributes.MediaType;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.test.web.servlet.setup.StandaloneMockMvcBuilder;
import org.springframework.web.context.WebApplicationContext;

import com.atomikos.logging.LoggerFactory;
import com.sample.controller.Greeting;
import com.sample.controller.HomeController;

import junit.framework.Assert;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SuppressWarnings({ "unused", "deprecation" })
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DemoApplication.class)
@WebAppConfiguration
public class DemoApplicationTests 
{
	protected Logger logger=org.slf4j.LoggerFactory.getLogger(DemoApplicationTests.class);
	
	@Test
	public void contextLoads() 
	{
		 HomeController controller=new HomeController();
		//assertEquals(new Greeting,controller.sayHello("sasi"));
		//assertEquals("Hello World",controller.sayHello(""));
		
		
	}

}
