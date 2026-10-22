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
    public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prevnew = head;
        ListNode newSortElem = head.next;

        while (newSortElem != null) {
            if (prevnew.val <= newSortElem.val) {
                prevnew = newSortElem;
                newSortElem = newSortElem.next;
                continue;
            }

            ListNode traverse = dummy;
            while (traverse.next != newSortElem &&
                   traverse.next.val <= newSortElem.val) {
                traverse = traverse.next;
            }

            prevnew.next = newSortElem.next;
            newSortElem.next = traverse.next;
            traverse.next = newSortElem;

            newSortElem = prevnew.next;
        }

        return dummy.next;
    }
}