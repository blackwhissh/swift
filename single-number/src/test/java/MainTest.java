import org.example.Main;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void testSingleNumberWithValidInput() {
        int[] nums = {1, 2, 2, 3, 1, 1, 4, 4};
        int result = Main.singleNumber(nums);
        assertEquals(3, result, "The single number in the array should be 3.");
    }

    @Test
    public void testSingleNumberWithEmptyArray() {
        int[] nums = {};
        assertThrows(IllegalArgumentException.class, () -> Main.singleNumber(nums),
                "An empty array should result in an IllegalArgumentException.");
    }

    @Test
    public void testSingleNumberWithNoSingleNumber() {
        int[] nums = {1, 2, 1, 2, 4, 4};
        assertThrows(IllegalArgumentException.class, () -> Main.singleNumber(nums),
                "An array with no single number should result in an IllegalArgumentException.");
    }

    @Test
    public void testValidateWithEmptyArray() {
        int[] nums = {};
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> Main.validate(nums),
                "An empty array should result in an ArrayIndexOutOfBoundsException.");
    }
}