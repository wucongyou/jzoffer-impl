package com.echo.jzofferimpl;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CloneTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		RandomListNode pHead = new RandomListNode(1);
		RandomListNode p2 = new RandomListNode(2);
		RandomListNode p3 = new RandomListNode(3);
		RandomListNode p4 = new RandomListNode(4);
		RandomListNode p5 = new RandomListNode(5);
		pHead.next = p2;
		p2.next = p3;
		p3.next = p4;
		p4.next = p5;
		pHead.random = p3;
		p2.random = p5;
		p4.random = p2;
		Clone.cloneComplexList(pHead);
	}

}
