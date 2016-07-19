package com.echo.jzofferimpl;

/**
 * 二叉搜索树与双向链表
 * 
 * 题目描述
 * 
 * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。要求不能创建任何新的结点，只能调整树中结点指针的指向。
 */
public class Convert {

	public TreeNode convert(TreeNode pRootOfTree) {
		TreeNode pLastNodeInList = convert(pRootOfTree, null);
		TreeNode pHead = pLastNodeInList;
		while (pLastNodeInList != null && pHead.left != null) {
			pHead = pHead.left;
		}
		return pHead;
	}

	public TreeNode convert(TreeNode root, TreeNode pLastNodeInList) {
		if (root == null)
			return pLastNodeInList;
		if (root.left != null) {
			pLastNodeInList = convert(root.left, pLastNodeInList);
		}
		root.left = pLastNodeInList;
		if (pLastNodeInList != null) {
			pLastNodeInList.right = root;
		}
		pLastNodeInList = root;
		if (root.right != null) {
			pLastNodeInList = convert(root.right, pLastNodeInList);
		}
		return pLastNodeInList;
	}
}
