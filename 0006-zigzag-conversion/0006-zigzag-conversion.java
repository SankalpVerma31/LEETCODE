class Solution {
    public String convert(String s, int numRows) {

        if (numRows == 1) {
            return s;
        }

        String zigzag = "";

        int cycle = 2 * (numRows - 1);

        for (int row = 0; row < numRows; row++) {

            int i = row;

            while (i < s.length()) {

                zigzag += s.charAt(i);

                // middle rows have one extra character
                if (row != 0 && row != numRows - 1) {
                    int second = i + cycle - 2 * row;

                    if (second < s.length()) {
                        zigzag += s.charAt(second);
                    }
                }

                i += cycle;
            }
        }

        return zigzag;
    }
}