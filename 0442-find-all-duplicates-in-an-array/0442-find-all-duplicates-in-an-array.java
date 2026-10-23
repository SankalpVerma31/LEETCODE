class Solution {
    public void swap(int[] nums,int a , int b ){
        int temp = nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        if(nums.length==1){
            return list;
        }
        int a =0;
        while(a<nums.length){
            if(nums[a]==nums[nums[a]-1]){
                a++;
            }
            else{
                swap(nums,a,nums[a]-1);
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
                list.add(nums[i]);
            }
        }
        return list;

    }
}