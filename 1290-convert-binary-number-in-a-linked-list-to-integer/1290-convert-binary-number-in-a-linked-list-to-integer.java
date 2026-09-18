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
    public int getDecimalValue(ListNode head) {
        if(head==null){
            return 0;
        }
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        temp=head;
        int answer=0;
        count--;
        while(temp!=null){
            if(temp.val==0){
                count--;
                temp=temp.next;
            }
            else{
                answer+=(temp.val*(Math.pow(2,count)));
                count--;
                temp=temp.next;
            }
        }
        return answer;
    }
}