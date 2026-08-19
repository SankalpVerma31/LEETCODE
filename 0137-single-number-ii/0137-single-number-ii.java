import java.util.Arrays;

class Solution {

    public int singleNumber(int[] nums) {

        Arrays.sort(nums);

        int start = 0;
        int end = 2;

        if (nums.length == 1) {
            return nums[0];
        }
        while (end < nums.length) {

            if (nums[start] == nums[end]) {
                start +=3;
                end += 3;
            }
            else {
                return nums[start];
            }
        }

        return nums[start];
    }
}