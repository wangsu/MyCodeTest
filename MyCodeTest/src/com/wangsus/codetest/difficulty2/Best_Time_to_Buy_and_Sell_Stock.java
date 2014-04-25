/**
 * 
 */
package com.wangsus.codetest.difficulty2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Su
 *
 *         Say you have an array for which the ith element is the price of a
 *         given stock on day i.
 * 
 *         If you were only permitted to complete at most one transaction (ie,
 *         buy one and sell one share of the stock), design an algorithm to find
 *         the maximum profit.
 *
 */
public class Best_Time_to_Buy_and_Sell_Stock {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		int [] a = {1,2,3,4};
		System.out.println(""+s.maxProfit(a));
	}

	public static class Solution {
		public int maxProfit(int[] prices) {
			// it allow sell first then buy it ? maybe not.
			//
			if (prices == null || prices.length == 0) {
				return 0;
			}
			Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();            
			for (int i = 0; i < prices.length; i++) {
				if (map.containsKey(prices[i])) {
					List<Integer> list = map.get(prices[i]);
					list.add(i);
					Collections.sort(list);
				} else {
					List<Integer> list = new ArrayList<Integer>();
					list.add(i);
					map.put(prices[i], list);
				}
			}
			
			Arrays.sort(prices);
			int buypoint = 0;
			int sellpoint = prices.length - 1;
			int profit = 0;
			while (buypoint != sellpoint) {
				profit = prices[sellpoint] - prices[buypoint];
				if (canDeal(prices[buypoint], prices[sellpoint], map)) {
					return profit;
				} else {
					int profitIncB = prices[sellpoint] - prices[buypoint + 1];
					int profitDecS = prices[sellpoint - 1] - prices[buypoint];
					if (profitIncB < profitDecS) {
						sellpoint--;
					} else {
						buypoint++;
					}
				}
			}
			return 0;
		}

		private boolean canDeal(int buyD, int sellD,
				Map<Integer, List<Integer>> map) {
			List<Integer> blist = map.get(buyD);
			List<Integer> slist = map.get(sellD);
			if (blist.get(0) > slist.get(slist.size() - 1)) {
				return false;
			} else {
				return true;
			}
		}
	}
}
