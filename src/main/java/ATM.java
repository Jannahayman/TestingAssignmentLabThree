
    public class ATM {
        public static int withdraw(int amount, int currentAm)
        {
            ATMStub temp = new ATMStub();
            if(temp.checkbalance(amount)=="Transaction accepted")
                if(amount <= currentAm)
                {
                    currentAm -= amount;
                    return currentAm;
                }
            return currentAm;

        }
        public static int deposit(int amount,int currentAm)
        {
            currentAm += amount;
            return currentAm ;
        }
    }
