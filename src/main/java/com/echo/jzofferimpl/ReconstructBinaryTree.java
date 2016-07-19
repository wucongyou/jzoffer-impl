package com.echo.jzofferimpl;

/**
 * 重建二叉树
 * 
 * 题目描述
 * 
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。例如输入前序遍历序列{1,2,4,7,3,
 * 5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 */
public class ReconstructBinaryTree {
	
	public static TreeNode reConstructBinaryTree(int[] pre, int[] in) {
		if (pre == null || in == null)
			return null;
		if (pre.length != in.length)
			return null;
		return constructCore(pre, in, 0, pre.length - 1, 0, in.length - 1);
	}

	private static TreeNode constructCore(int[] pre, int[] in, int preStart, int preEnd, int inStart, int inEnd) {
		int lenSeqPre = preEnd - preStart;// 先序序列长度
		int lenSeqIn = inEnd - inStart;// 中序序列长度

		// 检查先序序列长度与中序序列长度
		if (lenSeqPre != lenSeqIn) {
			throw new RuntimeException("先序序列长度与中序序列长度不一致");
		}
		if (preStart < 0 || inStart < 0)
			throw new RuntimeException("数组下标为负，出错");
		if (preStart >= pre.length || inStart >= in.length)
			return null;

		if (lenSeqPre < 0 || lenSeqIn < 0) {
			return null;
		}
		int val = pre[preStart];
		TreeNode root = new TreeNode(val);

		// 递归出口
		// 当仅有一个节点时
		if (preEnd - preStart == 0) {
			// 当仅有一个节点且先序与中序序列不一致说明输入的序列
			if (val != in[inStart]) {
				throw new RuntimeException("二叉树序列输入有误");
			}
			return root;
		}

		// 在中序序列中寻找到根节点所在的位置
		int valIn = inStart;
		while (valIn <= inEnd) {
			if (in[valIn] == val)
				break;
			else
				++valIn;
		}
		int leftLen = valIn - inStart;// 分割后的左子树序列长度
		root.left = constructCore(pre, in, preStart + 1, preStart + leftLen, inStart, valIn - 1);
		root.right = constructCore(pre, in, preStart + leftLen + 1, preEnd, valIn + 1, inEnd);
		return root;
	}
}
