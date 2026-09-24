class Solution {
    public int smallestIndex(int[] nums) {
        for(int i =0;i<nums.length;i++){
            if(nums[i]==0){
                if(i==0){
                    return 0;
                }
            }
            else{
                int x=(int)Math.log10(nums[i]);
                int sum=0;
                for(int j=0;j<x+1;j++){
                    sum+=nums[i]%10;
                    nums[i]=nums[i]/10;
                }
                if(sum==i){
                    return i;
                }
            }
        }
        return -1;
    }
}