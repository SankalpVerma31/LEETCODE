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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode curr = head;
        ListNode next1= head.next;
        while(next1!=null){
            if(curr.val==next1.val){
                if(next1.next==null){
                    curr.next=null;
                    return head;
                }
                else{
                    next1=next1.next;
                }
            }
            else{
                if(next1.next==null){
                    curr.next=next1;
                    return head;
                }
                else{
                    curr.next=next1;
                    curr=curr.next;
                    next1=next1.next;
                }
            }
        }
        return head;
    }
}