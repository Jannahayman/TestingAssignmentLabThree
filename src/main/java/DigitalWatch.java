public class DigitalWatch {
    TimeComponent sec = new TimeComponent(false);
    TimeComponent min = new TimeComponent(false);
    TimeComponent hrs = new TimeComponent(true);

    public void ResetTime()
    {
        sec.SetValue(0);
        min.SetValue(0);
        hrs.SetValue(0);
    }
    public void SecondPassed()
    {
        if(sec.IfIncrement())
            if(min.IfIncrement())
                hrs.Increment();
    }
    }
