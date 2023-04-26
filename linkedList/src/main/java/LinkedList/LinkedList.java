package LinkedList;

public class LinkedList {

    public ListNode head;

    public LinkedList() {
        this.head = null;
    }

    // the `kthFromEnd` method
    public int kthFromEnd(int k) {
        if (head == null) {
            throw new IllegalStateException("List is empty");
        }

        ListNode temp = head;
        int length = 0;

        while (temp != null) {
            length++;
            temp = temp.next;
        }

        if (k >= length || k < 0) {
            throw new IllegalArgumentException("Invalid k value");
        }

        int targetPosition = length - k - 1;
        temp = head;
        for (int i = 0; i < targetPosition; i++) {
            temp = temp.next;
        }

        return temp.value;
    }

    public void append(int newValue) {
        ListNode newNode = new ListNode(newValue);
        if (head == null) {
            head = newNode;
        } else {
            ListNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }


    public void insertBefore(int value, int newValue) {
        ListNode newNode = new ListNode(newValue);

        if (head == null) {
            throw new IllegalStateException("List is empty");
        }

        if (head.value == value) {
            newNode.next = head;
            head = newNode;
            return;
        }

        ListNode temp = head;
        while (temp.next != null && temp.next.value != value) {
            temp = temp.next;
        }

        if (temp.next == null) {
            throw new IllegalStateException("Value not found in the list");
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void insertAfter(int value, int newValue) {
        ListNode newNode = new ListNode(newValue);

        if (head == null) {
            throw new IllegalStateException("List is empty");
        }

        ListNode temp = head;
        while (temp != null && temp.value != value) {
            temp = temp.next;
        }

        if (temp == null) {
            throw new IllegalStateException("Not in list");
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public ListNode getHead() {
        return head;
    }

}

