package dsa.leetcode;

public class MaxProfit {

    public static void main(String[] args) {
        MaxProfit maxProfit = new MaxProfit();
        int profit = maxProfit.solution(new int[]{7,1,1,3,6,4});
        System.out.println(profit);
    }

    public int solution(int [] prices){

        int profit = 0;
        int minPrice = prices[0];
        for (int i = 0; i < prices.length; i++) {
            int actualPrice = prices[i];
            profit = Math.max(profit, actualPrice - minPrice);
            minPrice = Math.min(minPrice, actualPrice);
        }

        return profit;
    }
}
