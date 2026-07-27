class Solution {
    public int findNumbers(int[] nums) {
        int len1=nums.length;
        int k =0;
        for(int i =0;i<len1;i++){
            int l=((int)Math.log10(nums[i]))-1;
            if((l%2)==0){
                k++;
            }
            else{
                continue;
            }
        }
        return k;
        
    }
}