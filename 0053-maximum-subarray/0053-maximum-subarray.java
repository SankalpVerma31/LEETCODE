class Solution {

    public int CrossSUM(int start, int end, int mid, int[] nums) {
        int sum = 0;
        int leftsum = Integer.MIN_VALUE;
        int rightsum = Integer.MIN_VALUE;
        for (int i = mid; i >= start; i--) {
            sum = sum + nums[i];
            if (sum > leftsum) {
                leftsum = sum;
            }
        }

        sum = 0;
        for (int i = mid + 1; i <= end; i++) {
            sum = sum + nums[i];
            if (sum > rightsum) {
                rightsum = sum;
            }
        }

        int totalsum = leftsum + rightsum;
        return totalsum;
    }

    public int maxsubarray(int start, int end, int[] nums) {

        if (start == end) {
            return nums[start];
        }

        int mid = (start + end) / 2;

        int leftSum = maxsubarray(start, mid, nums);
        int rightSum = maxsubarray(mid + 1, end, nums);
        int totalSum = CrossSUM(start, end, mid, nums);

        if (leftSum > rightSum) {
            if (leftSum > totalSum) {
                return leftSum;
            } else {
                return totalSum;
            }
        } else {
            if (rightSum > totalSum) {
                return rightSum;
            } else {
                return totalSum;
            }
        }
    }

    public int maxSubArray(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        return maxsubarray(start, end, nums);
    }
}