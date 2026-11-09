
class Solution {
    public int myAtoi(String s) {
        char[] sign = {'+'};
        int number = 0;
        int continuation = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == ' ') {
                if (continuation == 0) {
                    continue;
                }
                else {
                    break;
                }
            }

            else if (s.charAt(i) == '-' || s.charAt(i) == '+') {
                if (continuation == 0) {
                    continuation = 1;
                }
                else {
                    break;
                }
                sign[0] = s.charAt(i);
            }

            else if (Character.isDigit(s.charAt(i))) {
                if (continuation == 0 || continuation == 1 || continuation == 2) {

                    continuation = 2;

                    int digit = s.charAt(i) - '0';

                    // Check overflow before multiplication
                    if (number > Integer.MAX_VALUE / 10 ||
                       (number == Integer.MAX_VALUE / 10 &&
                        digit > Integer.MAX_VALUE % 10)) {

                        if (sign[0] == '-') {
                            return Integer.MIN_VALUE;
                        }
                        return Integer.MAX_VALUE;
                    }

                    number = (number * 10) + digit;
                }
                else {
                    break;
                }
            }

            else {
                break;
            }
        }

        if (sign[0] == '-') {
            return number * (-1);
        }

        return number;
    }
}
