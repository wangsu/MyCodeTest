/**
 * 
 */
package com.wangsus.codetest.difficulty1;

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

	}

	public class Solution {
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
					digits[i] = digits[i]-10;
					needUp = true;
				}
			}
			return digits;
		}
	}
}
