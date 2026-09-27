class Solution {
    public String makeGood(String s) {
        if(s.length()==1){
            return s;
        }
        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(s.length()-1));
        for(int i =s.length()-2;i>=0;i--){
            if(stack.isEmpty()){
                stack.push(s.charAt(i));
                continue;
            }
            if(stack.peek()+32==s.charAt(i)||stack.peek()-32==s.charAt(i)){
                stack.pop();
            }
            else{
                stack.push(s.charAt(i));
            }
        }
        String result = new String();
        while(!stack.isEmpty()){
            result+=stack.pop();
        }
        return result;
    }
}