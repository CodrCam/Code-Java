package Code30Test;

import Code30.Hashtable;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HashtableTest {
    Hashtable hashtable;

    @BeforeEach
    void setUp() {
        hashtable = new Hashtable();
    }

    @Test
    void testSetAndGet() {
        hashtable.set("Ferrari", "250k");
        assertEquals("250k", hashtable.get("Ferrari"));
    }

    @Test
    void testGetWithNonexistentKey() {
        assertNull(hashtable.get("Honda"));
    }

    @Test
    void testKeys() {
        hashtable.set("Ferrari", "250k");
        hashtable.set("Honda", "35k");
        hashtable.set("Benz", "120k");
        assertTrue(hashtable.keys().contains("Ferrari"));
        assertTrue(hashtable.keys().contains("Honda"));
        assertTrue(hashtable.keys().contains("Benz"));
    }


}
