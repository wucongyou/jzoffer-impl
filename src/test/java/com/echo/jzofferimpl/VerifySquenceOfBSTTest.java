package com.echo.jzofferimpl;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class VerifySquenceOfBSTTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		int[] sequence = { 4, 8, 6, 12, 16, 14, 10 };
		boolean result = VerifySquenceOfBST.verifySquenceOfBST(sequence);
		System.out.println(result);
	}

}
