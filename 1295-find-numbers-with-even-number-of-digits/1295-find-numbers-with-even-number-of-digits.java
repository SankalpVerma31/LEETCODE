class Solution {
    public int findNumbers(int[] nums) {
        int k=0;
        int len1=nums.length;
        for(int i =0;i<len1;i++){
            int l=0;
            int j=1;
            while(j!=0){
                j=nums[i]/10;
                nums[i]=nums[i]/10;
                l++;
            }
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