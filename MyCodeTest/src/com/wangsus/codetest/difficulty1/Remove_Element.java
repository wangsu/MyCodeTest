/**
 * 
 */
package com.wangsus.codetest.difficulty1;

/**
 * @author Su
 * 
 *         Given an array and a value, remove all instances of that value in
 *         place and return the new length.
 * 
 *         The order of elements can be changed. It doesn't matter what you
 *         leave beyond the new length.
 */
public class Remove_Element {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		int[] a = { 2, 2, 3 };
		System.out.println(s.removeElement(a, 2));

		int[] b = { 3, 3 };
		System.out.println(s.removeElement(b, 3));

		int[] c = { 2, 3, 3 };
		System.out.println(s.removeElement(c, 3));

		int[] d = { 0, 4, 4, 0, 4, 4, 4, 0, 2 };
		System.out.println(s.removeElement(d, 4));

		int[] e = { 2, 1, 3, 0, 1, 1, 0, 3, 3, 1, 3 };

		System.out.println(s.removeElement(e, 3));

		int[] f = { 1, 2, 3, 4 };

		System.out.println(s.removeElement(f, 1));

		int[] g = { 1, 2, 0, 0, 1, 2, 1, 1, 4, 0, 4, 0 };
		System.out.println(s.removeElement(g, 1));

		int[] h = { 0, 3, 1, 1, 0, 1, 3, 0, 3, 3, 1, 1 };
		System.out.println(s.removeElement(h, 1));
	}

	public static class Solution {
		public int removeElement(int[] A, int elem) {
			int i=0, j=0;
	        while(j<A.length){
	            if(A[j]!=elem){
	                A[i]=A[j];
	                i++; 
	            }
	            j++;
	        }
	        return i;
		}
	}
}
