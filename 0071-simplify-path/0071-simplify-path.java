class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();

        int k = 1;

        while (k < path.length()) {

            char[] line = new char[path.length()];
            int j = 0;

            while (k < path.length() && path.charAt(k) != '/') {
                line[j] = path.charAt(k);
                j++;
                k++;
            }

            String alpha = new String(line, 0, j);

            if (alpha.equals("") || alpha.equals(".")) {
            }
            else if (alpha.equals("..")) {
                if (!stack.empty()) {
                    stack.pop();
                }
            }
            else {
                stack.push(alpha);
            }
            while (k < path.length() && path.charAt(k) == '/') {
                k++;
            }
        }

        String result = "";

        while (!stack.empty()) {
            result = "/" + stack.pop() + result;
        }

        if (result.equals("")) {
            return "/";
        }

        return result;
    }
}