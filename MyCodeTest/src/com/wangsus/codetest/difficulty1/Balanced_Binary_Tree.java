/**
 * 
 */
package com.wangsus.codetest.difficulty1;

import com.wangsus.codetest.datastructure.TreeNode;

/**
 * @author Su
 *
 *         Given a binary tree, determine if it is height-balanced.
 * 
 *         For this problem, a height-balanced binary tree is defined as a
 *         binary tree in which the depth of the two subtrees of every node
 *         never differ by more than 1.
 */
public class Balanced_Binary_Tree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] a = {1,2,2,3,#,#,3,4,#,#,4};
		TreeNode root = new TreeNode(1);		
		TreeNode l1 = new TreeNode(2);
		TreeNode r1 = new TreeNode(2);
		root.left=l1;
		root.right=r1;
		
		TreeNode l2= new TreeNode(3);
		TreeNode r2= new TreeNode(3);
		l1.left=l2;
		r1.right=r2;
		
		TreeNode l3= new TreeNode(4);
		TreeNode r3= new TreeNode(4);
		l2.left=l3;
		r2.right=r3;
		Solution s = new Solution();
		System.out.println(s.isBalanced(root));
		
	}

	/**
	 * Definition for binary tree public class TreeNode { int val; TreeNode
	 * left; TreeNode right; TreeNode(int x) { val = x; } }
	 */
	public static class Solution {
		public boolean isBalanced(TreeNode root) {
			// Breadth-First-Search
			if (root == null) {
				return true;
			} else {
				if (Math.abs(getDepth(root.left) - getDepth(root.right)) <=1 && isBalanced(root.left) && isBalanced(root.right)) {
					return true;
				} else {
					return false;
				}
			}
		}

		private int getDepth(TreeNode root) {
			if (root == null) {
				return 0;
			}
			return 1 + Math.max(getDepth(root.left), getDepth(root.right));
		}
	}

}
