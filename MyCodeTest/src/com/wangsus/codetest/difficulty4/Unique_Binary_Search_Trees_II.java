/**
 * 
 */
package com.wangsus.codetest.difficulty4;

import java.util.ArrayList;

import com.wangsus.codetest.datastructure.TreeNode;

/**
 * @author Su
 * 
 *         Given n, generate all structurally unique BST's (binary search trees)
 *         that store values 1...n.
 * 
 *         For example, Given n = 3, your program should return all 5 unique
 *         BST's shown below.
 * 
 * 			
 *         1 3 3 2 1
 * 
 *         \ / / / \ \
 * 
 *         3 2 1 1 3 2
 * 
 *         / / \ \
 * 
 *         2 1 2 3
 *         
 *         {1,#,2,3}
 *         
 *         {3,2,#,1}
 *         
 *         {3,1,#,#,2}
 *         
 *         {2,1,3}
 *         
 *         {1,#,2,#,3}
 * 
 *         confused what "{1,#,2,3}" means? > read more on how binary tree is
 *         serialized on OJ.
 *         
 *         The serialization of a binary tree follows a level order traversal, where '#' signifies a path terminator where no node exists below.

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
public class Unique_Binary_Search_Trees_II {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/**
	 * Definition for binary tree public class TreeNode { int val; TreeNode
	 * left; TreeNode right; TreeNode(int x) { val = x; left = null; right =
	 * null; } }
	 */
	public class Solution {
		public ArrayList<TreeNode> generateTrees(int n) {
			return null;
		}
	}
}
