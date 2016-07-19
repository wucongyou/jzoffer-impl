package com.echo.jzofferimpl;

public class BinTreeUtil {
	public static void showTree(TreeNode root) {
		showSubTree(root, 0, "");
	}

	private static void printSomething(int x, String str) {
		for (int i = 0; i < x; i++)
			System.out.print(str);
	}

	private static void showSubTree(TreeNode root, int level, String prefix) {
		if (root == null)
			return;
		printSomething(level << 2, " ");
		printSomething(1, prefix);
		printSomething(3, level == 0 ? " " : "-");
		System.out.println(root.val);
		showSubTree(root.left, level + 1, "<");
		showSubTree(root.right, level + 1, ">");
	}
}
