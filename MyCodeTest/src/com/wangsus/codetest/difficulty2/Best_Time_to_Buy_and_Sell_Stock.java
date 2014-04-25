/**
 * 
 */
package com.wangsus.codetest.difficulty2;

import java.util.ArrayList;
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

	}

	public class Solution {
		public int maxProfit(int[] prices) {
			// it allow sell first then buy it ? maybe not.
			//
			if (prices == null || prices.length == 0) {
				return 0;
			}
			int profit = 0;
			for (int i = 0; i < prices.length; i++) {
				for (int j = i + 1; j < prices.length; j++) {
					if (prices[j] - prices[i] - profit > 0) {
						profit = prices[j] - prices[i];
					}
				}
			}
			return profit;
		}
	}
}
