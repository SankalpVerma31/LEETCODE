class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result =new int[nums1.length];
        int k=0;
        for(int i =0;i<nums1.length;i++){
            int temp=0;
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    temp=j;
                }
                else{
                    continue;
                }
            }
            for(int j=temp;j<nums2.length;j++){
                if(nums2[j]>nums1[i]){
                    result[k]=nums2[j];
                    k++;
                    break ;
                }
                else if((j==nums2.length-1)&&(nums2[j]<=nums1[i])){
                    result[k]=-1;
                    k++;
                }
                else{
                    continue;
                }
            }
        }
        return result;
    }
}