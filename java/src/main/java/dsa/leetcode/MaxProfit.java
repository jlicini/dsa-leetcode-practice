package dsa.leetcode;

public class MaxProfit {

    public static void main(String[] args) {
        MaxProfit maxProfit = new MaxProfit();
        int profit = maxProfit.solution(new int[]{7,1,1,3,6,4});
        System.out.println(profit);
    }

    //O(n^2) //TO DO
    public int solution(int [] prices){

        int profit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            int actualPrice = prices[i];

            int day = i+1;
            while (day<=prices.length-1){
                if (prices[day]> actualPrice) {
                    profit = Math.max(profit, prices[day]-actualPrice);
                }
                day++;
            }
        }

        return profit;
    }
}
