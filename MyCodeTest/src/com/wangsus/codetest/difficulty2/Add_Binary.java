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
	    	//remember string is from left to right, int is reverse.	    	
	    	if(a==null){
	    		return b;
	    	}
	    	if(b==null){
	    		return a;
	    	}
	    	String front_number = "";
	    	String equal_a = "";
	    	String equal_b = "";
	    	if(a.length()>b.length()){
	    		front_number = a.substring(0, a.length()-b.length());
	    		equal_a = a.substring(a.length()-b.length(),a.length());
	    		equal_b = b;
	    	}else{
	    		front_number = b.substring(0, b.length()-a.length());
	    		equal_a = a;
	    		equal_b = b.substring(b.length()-a.length(),b.length());
	    	}
	    	boolean up = false;
	    	StringBuilder sb_e_a = new StringBuilder();
	    	sb_e_a.append(equal_a);
	    	StringBuilder sb_e_b = new StringBuilder();
	    	sb_e_b.append(equal_b);

	    	for(int i=sb_e_a.length()-1;i>=0;i--){
	    		if(up){
		    		if(addTwoChar(sb_e_a.charAt(i),sb_e_b.charAt(i))==0){
		    			sb_e_a.setCharAt(i, '1');
		    			up = false;
		    		}else if(addTwoChar(sb_e_a.charAt(i),sb_e_b.charAt(i))==1){
		    			sb_e_a.setCharAt(i, '0');
		    			up = true;
		    		}else if(addTwoChar(sb_e_a.charAt(i),sb_e_b.charAt(i))==2){
		    			sb_e_a.setCharAt(i, '1');
		    			up = true;
		    		}
	    		}else{
	    			if(addTwoChar(sb_e_a.charAt(i),sb_e_b.charAt(i))==0){
		    			sb_e_a.setCharAt(i, '0');
		    			up = false;
		    		}else if(addTwoChar(sb_e_a.charAt(i),sb_e_b.charAt(i))==1){
		    			sb_e_a.setCharAt(i, '1');
		    			up = false;
		    		}else if(addTwoChar(sb_e_a.charAt(i),sb_e_b.charAt(i))==2){
	    				sb_e_a.setCharAt(i, '0');
		    			up = true;
		    		}
	    		}
	    	}
	    	if(up){
	    		StringBuilder sb_front = new StringBuilder();
	    		sb_front.append(front_number);
	    		for(int i=sb_front.length()-1;i>=0;i--){
	    			if(up){
			    		if(sb_front.charAt(i)=='0'){
			    			sb_front.setCharAt(i, '1');
			    			up = false;
			    		}else if(sb_front.charAt(i)=='1'){
			    			sb_front.setCharAt(i, '0');
			    			up = true;
			    		}else if(sb_front.charAt(i)=='2'){
			    			sb_front.setCharAt(i, '1');
			    			up = true;
			    		}
		    		}else{
		    			if(sb_front.charAt(i)=='2'){
		    				sb_front.setCharAt(i, '0');
			    			up = true;
			    		}
		    		}
	    		}
	    		if(up){
	    			return "1"+sb_front.toString()+sb_e_a.toString();
	    		}else{
	    			return sb_front.toString()+sb_e_a.toString();
	    		}
	    	}else{
	    		return front_number+sb_e_a.toString();
	    	}	        
	    }
	    
	    private int addTwoChar(char a, char b){
	    	int aa = 0;
	    	int bb = 0;
	    	try{
	    		aa = Character.getNumericValue(a);
	    	}catch(Exception e){	    		
	    	}
	    	try{
	    		bb = Character.getNumericValue(b);
	    	}catch(Exception e){	    		
	    	}
	    	return aa+bb;
	    }
	}
}
