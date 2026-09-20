class MyLinkedList {

    class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    Node head;

    public MyLinkedList() {
        head = null;
    }

    public int get(int index) {
        Node temp = head;
        int count = 0;

        while (temp != null) {
            if (count == index) {
                return temp.val;
            }

            count++;
            temp = temp.next;
        }

        return -1;
    }

    public void addAtHead(int val) {
        Node newNode = new Node(val);

        newNode.next = head;
        head = newNode;
    }

    public void addAtTail(int val) {
        Node newNode = new Node(val);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    public void addAtIndex(int index, int val) {
        if (index == 0) {
            addAtHead(val);
            return;
        }

        Node temp = head;
        int count = 0;

        while (temp != null && count < index - 1) {
            temp = temp.next;
            count++;
        }

        if (temp == null) {
            return;
        }

        Node newNode = new Node(val);

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void deleteAtIndex(int index) {
        if (head == null) {
            return;
        }

        if (index == 0) {
            head = head.next;
            return;
        }

        Node temp = head;
        int count = 0;

        while (temp != null && count < index - 1) {
            temp = temp.next;
            count++;
        }

        if (temp == null || temp.next == null) {
            return;
        }

        temp.next = temp.next.next;
    }
}