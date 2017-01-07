package com.springboot.mvn.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringbootMvnTest138Application.class)
public class SpringbootMvnTest138ApplicationTests {

	@Test
	public void contextLoads() {
	    System.out.println(" *MyLog* : SpringBoot 1.3.8.RELEASE Version for Test.");
        System.out.println(" *MyLog* : RunAs Maven Test.");
	    assertEquals("TestAssert!", 0, 0);
	}
}
