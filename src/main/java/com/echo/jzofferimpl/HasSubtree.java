package com.echo.jzofferimpl;

/**
 * 树的子结构
 * 
 * 题目描述
 * 
 * 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 */
public class HasSubtree {
	public boolean hasSubtree(TreeNode root1, TreeNode root2) {
		if (root1 == null || root2 == null)
			return false;
		boolean result = false;
		if (doesTree1HasTree2(root1, root2)) {
			result = true;
		}
		if (!result)
			result = hasSubtree(root1.left, root2);
		if (!result)
			result = hasSubtree(root1.right, root2);
		return result;
	}

	/**
	 * 判断以root1为根的子树是否与root2含有相同的结构
	 */
	public boolean doesTree1HasTree2(TreeNode root1, TreeNode root2) {
		if (root2 == null)
			return true;
		if (root1 == null)
			return false;
		if (root1.val != root2.val)
			return false;
		return doesTree1HasTree2(root1.left, root2.left) && doesTree1HasTree2(root1.right, root2.right);
	}
}
