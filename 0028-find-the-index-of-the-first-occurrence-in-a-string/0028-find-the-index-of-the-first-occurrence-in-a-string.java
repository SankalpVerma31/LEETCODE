class Solution {
    public int strStr(String haystack, String needle) {
        char[] charArray = haystack.toCharArray();
        char[] charArray2 = needle.toCharArray();

        int len = needle.length();
        int i = 0;

        while (i <= haystack.length() - len) {

            if (charArray[i] != charArray2[0]) {
                i++;
            } else {
                int t = 0;

                while (t < len) {
                    if (charArray[i + t] == charArray2[t]) {
                        t++;
                        if (t == len) {
                            return i;
                        }
                    } else {
                        break;
                    }
                }

                i++;
            }
        }

        return -1;
    }
}