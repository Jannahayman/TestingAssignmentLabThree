public class CoffeeMachineController {
    static String [] CoffeeTypes = {"Latte","Regular","Spanish","Espresso"};
    static int [] prices = {10,10,15,20};
    public static int MakeCoffee(String coffee, int input)
    {
        for(int i = 0 ; i< CoffeeTypes.length;i++)
            if (coffee == CoffeeTypes[i])
                if(MoneyController.CheckAmount(prices[i], input))
                    return input-prices[i];
        return -1;
    }
}
