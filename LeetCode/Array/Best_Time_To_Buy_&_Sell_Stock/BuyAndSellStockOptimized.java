import java.util.*;

class Solution2 {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];  // Update the lowest price so far
            } else {
                int profit = prices[i] - minPrice;
                if (profit > maxProfit) {
                    maxProfit = profit;  // Update max profit if higher
                }
            }
        }
        return maxProfit;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of days of stock price values you have with you:");
        int stockDays = sc.nextInt();
        int[] prices = new int[stockDays];
        System.out.println("Enter the stock price in Oldest to latest fashion:");
        for (int i = 0; i < stockDays; i++) {
            prices[i] = sc.nextInt();
        }

        Solution sol = new Solution();
        int store = sol.maxProfit(prices);
        System.out.println("The maximum Profit you will achieve is: " + store);
    }
}

