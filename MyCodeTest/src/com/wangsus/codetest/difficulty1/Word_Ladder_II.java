/**
 * 
 */
package com.wangsus.codetest.difficulty1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * @author Su
 * 
 * Given two words (start and end), and a dictionary, find all shortest transformation sequence(s) from start to end, such that:

Only one letter can be changed at a time
Each intermediate word must exist in the dictionary
For example,

Given:
start = "hit"
end = "cog"
dict = ["hot","dot","dog","lot","log"]
Return
  [
    ["hit","hot","dot","dog","cog"],
    ["hit","hot","lot","log","cog"]
  ]
Note:
All words have the same length.
All words contain only lowercase alphabetic characters.

frequency 1 
difficulty should be 3 or 4.
 */
public class Word_Ladder_II {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public class Solution {
		public ArrayList<ArrayList<String>> findLadders(String start,
				String end, HashSet<String> dict) {
			//question?
			//could repeat? should not. otherwise no meaning.
			//
			if(!dict.contains(end)){
				return null;
			}
			ArrayList<ArrayList<String>> ret = new ArrayList<ArrayList<String>>();
			ArrayList<HashSet<String>> listSet = new ArrayList<HashSet<String>>();
			Iterator<String> itr = dict.iterator();
			while(itr.hasNext()){
				String dictStr = itr.next();
				if(diffOneLetter(start,dictStr)){
					ArrayList<String> stringList = new ArrayList<String>();
					stringList.add(start);
					stringList.add(dictStr);
					ret.add(stringList);
				}
			}
			
			
			return ret;
		}
		
		private boolean diffOneLetter(String str1, String str2){
			int diff = 0;
			if(str1!=null&&str2!=null){
				if(str1.length()!=str2.length()){
					return false;
				}else{
					for(int i=0;i<str1.length();i++){
						if(str1.charAt(i)!=str2.charAt(i)){
							diff++;
						}
					}
				}
			}else{
				return false;
			}
			if(diff==1){
				return true;
			}else{
				return false;
			}
		}
	}
}
