
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ATMStubTest {
    @Test
    public void StubTestAccepted(){
        assertEquals(1000,ATM.withdraw(1000,2000));}
    @Test
    public void StubTestRejected(){
        assertEquals(1000,ATM.withdraw(2000,1000));}

}