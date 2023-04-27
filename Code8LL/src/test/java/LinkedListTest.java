package LinkedList;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    @Test
    void testZipLists() {
        LinkedList list1 = new LinkedList();
        list1.add(1);
        list1.add(3);
        list1.add(2);

        LinkedList list2 = new LinkedList();
        list2.add(5);
        list2.add(9);
        list2.add(4);

        LinkedList zippedList = list1.zipLists(list2);

        int[] expectedValues = {1, 5, 3, 9, 2, 4};
        int index = 0;
        Node current = zippedList.head;

        while (current != null) {
            assertEquals(expectedValues[index], current.value);
            current = current.next;
            index++;
        }

        assertNull(current);
    }
}
