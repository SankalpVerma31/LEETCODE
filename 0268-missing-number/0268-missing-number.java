class Solution {
    public void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public int missingNumber(int[] nums) {
        int i = 0;

        while (i < nums.length) {
            if (nums[i] >= nums.length) {
                i++;
            }
            else if (nums[i] == nums[nums[i]]) {
                i++;
            }
            else {
                swap(nums, i, nums[i]);
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if (j != nums[j]) {
                return j;
            }
        }

        return nums.length;
    }
}