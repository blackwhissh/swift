import org.example.Main;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void testCountVariantsWithZeroStairs() {
        int stairsCount = 0;
        int variants = Main.countVariants(stairsCount);
        assertEquals(1, variants, "There is one way to climb zero stairs (no climbing).");
    }

    @Test
    public void testCountVariantsWithOneStair() {
        int stairsCount = 1;
        int variants = Main.countVariants(stairsCount);
        assertEquals(1, variants, "There is one way to climb one stair (one step).");
    }

    @Test
    public void testCountVariantsWithTwoStairs() {
        int stairsCount = 2;
        int variants = Main.countVariants(stairsCount);
        assertEquals(2, variants, "There are two ways to climb two stairs (one step at a time or two steps at once).");
    }

    @Test
    public void testCountVariantsWithThreeStairs() {
        int stairsCount = 3;
        int variants = Main.countVariants(stairsCount);
        assertEquals(3, variants, "There are three ways to climb three stairs (111, 12, 21).");
    }

    @Test
    public void testCountVariantsWithLargeAmountOfStairs(){
        int stairsCount = 30;
        int variants = Main.countVariants(stairsCount);
        assertEquals(1346269, variants, "There are " + 1346269 + " to climb " + stairsCount);
    }

    @Test
    public void testCountVariantsWithNegativeStairs() {
        int stairsCount = -5;
        assertThrows(IllegalArgumentException.class, () -> Main.countVariants(stairsCount),
                "Negative input should result in an IllegalArgumentException.");
    }
}