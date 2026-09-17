class Solution {
    public boolean isPalindrome(ListNode head) {

        if(head == null || head.next == null){
            return true;
        }

        ListNode fast = head;
        ListNode slow = head;

        // Find middle
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        // Reverse second half
        ListNode curr = slow;
        ListNode prev = null;

        while(curr != null){
            ListNode nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }

        // Compare first half with reversed second half
        ListNode first = head;
        ListNode second = prev;

        while(second != null){
            if(first.val != second.val){
                return false;
            }

            first = first.next;
            second = second.next;
        }

        return true;
    }
}