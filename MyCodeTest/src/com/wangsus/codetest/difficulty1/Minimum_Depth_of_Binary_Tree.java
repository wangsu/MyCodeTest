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
			// need to do Breadth-first search!!!
			List<TreeNode> nextNodes = new ArrayList<TreeNode>();
			List<Integer> distanceFromRoot = new ArrayList<Integer>();
			if (root == null) {
				return 0;
			}
			if (root.left != null) {
				nextNodes.add(root.left);
				distanceFromRoot.add(2);
			}
			if (root.right != null) {
				nextNodes.add(root.right);
				distanceFromRoot.add(2);
			}
			while (!nextNodes.isEmpty()) {
				TreeNode next = nextNodes.get(0);
				int distance = distanceFromRoot.get(0);
				if (next.left == null && next.right == null) {
					return distance;
				} else {
					nextNodes.remove(0);
					distanceFromRoot.remove(0);
					if (next.left != null) {
						nextNodes.add(next.left);
						distanceFromRoot.add(distance + 1);
					}
					if (next.right != null) {
						nextNodes.add(next.right);
						distanceFromRoot.add(distance + 1);
					}
				}
			}
			return 1;
		}
	}
}
