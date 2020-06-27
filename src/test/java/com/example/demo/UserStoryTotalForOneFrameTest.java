package com.example.demo;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserStoryTotalForOneFrameTest {
    static UserStoryTotalForOneFrame tester;

    @BeforeClass
    public static void testSetup(){
        tester = new UserStoryTotalForOneFrame();
    }

    @AfterClass
    public static void testCleanUp(){
        // cleanup
    }

    @Test
    public void testTotalForOneFrame(){
        assertEquals("Result", 8, tester.getPins(2,6));
    }

}