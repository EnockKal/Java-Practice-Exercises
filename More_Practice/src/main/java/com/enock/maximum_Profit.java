package com.enock;

public class maximum_Profit {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }

    private static int maxProfit(int[] prices) {
        int lowestPrice = prices[0];
        int bestProfit = 0;

        for (int i = 1; i < prices.length; i++){
            if (lowestPrice > prices[i])
                lowestPrice = prices[i];

            if ((prices[i] - lowestPrice) > bestProfit)
                bestProfit = prices[i] - lowestPrice;

        }

        return bestProfit;
    }
}
