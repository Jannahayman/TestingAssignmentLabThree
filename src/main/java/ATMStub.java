
public class ATMStub {
    static int balance = 20000;
    public static String checkbalance(int input){
        if (input > balance){
            return "Transaction rejected";
        }
        else
            return "Transaction accepted";
        }
}
