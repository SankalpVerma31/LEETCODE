class Solution {
    public int[] nextLargerNodes(ListNode head) {
        if(head == null){
            return new int[0];
        }

        ListNode temp = head;
        int count = 0;

        while(temp != null){
            count++;
            temp = temp.next;
        }

        int[] array = new int[count];

        ListNode first = head;
        int i = 0;

        while(first != null){
            ListNode second = first.next;

            while(second != null){
                if(second.val > first.val){
                    array[i] = second.val;
                    break;
                }

                second = second.next;
            }

            first = first.next;
            i++;
        }

        return array;
    }
}