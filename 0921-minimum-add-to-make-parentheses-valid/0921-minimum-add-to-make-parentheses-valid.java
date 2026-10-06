class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        int count =0;
        for(int i =0;i<s.length();i++){
            if(s.charAt(i)=='('){
                stack.push(s.charAt(i));
                count++;
            }
            else if(s.charAt(i)==')'){
                if(!stack.isEmpty()&&stack.peek()=='('){
                    stack.pop();
                    count--;
                }
                else{
                    stack.push(s.charAt(i));
                    count++;
                }
            }
        }
        return count;
    }
}