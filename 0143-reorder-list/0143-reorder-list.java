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
    public void reorderList(ListNode head) {
        if(head==null||head.next==null){
            return;
        }
        ListNode start=head;
        while(true){   
            ListNode end = start;
            if(start.next==null||start.next.next==null){
                return;
            }
            while(end.next.next!=null){
                end=end.next;
            }
            ListNode temp = end.next;
            end.next=null;
            temp.next=start.next;
            start.next=temp;
            start=start.next.next;
        }
    }
}