package Code30;

import java.util.ArrayList;
import java.util.List;

public class Hashtable {
    // Define a constant for the size of the hashtable.
    // This is arbitrary and you could dynamically resize this for a more advanced implementation.
    private final static int TABLE_SIZE = 100;

    // Create an array of Entry objects to serve as the hashtable's storage.
    private Entry[] table;

    // Constructor initializes the hashtable with empty entries.
    public Hashtable() {
        table = new Entry[TABLE_SIZE];
    }

    // Hash function: it takes a key and returns an index in the hashtable where this key-value pair should be stored.
    public int hash(String key) {
        // Use Java's built-in hashCode() method, ensure it's a positive value, then take the modulus to ensure it's within the table size.
        return Math.abs(key.hashCode()) % TABLE_SIZE;
    }

    // Set function: adds a key-value pair to the hashtable.
    public void set(String key, String value) {
        // Get the index for this key using the hash function.
        int index = hash(key);

        // If there's already an entry at this index and it's not for the current key, then this is a collision.
        // In that case, find the next available index.
        while (table[index] != null && !table[index].key.equals(key)) {
            index = (index + 1) % TABLE_SIZE;
        }

        // Now we can store the entry (key-value pair) in the hashtable.
        table[index] = new Entry(key, value);
    }

    // Get function: retrieves the value for a given key from the hashtable.
    public String get(String key) {
        // Get the index for this key using the hash function.
        int index = hash(key);

        // If the entry at this index is not for the current key, then this is a collision.
        // In that case, find the correct index.
        while (table[index] != null && !table[index].key.equals(key)) {
            index = (index + 1) % TABLE_SIZE;
        }

        // If there's an entry at the index, return its value. Otherwise, return null.
        return table[index] != null ? table[index].value : null;
    }

    // Has function: checks if a given key is in the hashtable.
    public boolean has(String key) {
        // Get the index for this key using the hash function.
        int index = hash(key);

        // If the entry at this index is not for the current key, then this is a collision.
        // In that case, find the correct index.
        while (table[index] != null && !table[index].key.equals(key)) {
            index = (index + 1) % TABLE_SIZE;
        }

        // If there's an entry at the index, the key is in the hashtable, so return true. Otherwise, return false.
        return table[index] != null;
    }

    // Keys function: returns a list of all keys in the hashtable.
    public List<String> keys() {
        List<String> keys = new ArrayList<>();

        // Loop through all entries in the hashtable.
        for (Entry entry : table) {
            // If there's an entry at this index, add its key to the list.
            if (entry != null) {
                keys.add(entry.key);
            }
        }

        return keys;
    }
}
