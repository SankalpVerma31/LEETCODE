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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp = head;
        int count=0;
        if(temp==null){
            return head;
        }
        while(temp.next!=null){
            temp=temp.next;
            count++;
        }
        count++;
        if(k>=count){
            k%=count;
        }
        if(k==0){
            return head;
        }
        else{
            temp.next=head;
            ListNode temp1 = head;
            for(int i =1;i<count-k;i++){
                temp1=temp1.next; 
            }
            head=temp1.next;
            temp1.next=null;
        }
        return head;
    }
}