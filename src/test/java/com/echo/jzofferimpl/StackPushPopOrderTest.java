package com.echo.jzofferimpl;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StackPushPopOrderTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		int[] pushA={1,2,3,4,5};
		int[] popA={4,5,3,2,1,8,9};
		boolean result=StackPushPopOrder.IsPopOrder(pushA, popA);
		System.out.println(result);
	}

}
