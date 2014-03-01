/**
 * 
 */
package com.wangsus.codetest.difficulty3;

import com.wangsus.codetest.datastructure.TreeNode;

/**
 * @author Su
 *
 *Given a binary tree, determine if it is a valid binary search tree (BST).

Assume a BST is defined as follows:

The left subtree of a node contains only nodes with keys less than the node's key.
The right subtree of a node contains only nodes with keys greater than the node's key.
Both the left and right subtrees must also be binary search trees.
confused what "{1,#,2,3}" means? > read more on how binary tree is serialized on OJ.


OJ's Binary Tree Serialization:
The serialization of a binary tree follows a level order traversal, where '#' signifies a path terminator where no node exists below.

Here's an example:
   1
  / \
 2   3
    /
   4
    \
     5
The above binary tree is serialized as "{1,2,3,#,#,4,#,#,5}".
 */
public class Validate_Binary_Search_Tree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/**
	 * Definition for binary tree
	 * public class TreeNode {
	 *     int val;
	 *     TreeNode left;
	 *     TreeNode right;
	 *     TreeNode(int x) { val = x; }
	 * }
	 */
	public class Solution {
	    public boolean isValidBST(TreeNode root) {
	        return false;
	    }
	}
}
