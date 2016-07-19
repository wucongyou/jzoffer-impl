package com.echo.jzofferimpl;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ReplaceBlankTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testReplaceSpaces() {
		StringBuffer str=new StringBuffer("hello world");
		String newStr=ReplaceBlank.replaceSpace(str);
		System.out.println(newStr);
	}

}
