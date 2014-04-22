/**
 * 
 */
package com.wangsus.codetest.difficulty1;

import java.util.ArrayList;
import java.util.List;

import com.wangsus.codetest.datastructure.TreeNode;

/**
 * @author Su
 *
 *         Given a binary tree, check whether it is a mirror of itself (ie,
 *         symmetric around its center).
 * 
 *         For example, this binary tree is symmetric:
 * 
 *         1 / \ 2 2 / \ / \ 3 4 4 3 But the following is not: 1 / \ 2 2 \ \ 3 3
 *         Note: Bonus points if you could solve it both recursively and
 *         iteratively.
 */
public class Symmetric_Tree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/**
	 * Definition for binary tree public class TreeNode { int val; TreeNode
	 * left; TreeNode right; TreeNode(int x) { val = x; } }
	 */
	public class Solution {
		public boolean isSymmetric(TreeNode root) {
			List<TreeNode> bfs_left = new ArrayList<TreeNode>();
			List<TreeNode> bfs_right = new ArrayList<TreeNode>();
			if (root == null) {
				return true;
			} else {
				bfs_left.add(root);
				bfs_right.add(root);
				while (!bfs_left.isEmpty() && !bfs_right.isEmpty()) {
					TreeNode current_left = bfs_left.get(0);
					TreeNode current_right = bfs_right.get(0);
					bfs_left.remove(0);
					bfs_right.remove(0);
					if (current_left.val != current_right.val) {
						return false;
					} else {
						if (current_left.left != null
								&& current_right.right != null) {
							bfs_left.add(current_left.left);
							bfs_right.add(current_right.right);
						} else {
							if (current_left.left != null
									&& current_right.right == null) {
								return false;
							}
							if (current_left.left == null
									&& current_right.right != null) {
								return false;
							}
						}
						if (current_left.right != null
								&& current_right.left != null) {
							bfs_left.add(current_left.right);
							bfs_right.add(current_right.left);
						} else {
							if (current_left.right != null
									&& current_right.left == null) {
								return false;
							}
							if (current_left.right == null
									&& current_right.left != null) {
								return false;
							}
						}
					}
				}
				if (bfs_left.size() == bfs_right.size()) {
					return true;
				} else {
					return false;
				}
			}
		}
	}
}
