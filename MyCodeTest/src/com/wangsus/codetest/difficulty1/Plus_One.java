/**
 * 
 */
package com.wangsus.codetest.difficulty1;

import java.util.Arrays;

/**
 * @author Su
 * 
 *         Given a non-negative number represented as an array of digits, plus
 *         one to the number.
 * 
 *         The digits are stored such that the most significant digit is at the
 *         head of the list.
 */
public class Plus_One {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test = {9};
		Solution s = new Solution();
		int[] result = s.plusOne(test);
		for(int value :result){
			System.out.println(value);
		}
	}

	public static class Solution {
		public int[] plusOne(int[] digits) {
			boolean needUp = false;
			for (int i = 0; i < digits.length; i++) {
				if (i == 0) {
					digits[i] = digits[i] + 1;
				}
				if (needUp) {
					digits[i] = digits[i] + 1;
					needUp = false;
				}
				if (digits[i] >= 10) {
					digits[i] = digits[i] - 10;
					needUp = true;
				}
			}
			if (needUp) {
				// Arrays.copyOf and Arrays.copyOfRange in Java are used to copy
				// array from an array. The resulting array will be truncated
				// array. Arrays.copyOf accpets the original array and the
				// length to truncate the array as an argument. It starts from
				// zero indexes. If the length is given greater than original
				// array, the rest of the index is filled by zero.
				// Arrays.copyOfRange accepts the original array and to and from
				// index to truncate the array.

				digits = Arrays.copyOf(digits, digits.length + 1);
				digits[digits.length - 1] = 1;
			}
			return digits;
		}
	}
}
