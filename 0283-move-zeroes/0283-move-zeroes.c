//Sankalp
void moveZeroes(int* nums, int numsSize) {
    int p2=0;
    for(int p1 =0;p1<numsSize;p1++){
        if(nums[p1]!=0){
            int temp=nums[p1];
            nums[p1]=nums[p2];
            nums[p2]=temp;
            p2++;
        }
    }
}