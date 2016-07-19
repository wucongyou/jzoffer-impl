package com.echo.jzofferimpl;

import java.util.ArrayList;

public class FindPath {
	public static ArrayList<ArrayList<Integer>> findPath(TreeNode root, int target) {
		ArrayList<ArrayList<Integer>> lists = new ArrayList<ArrayList<Integer>>();
		if (root == null)
			return lists;
		ArrayList<Integer> list = new ArrayList<Integer>();
		findPath(lists, list, root, target, 0);
		return lists;
	}

	public static void findPath(ArrayList<ArrayList<Integer>> lists, ArrayList<Integer> list, TreeNode root, int target,
			int currentSum) {
		currentSum += root.val;
		list.add(root.val);
		boolean isLeaf = root.left == null && root.right == null;
		if (currentSum == target && isLeaf) {
			ArrayList<Integer> newList = new ArrayList<Integer>(list.size());
			for (Integer e : list) {
				newList.add(e);
			}
			lists.add(newList);
		}
		if (currentSum < target) {
			if (root.left != null)
				findPath(lists, list, root.left, target, currentSum);
			if (root.right != null)
				findPath(lists, list, root.right, target, currentSum);
		}
		list.remove(list.size() - 1);
		currentSum -= root.val;
	}
}
