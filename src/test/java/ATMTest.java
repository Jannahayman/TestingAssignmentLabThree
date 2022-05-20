import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ATMTest {
    @Test
    public void withdrawStubTest(){
        ATM teller = new ATM();
        assertEquals(1000,ATM.withdraw(1000, 2000));
    }

    @Test
    public void withdrawStubTestExceedsLimit(){
        ATM teller = new ATM();
        assertEquals(500,ATM.withdraw(1000, 500));
    }
}