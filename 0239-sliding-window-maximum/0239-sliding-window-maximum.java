class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        int[] array = new int[nums.length - k + 1];

        Deque<Integer> deque = new ArrayDeque<>();

        int start = 0;
        int end = 0;
        int i = 0;

        while (end < nums.length) {

            // Remove elements smaller than current element
            while (!deque.isEmpty() && nums[deque.peekLast()] <= nums[end]) {
                deque.removeLast();
            }

            deque.addLast(end);

            // Remove elements outside the window
            if (deque.peekFirst() < start) {
                deque.removeFirst();
            }

            // Window has reached size k
            if (end - start + 1 == k) {
                array[i] = nums[deque.peekFirst()];
                i++;
                start++;
            }

            end++;
        }

        return array;
    }
}