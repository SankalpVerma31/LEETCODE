class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        int len=nums.length;
        int start=nums[0];
        int end=nums[len-1];
        ArrayList<Integer> list = new ArrayList<>(5);
        int k=0;
        for(int i=start;i<end+1;i++){
            if((i)==nums[k]){
                k++;
                continue;
            }
            else{
                list.add(i);
            }
        }
        return list;
    }
}