package com.echo.jzofferimpl;

import java.util.LinkedList;
import java.util.Queue;
/**
 * 二叉树的镜像
 * 
 * 题目描述

操作给定的二叉树，将其变换为源二叉树的镜像。 
输入描述:
二叉树的镜像定义：源二叉树 
    	    8
    	   /  \
    	  6   10
    	 / \  / \
    	5  7 9 11
    	镜像二叉树
    	    8
    	   /  \
    	  10   6
    	 / \  / \
    	11 9 7  5
 * */
public class Mirror {
	public void mirror(TreeNode root) {
		if (root == null)
			return;
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.offer(root);
		while (!queue.isEmpty()) {
			TreeNode p = queue.poll();
			// 交换左右节点
			TreeNode tmp = p.left;
			p.left = p.right;
			p.right = tmp;
			if (p.left != null)
				queue.offer(p.left);
			if (p.right != null)
				queue.offer(p.right);
		}
	}
}
