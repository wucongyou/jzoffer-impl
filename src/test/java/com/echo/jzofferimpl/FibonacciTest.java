package com.echo.jzofferimpl;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.Before;
import org.junit.Test;

public class FibonacciTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		for (int i = 0; i <= 39; i++) {
			int fr = Fibonacci.fibonacci_Recursively(i);
			int fi = Fibonacci.fibonacci_Iterately(i);
			assertThat(fr == fi, is(true));
			System.out.println(fi + " ");
		}
	}

}
