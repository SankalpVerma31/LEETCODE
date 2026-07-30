class Solution {

    public int CrossSUM(int start, int end, int mid, int[] nums) {
        int sum = 0;
        int leftsum = Integer.MIN_VALUE;
        int rightsum = Integer.MIN_VALUE;

        // Maximum sum on the left side
        for (int i = mid; i >= start; i--) {
            sum += nums[i];
            leftsum = Math.max(leftsum, sum);
        }

        sum = 0;

        // Maximum sum on the right side
        for (int i = mid + 1; i <= end; i++) {
            sum += nums[i];
            rightsum = Math.max(rightsum, sum);
        }

        return leftsum + rightsum;
    }

    public int maxsubarray(int start, int end, int[] nums) {
        if (start == end) {
            return nums[start];
        }

        int mid = start + (end - start) / 2;

        int leftSum = maxsubarray(start, mid, nums);
        int rightSum = maxsubarray(mid + 1, end, nums);
        int crossSum = CrossSUM(start, end, mid, nums);

        return Math.max(crossSum, Math.max(leftSum, rightSum));
    }

    public int maxSubArray(int[] nums) {
        return maxsubarray(0, nums.length - 1, nums);
    }
}