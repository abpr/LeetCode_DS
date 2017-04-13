package com.leet.www;

public class MaximumDepth {
	/**
	 * Definition for a binary tree node. public class TreeNode { int val;
	 * TreeNode left; TreeNode right; TreeNode(int x) { val = x; } }
	 */
	public int maxDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}
		if (root.left == null && root.right == null)
			return 1;

		int ldepth = 0, rdepth = 0;
		if (root.left != null)
			ldepth = maxDepth(root.left);
		if (root.right != null)
			rdepth = maxDepth(root.right);

		if (ldepth > rdepth)
			return ldepth + 1;
		else
			return rdepth + 1;
	}
}
