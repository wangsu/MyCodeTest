/**
 * 
 */
package com.wangsus.codetest.difficulty1;

import java.util.Arrays;

/**
 * @author Su
 * 
 *         Given a sorted array, remove the duplicates in place such that each
 *         element appear only once and return the new length.
 * 
 *         Do not allocate extra space for another array, you must do this in
 *         place with constant memory.
 * 
 *         For example, Given input array A = [1,1,2],
 * 
 *         Your function should return length = 2, and A is now [1,2].
 */
public class Remove_Duplicates_from_Sorted_Array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = { 1, 2, 3, 3, 3, 3, 4, 5, 5, 5 };
		// int[] A = { 1, 1, 1, 2 };
		// int[] A = {-1,0,0,0,0,3,3};
		// int[] A = { 1, 1, 2, 3};
		// int[] A = { 1, 2 };
		// int[] A = { 0, 0, 1, 1, 1, 1, 2, 2, 2, 4 };
		Solution s = new Solution();
		int result = s.removeDuplicates(A);
		System.out.println("result:" + result + "\n");
		A = Arrays.copyOf(A, result);
		for (int value : A) {
			System.out.println(value);
		}
	}

	public static class Solution {
		public int removeDuplicates(int[] A) {
			if (A.length == 0 || A.length == 1) {
				return A.length;
			}
			int slow = 0;
			int fast = 0;
			while (slow < A.length && fast < A.length) {

				if (A[slow] == A[fast]) {
					fast++;
				} else {
					if (slow != fast) {
						System.arraycopy(A, fast, A, slow + 1, A.length - fast);
						slow = slow + 1;
						fast = slow + 1;
					} else {
						slow++;
						fast++;
					}
				}
			}
			for (int i = 0; i < A.length - 1; i++) {
				if (A[i] >= A[i + 1]) {
					return i + 1;
				}
				if (i == A.length - 2) {
					return i + 2;
				}
			}
			return 0;
		}

	}
}
