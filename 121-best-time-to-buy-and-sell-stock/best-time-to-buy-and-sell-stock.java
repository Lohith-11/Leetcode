class Solution {
    public int maxProfit(int[] prices) {
        int buy=Integer.MAX_VALUE;
        int ans=0;
        for(int i=0;i<prices.length;i++){
            if(buy<prices[i]){
                ans=Math.max((prices[i]-buy),ans);
            }else{
                buy=prices[i];
            }
        }
        return ans;
    }
}