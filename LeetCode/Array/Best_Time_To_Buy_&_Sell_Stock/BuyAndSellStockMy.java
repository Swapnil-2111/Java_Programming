import java.util.*;
class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        int max=0;
        int n=prices.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(prices[j]>prices[i]){
                    max=prices[j]-prices[i];
                    if(max>maxProfit){
                        maxProfit=max;
                    }
                }
                if(prices[i]>prices[j]){
                    maxProfit=maxProfit+0;
                }
            }
        }
        // System.out.println(maxProfit);
        return maxProfit;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of days of stock price values you have with you:");
        int stockDays=sc.nextInt();
        int[] prices=new int[stockDays];
        System.out.println("Enter the stock price in Oldest to latest fashion:");
        for(int i=0;i<stockDays;i++){
            prices[i]=sc.nextInt();
        }
        Solution sol=new Solution();
        int store=sol.maxProfit(prices);
        System.out.println("The maximum Profit you will achieve is:"+store);
    }
}