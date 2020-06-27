package com.example.demo;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PinManagerTest {
	static PinManager tester;

	  @BeforeClass
	  public static void testSetup() {
	    tester = new PinManager();
	  }

	  @AfterClass
	  public static void testCleanup() {
	    // cleanup
	  }

	  @Test
	  public void test2Pins() {
	    assertEquals("Result", 2, tester.getPins(2));
	  }

}
