class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                stack.push(0);
            } else {
                int x = stack.pop();

                if(x == 0) {
                    x = 1;
                } else {
                    x = 2 * x;
                }

                int top = stack.pop();
                stack.push(top + x);
            }
        }

        return stack.pop();
    }
}