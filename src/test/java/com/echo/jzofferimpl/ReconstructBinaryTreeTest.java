package com.echo.jzofferimpl;

import org.junit.Before;
import org.junit.Test;

public class ReconstructBinaryTreeTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testReConstructBinaryTree() {
		int[] pre={1,2,4,7,3,5,6,8};
		int[] in={4,7,2,1,5,3,8,6};
		TreeNode root=ReconstructBinaryTree.reConstructBinaryTree(pre, in);
		BinTreeUtil.showTree(root);
		
	}

}
