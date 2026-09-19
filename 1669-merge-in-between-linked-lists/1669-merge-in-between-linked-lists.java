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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp1 =list1;
        ListNode temp2=list1;
        int count =0;
        while(temp2!=null){
            if(count<a-1){
                temp1=temp1.next;
                temp2=temp2.next;
            }
            else if(count>=a-1&&count<b){
                temp2=temp2.next;
            }
            else if(count==b){
                temp2=temp2.next;
                break;
            }
            count++;
        }
        temp1.next=list2;
        while(list2.next!=null){
            list2=list2.next;
        }
        list2.next=temp2;
        return list1;
    }
}