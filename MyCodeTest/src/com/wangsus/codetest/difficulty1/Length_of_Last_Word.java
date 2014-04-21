/**
 * 
 */
package com.wangsus.codetest.difficulty1;

/**
 * @author Su
 * 
 *         Given a string s consists of upper/lower-case alphabets and empty
 *         space characters ' ', return the length of last word in the string.
 * 
 *         If the last word does not exist, return 0.
 * 
 *         Note: A word is defined as a character sequence consists of non-space
 *         characters only.
 * 
 *         For example, Given s = "Hello World", return 5.
 * 
 */
public class Length_of_Last_Word {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello World";
		Solution s1 = new Solution();
		System.out.println(s1.lengthOfLastWord(s));
	}

	public static class Solution {
		public int lengthOfLastWord(String s) {
			if(s.isEmpty()){
				return 0;
			}else{
				if(!s.contains(" ")){
					return s.length();
				}else{
					return s.length()-s.lastIndexOf(" ")-1;
				}
			}
		}
	}
}
