import org.example.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test
    public void testAddBinary(){
        // Test case 1
        String a1 = "1010";
        String b1 = "1011";
        String result1 = Main.addBinary(a1, b1);
        assertEquals("10101", result1);

        // Test case 2
        String a2 = "110";
        String b2 = "10";
        String result2 = Main.addBinary(a2, b2);
        assertEquals("1000", result2);
    }
}
