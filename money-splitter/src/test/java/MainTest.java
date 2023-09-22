import org.example.Main;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void testMinSplitForZero() {
        int amount = 0;
        int minCoins = Main.minSplit(amount);
        assertEquals(0, minCoins, "Minimum coins for 0 should be 0.");
    }

    @Test
    public void testMinSplitForSmallAmounts() {
        // Test for various small amounts
        int[] amounts = {1, 2, 3, 4, 5, 10};
        int[] expectedMinCoins = {1, 2, 3, 4, 1, 1}; // Minimum coins needed for each amount

        for (int i = 0; i < amounts.length; i++) {
            int amount = amounts[i];
            int expectedCoins = expectedMinCoins[i];
            int minCoins = Main.minSplit(amount);
            assertEquals(expectedCoins, minCoins, "Minimum coins for " + amount + " should be " + expectedCoins + ".");
        }
    }

    @Test
    public void testMinSplitForLargeAmount() {

        int amount = 157;
        int minCoins = Main.minSplit(amount);
        assertEquals(6, minCoins, "Minimum coins for 157 should be 6.");
    }

}