class Solution {

    public int firstStableIndex(int[] nums, int k) {

        int end = nums.length;

        if (end == 0) {
            return -1;
        }

        int[] copy = Arrays.copyOf(nums, nums.length);
        Arrays.sort(copy);

        int max = nums[0];

        for (int i = 0; i < end; i++) {

            max = Math.max(max, nums[i]);

            int min = nums[i];

            for (int j = i; j < end; j++) {
                min = Math.min(min, nums[j]);
            }

            if (max - min <= k) {
                return i;
            }
        }

        return -1;
    }
}