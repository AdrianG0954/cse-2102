package com.mycompany.app;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.mycompany.app.TestMe;

public class TestMeTests {

	TestMe testMe;

	@Before
	public void setUp() throws Exception {
		testMe  = new TestMe();
    }

	@Test
	public void squareTest() {

		double baseValue = 3.0;
		double expected = baseValue*baseValue;
		testMe.setValue(3.0);
		double actual = testMe.square();

		assertTrue(actual == expected);
	}

	@Test
	public void addTest() {

		double baseValue = 3.0;
		double expectedValue = baseValue + baseValue;
		testMe.setValue(3.0);
		double actual = testMe.add();

		assertTrue(actual == expectedValue);
	}


	@Test  
        public void minusTest() {

                double baseValue = 3.0;
                double expectedValue = baseValue -  baseValue;
                testMe.setValue(3.0);
                double actual = testMe.subtract();

                assertTrue(actual == expectedValue);
        }

	@Test  
        public void divideTest() {

                double baseValue = 3.0;
                double expectedValue = baseValue / baseValue;
                testMe.setValue(3.0);
                double actual = testMe.divide();

                assertTrue(actual == expectedValue);
        }

}
