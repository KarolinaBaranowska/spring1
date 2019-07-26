package SpringDemoApp;

import java.lang.reflect.Array;

public class HappyFortuneService implements FortuneService
{
    String [] fortunes = {"fortune one", "fortune two","fortune three"};
    Integer rand = 6;


    public String getFortune()
    {
        return fortunes[rand%3];
    }
}
