class Solution {
    public void swap(int[] nums, int a , int b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
    public int firstMissingPositive(int[] nums) {
        int a= 0;
        while(a<nums.length){
            if(nums[a]>0&&nums[a]<=nums.length){
                if(nums[a]==nums[nums[a]-1]){
                    a++;
                }
                else{
                    swap(nums,a,nums[a]-1);
                }
            }
            else{
                a++;
            }
        }
        for(int i =0;i<nums.length;i++){
            if(nums[i]!=i+1){
                return i+1;
            }
        }
        return nums.length + 1;
    }
}