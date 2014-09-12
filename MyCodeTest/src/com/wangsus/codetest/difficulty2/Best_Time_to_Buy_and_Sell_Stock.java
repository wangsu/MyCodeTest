/**
 * 
 */
package com.wangsus.codetest.difficulty2;


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
		int[] a = { 4, 2, 3, 1 };
		System.out.println("" + s.maxProfit(a));
	}

	public static class Solution {
		public int maxProfit(int[] prices) {
			// it allow sell first then buy it ? maybe not.
			//
			if (prices == null || prices.length < 2) {
				return 0;
			}
			int minD = 0;
			int maxProfit = 0;
			int buy, sell = 0;
			for (int i = 0; i < prices.length; i++) {
				if (prices[i] < prices[minD])
					minD = i;
				int diff = prices[i] - prices[minD];
				if (diff > maxProfit) {
					buy = minD;
					sell = i;
					maxProfit = diff;
				}
			}
			return maxProfit;
		}
	}
}
