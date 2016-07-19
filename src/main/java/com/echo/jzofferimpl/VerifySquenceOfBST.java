package com.echo.jzofferimpl;

/**
 * 二叉搜索树的后序遍历序列
 * 
 * 题目描述
 * 
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
 */
public class VerifySquenceOfBST {
	public static boolean verifySquenceOfBST(int[] sequence) {
		if (sequence == null || sequence.length == 0)
			return false;
		return verifySquenceOfBST(sequence, 0, sequence.length - 1);
	}

	public static boolean verifySquenceOfBST(int[] sequence, int start, int end) {
		if (start > end)
			return true;
		int root = sequence[end];
		int i = start;
		for (; i < end; i++) {
			if (sequence[i] > root)
				break;
		}
		int j = i;
		for (; j < end; j++) {
			if (sequence[j] < root)
				return false;
		}
		boolean left = verifySquenceOfBST(sequence, start, i - 1);
		boolean right = verifySquenceOfBST(sequence, i, end - 1);
		return left && right;
	}
}
