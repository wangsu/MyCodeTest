/**
 * 
 */
package com.wangsus.codetest.difficulty1;

import com.wangsus.codetest.datastructure.TreeNode;

/**
 * @author Su
 * 
 *         Given a binary tree, find its minimum depth.
 * 
 *         The minimum depth is the number of nodes along the shortest path from
 *         the root node down to the nearest leaf node.
 */
public class Minimum_Depth_of_Binary_Tree {

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
		public int minDepth(TreeNode root) {
			// need to do depth first search.
			if (root == null) {
				return 0;
			} else {
				int left = getDepth(root.left);
				int right = getDepth(root.right);
				if (left != 0 && right != 0) {
					if (left < right) {
						return 1 + left;
					} else {
						return 1 + right;
					}
				}else{
					if(left==0){
						return 1 + right;
					}else{
						return 1 + left;
					}
				}
			}
		}

		private int getDepth(TreeNode node) {
			if (node == null) {
				return 0;
			} else {
				return 1 + Math.max(getDepth(node.left), getDepth(node.right));
			}
		}
	}
}
