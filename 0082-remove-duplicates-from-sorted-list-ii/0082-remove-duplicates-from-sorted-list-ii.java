class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode temp = dummy;
        ListNode temp2 = head;

        while(temp2 != null){
            boolean duplicate = false;

            while(temp2.next != null && temp2.val == temp2.next.val){
                duplicate = true;
                temp2 = temp2.next;
            }

            if(duplicate){
                temp.next = temp2.next;
            }
            else{
                temp = temp.next;
            }

            temp2 = temp2.next;
        }

        return dummy.next;
    }
}