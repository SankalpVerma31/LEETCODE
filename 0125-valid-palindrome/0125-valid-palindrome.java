class Solution {
    public boolean isPalindrome(String s) {
        String lower = s.toLowerCase();
        char[] charArray = lower.toCharArray();

        int k = 0;
        int l = charArray.length - 1;

        while (k < l) {

            if (Character.isLetterOrDigit(charArray[k])) {
            } else {
                k++;
                continue;
            }

            if (Character.isLetterOrDigit(charArray[l])) {
            } else {
                l--;
                continue;
            }
            if (charArray[k] == charArray[l]) {
                k++;
                l--;
            } else {
                return false;
            }
        }
        return true;
    }
}