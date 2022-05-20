import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MoneyControllerTest {
    @Test
    // Driver code for MoneyController
    public void CheckValidAmount()
    {
        assertTrue(MoneyController.CheckAmount(20,25));
    }

    @Test
    public void CheckInvalidAmount()
    {
        assertFalse(MoneyController.CheckAmount(20,15));
    }

}