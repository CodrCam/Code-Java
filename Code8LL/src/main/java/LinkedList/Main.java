package LinkedList;

class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    public void add(int value) {
        if (head == null) {
            head = new Node(value);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node(value);
        }
    }

    public LinkedList zipLists(LinkedList list2) {
        if (this.head == null) return list2;
        if (list2.head == null) return this;

        LinkedList zippedList = new LinkedList();
        zippedList.head = this.head;
        Node list1Current = this.head;
        Node list2Current = list2.head;

        while (list1Current != null && list2Current != null) {
            Node list1Next = list1Current.next;
            Node list2Next = list2Current.next;

            list1Current.next = list2Current;
            if (list1Next != null) {
                list2Current.next = list1Next;
            }

            list1Current = list1Next;
            list2Current = list2Next;
        }

        return zippedList;
    }
}
