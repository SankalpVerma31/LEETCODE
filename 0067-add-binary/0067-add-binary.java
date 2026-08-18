class Solution {
    public String addBinary(String a, String b) {

        char[] result = new char[Math.max(a.length(), b.length()) + 1];

        int t = a.length() - 1;
        int m = b.length() - 1;
        int k = result.length - 1;

        int carry = 0;

        while (t >= 0 || m >= 0) {

            int sum = carry;

            if (t >= 0) {
                sum += a.charAt(t) - '0';
                t--;
            }

            if (m >= 0) {
                sum += b.charAt(m) - '0';
                m--;
            }

            result[k] = (char) ((sum % 2) + '0');

            carry = sum / 2;

            k--;
        }

        if (carry == 1) {
            result[k] = '1';
        }

        if (result[0] == '\0') {
            return new String(result, 1, result.length - 1);
        }

        return new String(result);
    }
}