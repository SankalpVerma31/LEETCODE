class Solution {
    public void swap(int[] nums, int a , int b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
    public int[] findErrorNums(int[] nums) {
        int a= 0;
        while(a<nums.length){
            if(nums[a]==nums[nums[a]-1]){
                a++;
                continue;
            }
            else{
                swap(nums,a,nums[a]-1);
            }
        }
        int[] result = new int[2];
        for(int i =0;i<nums.length;i++){
            if(nums[i]!=i+1){
                result[0]=nums[i];
                result[1]=i+1;
                return result;
            }
        }
        return result;
    }
}