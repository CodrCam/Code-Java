import LinkedList.LinkedList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class LinkedListTest {

    @Test
    void testKthFromEndGreaterThanOrEqualToListLength() {
        LinkedList linkedList = new LinkedList();
        linkedList.append(1);
        linkedList.append(3);
        linkedList.append(8);
        linkedList.append(2);

        Assertions.assertThrows(IllegalArgumentException.class, () -> linkedList.kthFromEnd(4));
        Assertions.assertThrows(IllegalArgumentException.class, () -> linkedList.kthFromEnd(6));
    }

    @Test
    void testKthFromEndSameAsListLength() {
        LinkedList linkedList = new LinkedList();
        linkedList.append(1);
        linkedList.append(3);
        linkedList.append(8);
        linkedList.append(2);

        Assertions.assertThrows(IllegalArgumentException.class, () -> linkedList.kthFromEnd(4));
    }

    @Test
    void testKthFromEndNotPositive() {
        LinkedList linkedList = new LinkedList();
        linkedList.append(1);
        linkedList.append(3);
        linkedList.append(8);
        linkedList.append(2);

        Assertions.assertThrows(IllegalArgumentException.class, () -> linkedList.kthFromEnd(-1));
    }

    @Test
    void testKthFromEndListSizeOne() {
        LinkedList linkedList = new LinkedList();
        linkedList.append(1);

        Assertions.assertEquals(1, linkedList.kthFromEnd(0));
    }

    @Test
    void testKthFromEndHappyPath() {
        LinkedList linkedList = new LinkedList();
        linkedList.append(1);
        linkedList.append(3);
        linkedList.append(8);
        linkedList.append(2);

        Assertions.assertEquals(3, linkedList.kthFromEnd(2));
    }
}
