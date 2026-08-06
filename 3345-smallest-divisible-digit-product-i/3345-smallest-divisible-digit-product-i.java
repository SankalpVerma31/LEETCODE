class Solution {
    public int smallestNumber(int n, int t) {
        while (true) {
            long product = 1;
            int temp = n;
            
            // Extract and multiply all digits of the current number
            while (temp > 0) {
                product *= (temp % 10);
                temp /= 10;
            }
            
            // Check if the final product is divisible by t
            if (product % t == 0) {
                return n;
            }
            
            // Move to the next number if condition isn't met
            n++;
        }
    }
}
