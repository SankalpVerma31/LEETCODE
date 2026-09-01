/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode temp = head;
        int count = 0;

        while (temp.next != null) {
            temp = temp.next;
            count++;
        }

        ListNode newList = new ListNode(temp.val);
        ListNode temp2 = newList;

        temp = head;

        for (int i = count - 1; i >= 0; i--) {
            temp = head;

            for (int j = 0; j < i; j++) {
                temp = temp.next;
            }

            temp2.next = new ListNode(temp.val);
            temp2 = temp2.next;
        }

        return newList;
    }
}