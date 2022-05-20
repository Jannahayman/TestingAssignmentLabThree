import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


class CoffeeMachineControllerTest {
    @Test
    public void CheckType1()
    {
        assertEquals(10,CoffeeMachineController.MakeCoffee("Regular",20));
    }
    @Test
    public void CheckType2()
    {
        assertEquals(0,CoffeeMachineController.MakeCoffee("Espresso",20));
    }
    @Test
    public void CheckType3()
    {
        assertEquals(-1,CoffeeMachineController.MakeCoffee("Latte",0));
    }
    @Test
    public void CheckType4()
    {
        assertEquals(-1,CoffeeMachineController.MakeCoffee("Arabic",20));
    }

}