class Solution {
    public int maxProfit(int[] prices) {
        int start =0;
        int end =1;
        int[] profit = new int[prices.length-1];
        if (prices.length==1){
            return 0;
        }
        while(end<prices.length){
            profit[start]=prices[end]-prices[start];
            end++;
            start++;
        }
        int curr =0;
        int maxsum=0;
        for(int i =0;i<profit.length;i++){
            curr+=profit[i];
            maxsum=Math.max(curr,maxsum);
            if(curr<0){
                curr=0;
            }
        }
        return maxsum;

    }
}