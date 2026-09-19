class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp1 = list1;

        // Reach the node before index a
        for(int i = 0; i < a - 1; i++) {
            temp1 = temp1.next;
        }

        // Find the node after index b
        ListNode temp2 = temp1;
        for(int i = a - 1; i <= b; i++) {
            temp2 = temp2.next;
        }

        // Connect list1 before a to list2
        temp1.next = list2;

        // Reach the end of list2
        while(list2.next != null) {
            list2 = list2.next;
        }

        // Connect list2 to the remaining part of list1
        list2.next = temp2;

        return list1;
    }
}