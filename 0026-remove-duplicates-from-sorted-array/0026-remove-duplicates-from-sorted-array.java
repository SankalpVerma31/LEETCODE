class Solution {
    public int removeDuplicates(int[] nums) {
        int len=nums.length;
        int start=0;
        int end=0;
        if(len>0){
            int endelement=nums[len-1];
            while(end < len){
                if(start<len && end<len){
                    if(start==end){
                        end++;
                    }
                    else if(nums[start]==nums[end]){
                        end++;
                    }
                    else if(nums[start]!=nums[end]){
                        nums[start+1]=nums[end];
                        start++;
                    }
                }
                else{
                    break;
                }
            }
            return start + 1;
        }
        else{
            return 0;
        }
    }
}