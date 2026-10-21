
import java.util.Stack;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }

        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        ListNode temp = l1;
        while (temp != null) {
            stack1.push(temp.val);
            temp = temp.next;
        }

        temp = l2;
        while (temp != null) {
            stack2.push(temp.val);
            temp = temp.next;
        }

        Stack<Integer> stack3 = new Stack<>();
        int newval = 0;

        while (!stack1.isEmpty() || !stack2.isEmpty()) {
            int sum = newval;

            if (!stack1.isEmpty()) {
                sum += stack1.pop();
            }

            if (!stack2.isEmpty()) {
                sum += stack2.pop();
            }

            stack3.push(sum % 10);
            newval = sum / 10;
        }

        if (newval > 0) {
            stack3.push(newval);
        }

        ListNode head = new ListNode(stack3.pop());
        ListNode temp1 = head;

        while (!stack3.isEmpty()) {
            ListNode temp2 = new ListNode(stack3.pop());
            temp1.next = temp2;
            temp1 = temp1.next;
        }

        return head;
    }
}
