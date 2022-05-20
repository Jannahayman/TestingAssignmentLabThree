public class Bank {
    static String accnts [] ={"1", "2", "3","4"};
    static int balance [] ={150000,22334,1339,459000};

    public static int getCurrentAm(String account)
    {
        for(int i = 0 ; i<accnts.length;i++)
        {
            if(account.equals(accnts[i]))
                return balance[i];
        }
        return -1;
    }
    public static int setAm(int amount, String account){
        for(int i = 0 ; i<accnts.length;i++)
            if(account.equals(accnts[i]))
            {
                balance[i] = amount;
                return balance[i];
            }
        return -1;
    }
}
