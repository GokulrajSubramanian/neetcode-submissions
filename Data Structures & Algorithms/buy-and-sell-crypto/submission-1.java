class Solution {
    public int maxProfit(int[] prices) {
        
        int profit=0;
        int maxProfit=0;
        int left=0;
        for(int right=0; right<prices.length; right++){
            profit = prices[right]- prices[left];
            maxProfit = Math.max(maxProfit, profit);
            if(prices[right]<prices[left]){
                left=right;
            }
        }
        return maxProfit;
    }
}
