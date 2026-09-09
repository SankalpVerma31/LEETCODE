class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode temp1 = head;
        ListNode temp2 = head.next;
        ListNode temp3 = temp2.next;

        temp1.next = temp3;
        temp2.next = temp1;
        head = temp2;

        while (temp1.next != null && temp1.next.next != null) {
            temp3 = temp1;
            temp1 = temp1.next;
            temp2 = temp1.next;

            temp3.next = temp2;
            temp1.next = temp2.next;
            temp2.next = temp1;
        }

        return head;
    }
}