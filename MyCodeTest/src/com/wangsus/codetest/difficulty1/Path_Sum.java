package com.wangsus.codetest.difficulty1;

import java.util.ArrayList;
import java.util.List;

import com.wangsus.codetest.datastructure.TreeNode;

/**
 * @author Su
 *
 *
 *Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.

For example:
Given the below binary tree and sum = 22,
              5
             / \
            4   8
           /   / \
          11  13  4
         /  \      \
        7    2      1
return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.
 */
public class Path_Sum {

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
	    public boolean hasPathSum(TreeNode root, int sum) {
	    	//try depth first search
	    	List<TreeNode> dfs = new ArrayList<TreeNode>();
	    	List<Integer> cSum = new ArrayList<Integer>();
	    	if(root==null){
	    		return false;
	    	}
    		dfs.add(root);
    		cSum.add(root.val);	    	
	    	while(!dfs.isEmpty()){
	    		TreeNode current = dfs.get(0);
	    		int currentSum = cSum.get(0);
	    		dfs.remove(0);
	    		cSum.remove(0);
	    		if(current.left==null&&current.right==null){
	    			if(currentSum==sum){
	    				return true;
	    			}
	    		}
		    	if(current.right!=null){
		    		dfs.add(0,current.right);
		    		cSum.add(0,currentSum+current.right.val);
		    	}
	    		if(current.left!=null){
		    		dfs.add(0,current.left);
		    		cSum.add(0,currentSum+current.left.val);
		    	}
	    	}
	        return false;
	    }
	}
}
