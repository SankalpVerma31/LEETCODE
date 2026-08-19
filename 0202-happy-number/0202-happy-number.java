import java.util.HashSet;

class Solution {

    public boolean isHappy(int n) {

        long result = 0;
        long var = n;

        HashSet<Long> set = new HashSet<>();

        while (var != 1) {

            if (set.contains(var)) {
                return false;
            }

            set.add(var);

            result = 0;

            while (var > 0) {
                result += (var % 10) * (var % 10);
                var /= 10;
            }

            var = result;
        }

        return true;
    }
}