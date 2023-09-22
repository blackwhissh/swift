import org.example.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void testNotContainsWithPositiveNumbers() {
        int[] array = {3, 5, 1, 1, 2, 7, 4};
        int result = Main.notContains(array);
        assertEquals(6, result, "The smallest positive integer not in the array should be 6.");

        int[] array2 = {1, 2, 3, 4, 5};
        result = Main.notContains(array2);
        assertEquals(6, result, "The smallest positive integer not in the array should be 6.");
    }


    @Test
    public void testNotContainsWithNegativeNumbers() {
        int[] array = {-3, -5, -1, -1, -2, -7, -4};
        int result = Main.notContains(array);
        assertEquals(1, result, "The smallest positive integer not in the array should be 1.");
    }

    @Test
    public void testNotContainsWithEmptyArray() {
        int[] array = {};
        int result = Main.notContains(array);
        assertEquals(1, result, "The smallest positive integer not in an empty array should be 1.");
    }

    @Test
    public void testNotContainsWithOnlyNegativeNumbers() {
        int[] array = {-3, -5, -1, -1, -2, -7, -4};
        int result = Main.notContains(array);
        assertEquals(1, result, "The smallest positive integer not in an array of negative numbers should be 1.");
    }
}