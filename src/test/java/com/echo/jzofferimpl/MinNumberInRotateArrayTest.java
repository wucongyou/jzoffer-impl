package com.echo.jzofferimpl;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MinNumberInRotateArrayTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		//int[] array={3,4,5,1,2};
		int[] array={1,0,1,1,1};
		int min=MinNumberInRotateArray.minNumberInRotateArray(array);
		System.out.println(min);
	}

}
