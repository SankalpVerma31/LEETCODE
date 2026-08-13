class Solution {
    public void nextPermutation(int[] nums) {

        if (nums.length == 1) {
            return;
        }

        int endbutone = nums.length - 2;
        int end = nums.length - 1;
        while (endbutone >= 0 && nums[endbutone] >= nums[end]) {
            endbutone--;

            if (endbutone < 0) {
                Arrays.sort(nums);
                return;
            }

            end--;
        }
        int i = nums.length - 1;

        while (nums[i] <= nums[endbutone]) {
            i--;
        }
        int temp = nums[i];
        nums[i] = nums[endbutone];
        nums[endbutone] = temp;
        Arrays.sort(nums, endbutone + 1, nums.length);
    }
}