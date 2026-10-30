class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int maj = 1;
        int i = 0;

        while(i < nums.length - 1) {
            if(nums[i] == nums[i+1]) {
                maj++;
            }
            else {
                maj = 1;
            }

            if(maj > nums.length / 2) {
                return nums[i];
            }

            i++;
        }

        return nums[i];
    }
}