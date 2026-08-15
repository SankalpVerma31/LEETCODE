class Solution {
    public int binary(int start, int end, int x, int closest) {
        if (start > end) {
            return closest;
        }

        int mid = start + (end - start) / 2;

        if ((long) mid * mid == x) {
            return mid;
        }
        else if ((long) mid * mid > x) {
            return binary(start, mid - 1, x, closest);
        }
        else {
            if ((long) x - (long) mid * mid < (long) x - (long) closest * closest) {
                closest = mid;
            }

            return binary(mid + 1, end, x, closest);
        }
    }

    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }

        return binary(1, x, x, 0);
    }
}