class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        char array[] = s.toCharArray();

        for (int i = 0; i < s.length(); i++) {

            if ((array[i] == '(') || (array[i] == '[') || (array[i] == '{')) {
                stack.push(array[i]);
            }
            else {
                if (stack.isEmpty()) {
                    return false;
                }

                char temp = stack.pop();

                if (array[i] == ')') {
                    if (temp == '(') {
                        continue;
                    }
                    else {
                        return false;
                    }
                }
                else if (array[i] == '}') {
                    if (temp == '{') {
                        continue;
                    }
                    else {
                        return false;
                    }
                }
                else if (array[i] == ']') {
                    if (temp == '[') {
                        continue;
                    }
                    else {
                        return false;
                    }
                }
            }
        }

        return stack.isEmpty();
    }
}