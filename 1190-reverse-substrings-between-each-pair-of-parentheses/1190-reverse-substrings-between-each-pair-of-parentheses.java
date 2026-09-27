class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++) {

            if(s.charAt(i) == ')') {
                String reversed = "";

                while(stack.peek() != '(') {
                    reversed += stack.pop();
                }

                stack.pop();

                for(int j = 0; j < reversed.length(); j++) {
                    stack.push(reversed.charAt(j));
                }
            }
            else {
                stack.push(s.charAt(i));
            }
        }

        String answer = "";

        while(!stack.isEmpty()) {
            answer = stack.pop() + answer;
        }

        return answer;
    }
}