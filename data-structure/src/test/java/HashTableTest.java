import org.example.HashTable;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HashTableTest {
    private HashTable hashTable;

    @BeforeEach
    public void setUp() {
        // Create a new instance of HashTable before each test
        hashTable = HashTable.getInstance();
    }

    @Test
    public void testInsertAndSearch() {
        hashTable.insert(1, "Value1");
        hashTable.insert(2, "Value2");

        assertEquals("Value1", hashTable.search(1));
        assertEquals("Value2", hashTable.search(2));
    }

    @Test
    public void testRemove() {
        hashTable.insert(1, "Value1");
        hashTable.insert(2, "Value2");

        hashTable.remove(1);
        assertNull(hashTable.search(1));
        assertEquals("Value2", hashTable.search(2));
    }

    @Test
    public void testSize() {
        assertEquals(0, hashTable.size());

        hashTable.insert(1, "Value1");
        hashTable.insert(2, "Value2");

        assertEquals(2, hashTable.size());

        hashTable.remove(1);
        assertEquals(1, hashTable.size());
    }

    @Test
    public void testKeys() {
        hashTable.insert(1, "Value1");
        hashTable.insert(2, "Value2");

        int[] keys = hashTable.keys();
        for (int key : keys){
            System.out.println(key);
        }
        assertEquals(2, hashTable.size());
        assertSame("Value1", hashTable.search(1));
        assertSame("Value2", hashTable.search(2));
    }
}
