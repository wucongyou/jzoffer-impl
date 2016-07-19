package com.echo.jzofferimpl;

import org.junit.Before;
import org.junit.Test;

public class StackWithTwoQueuesTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		StackWithTwoQueues stack=new StackWithTwoQueues();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		stack.push(4);
		System.out.println(stack.pop());
	}

}
