import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BankTest {
    @Test
    public void stubbedSetAmount(){
        Bank b = new Bank();
        assertEquals(22334, b.setAm(22334, "2"));
    }

    @Test
    public void stubbedGetAmount(){
        Bank b = new Bank();
        assertEquals(1339, b.getCurrentAm("3"));
    }
}