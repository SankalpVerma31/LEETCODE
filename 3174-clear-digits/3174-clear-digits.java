class Solution {
    public String clearDigits(String s) {
        StringBuilder stack = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                stack.deleteCharAt(stack.length() - 1);
            } else {
                stack.append(ch);
            }
        }
        return stack.toString();
    }
}