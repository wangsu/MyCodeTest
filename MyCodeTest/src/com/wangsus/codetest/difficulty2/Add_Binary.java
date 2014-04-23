/**
 * 
 */
package com.wangsus.codetest.difficulty2;

/**
 * @author Su
 *
 *Given two binary strings, return their sum (also a binary string).

For example,
a = "11"
b = "1"
Return "100".
 */
public class Add_Binary {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String thisA = "0";
		String thisB = "1";
		Solution s = new Solution();
		System.out.println(s.addBinary(thisA,thisB));
	}
	public static class Solution {
	    public String addBinary(String a, String b) {
	    	//need ask the length , need consider overflow. seems cannot convert to int for extra long string.
	    	long aa = 0;
	    	long bb = 0;
	    	try{
	    		aa = Long.parseLong(a);	    		
	    	}catch(Exception e){	    		
//	    		System.out.println("Something Wrong.");
	    	}
	    	try{
	    		bb = Long.parseLong(b);
	    	}catch(Exception e){
//	    		System.out.println("Something Wrong.");
	    	}
	    	long total = aa+bb;
	    	System.out.println("aa:"+aa+":bb:"+bb+":total:"+total);
	    	String totalStr = ""+total;
	    	boolean up = false;
	    	StringBuilder sb = new StringBuilder();
	    	sb.append(totalStr);
	    	//remember string is from left to right, int is reverse.
	    	for(int i=sb.length()-1;i>=0;i--){
	    		if(up){
		    		if(sb.charAt(i)=='0'){
		    			sb.setCharAt(i, '1');
		    			up = false;
		    		}else if(sb.charAt(i)=='1'){
		    			sb.setCharAt(i, '0');
		    			up = true;
		    		}else if(sb.charAt(i)=='2'){
		    			sb.setCharAt(i, '1');
		    			up = true;
		    		}
	    		}else{
	    			if(sb.charAt(i)=='2'){
		    			sb.setCharAt(i, '0');
		    			up = true;
		    		}
	    		}
	    	}
	    	if(up){
	    		return "1"+sb.toString();
	    	}else{
	    		return sb.toString();
	    	}	        
	    }
	}
}
