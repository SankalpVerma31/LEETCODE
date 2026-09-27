class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        if(tokens.length==0){
            return 0;
        }
            for(int i =0;i<tokens.length;i++){
            if(tokens[i].equals("+")){
                int a = Integer.parseInt(stack.pop());
                int b= Integer.parseInt(stack.pop());
                int c = a+b;
                stack.push(Integer.toString(c));
            }
            else if(tokens[i].equals("-")){
                int a = Integer.parseInt(stack.pop());
                int b= Integer.parseInt(stack.pop());
                int c = b-a;
                stack.push(Integer.toString(c));
            }
            else if(tokens[i].equals("*")){
                int a = Integer.parseInt(stack.pop());
                int b= Integer.parseInt(stack.pop());
                int c = a*b;
                stack.push(Integer.toString(c));
            }
            else if(tokens[i].equals("/")){
                int a = Integer.parseInt(stack.pop());
                int b= Integer.parseInt(stack.pop());
                int c = b/a;
                stack.push(Integer.toString(c));
            }
            else{
                stack.push(tokens[i]);
            }
        }
        int result = Integer.parseInt(stack.pop());
        return result;
    }
}