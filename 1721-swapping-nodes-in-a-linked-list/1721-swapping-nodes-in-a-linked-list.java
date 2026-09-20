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
    public ListNode swapNodes(ListNode head, int k) {
        if(head == null){
            return head;
        }

        ListNode temp = head;
        int count = 0;

        while(temp != null){
            temp = temp.next;
            count++;
        }

        temp = head;
        for(int i = 1; i < k; i++){
            temp = temp.next;
        }

        ListNode temp2 = head;
        for(int i = 1; i < count-k+1; i++){
            temp2 = temp2.next;
        }

        int interval = temp.val;
        temp.val = temp2.val;
        temp2.val = interval;

        return head;
    }
}