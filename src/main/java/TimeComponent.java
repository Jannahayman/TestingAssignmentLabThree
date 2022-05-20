public class TimeComponent {
    private static int currentValue = 0;
    private static int maxValue;
    public TimeComponent(boolean hour)
    {
        if (hour == true)
            maxValue = 24;
        else
            maxValue=60;
    }
    public static boolean IfIncrement()
    {
        if (currentValue==maxValue) {
            return true;
        }
        return false;
    }
    public static boolean Increment()
    {
        currentValue +=1;
        if (IfIncrement()) {
            currentValue = 0;
            return true;
        }
            return false;
    }
    public void SetValue(int n)
    {
        if(n < maxValue)
            currentValue =n;
    }

}
