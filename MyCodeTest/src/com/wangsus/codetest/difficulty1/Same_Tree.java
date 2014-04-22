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
 *         Given two binary trees, write a function to check if they are equal
 *         or not.
 * 
 *         Two binary trees are considered equal if they are structurally
 *         identical and the nodes have the same value.
 */
public class Same_Tree {

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
		public boolean isSameTree(TreeNode p, TreeNode q) {
			// just do a same search then we can find is same or not.
			// search is not enough....need consider this situation {1,2}, {1,#,2} 
			List<TreeNode> BFS_P = new ArrayList<TreeNode>();
			List<TreeNode> BFS_Q = new ArrayList<TreeNode>();
			if (p != null) {
				BFS_P.add(p);
			}
			if (q != null) {
				BFS_Q.add(q);
			}
			while (!BFS_P.isEmpty() && !BFS_Q.isEmpty()) {
				TreeNode current_P = BFS_P.get(0);
				TreeNode current_Q = BFS_Q.get(0);
				BFS_P.remove(0);
				BFS_Q.remove(0);
				if (current_P.val != current_Q.val) {
					return false;
				} else {
					if (current_P.left != null&&current_Q.left != null) {
						BFS_P.add(current_P.left);
						BFS_Q.add(current_Q.left);
					}else{
						if(current_P.left != null&&current_Q.left == null){
							return false;
						}
						if(current_P.left == null&&current_Q.left != null){
							return false;
						}
					}
					if (current_P.right != null&&current_Q.right != null) {
						BFS_P.add(current_P.right);
						BFS_Q.add(current_Q.right);
					}else{
						if(current_P.right != null&&current_Q.right == null){
							return false;
						}
						if(current_P.right == null&&current_Q.right != null){
							return false;
						}
					}
				}
			}
			if (BFS_P.size() != BFS_Q.size()) {
				return false;
			} else {
				return true;
			}
		}
	}
}
