class Solution {
    public void swap(int[] nums , int a , int b ){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int j=0;
        while(j<nums.length){
            if(nums[j]==nums[nums[j]-1]){
                j++;
                continue;
            }
            else{
                swap(nums,j,nums[j]-1);
            }
        }
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==i+1){
                continue;
            }
            else{
                list.add(i+1);
            }
        }
        return list;
    }
}