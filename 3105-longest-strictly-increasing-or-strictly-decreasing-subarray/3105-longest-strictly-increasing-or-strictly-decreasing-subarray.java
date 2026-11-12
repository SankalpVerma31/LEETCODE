class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        if(nums.length==1){
            return 1;
        }
        int inc=1;
        int dec=1;
        int max=0;
        int i=0;
        while(i<nums.length-1){
            if(nums[i+1]>nums[i]){
                inc++;
            }
            else{
                max=Math.max(inc,max);
                inc=1;
            }
            max=Math.max(inc,max);
            i++;
        }
        i=0;
        int MAX =0;
        while(i<nums.length-1){
            if(nums[i+1]<nums[i]){
                dec++;
            }
            else{
                MAX=Math.max(dec,MAX);
                dec=1;
            }
            MAX=Math.max(dec,MAX);
            i++;
        }
        return Math.max(max,MAX);
    }
}