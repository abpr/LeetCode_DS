package com.leet.www;

/*
 * 
 * Say you have an array for which the ith element is the price of a given stock on day i.

Design an algorithm to find the maximum profit. You may complete only 1 transaction 
(ie, buy one and sell one share of the stock multiple times). However, 
you may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).
*/
public class Stocks1 {
	
	 public int maxProfit(int[] prices) {
	        if(prices.length<2)
	            return 0;
	        int profit = 0;
	        int maxPointer = 1;
	        int minPointer = 0;
	        int pointer2 = 1;
	        int sofarmin = prices[0];
	        /*for(int i=prices.length-1;i>0;i--)
	        {
	            for(int j=i-1;j>=0;j--)
	            {
	                    if(prices[i] - prices[j] > max && i>j)
	                        max = prices[i] - prices[j];
	            }
	        }*/
	        for(int i=1;i<prices.length;i++)
	        {
	            if(prices[i] > sofarmin)
	            {
	                profit = Math.max(profit, prices[i] - sofarmin);
	            }
	            else
	            {
	                sofarmin = prices[i];
	            }
	        }
	        return profit;
	    }
	
}
