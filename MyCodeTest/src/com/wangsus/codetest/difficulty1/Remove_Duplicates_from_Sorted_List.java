/**
 * 
 */
package com.wangsus.codetest.difficulty1;

import com.wangsus.codetest.datastructure.ListNode;

/**
 * @author Su
 *
 *Given a sorted linked list, delete all duplicates such that each element appear only once.

For example,

Given 1->1->2, return 1->2.

Given 1->1->2->3->3, return 1->2->3.

 */
public class Remove_Duplicates_from_Sorted_List {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode(int x) {
	 *         val = x;
	 *         next = null;
	 *     }
	 * }
	 */
	public class Solution {
	    public ListNode deleteDuplicates(ListNode head) {
	    	if(head==null){
	    		return null;
	    	}else{
	    		if(head.next==null){
	    			return head;
	    		}else{
	    			ListNode slow = head;
	    			ListNode fast = head.next;
	    			while(fast!=null){
	    				if(slow.val==fast.val){
	    					fast = fast.next;
	    				}else{
	    					slow.next = fast;
	    					slow = slow.next;
	    					fast = fast.next;	    							
	    				}
	    			}
	    			slow.next=null;
	    		}
	    		return head;
	    	}
	    }
	}
}
