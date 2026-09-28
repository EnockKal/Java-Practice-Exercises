package com.enock;

public class Best_Time_to_Buy_and_Sell_Stock {
    public static void main(String[] args) {
        int[] prices = {2, 6, 1, 4, 7, 3, 8};

        System.out.println(bestTime(prices));
    }

    private static int bestTime(int[] prices) {
        int totalProfit = 0;

        for (int i = 1; i < prices.length; i++){
            if (prices[i] > prices[i - 1]){
                totalProfit += prices[i] - prices[i - 1];
            }
        }
        return totalProfit;
    }
}
