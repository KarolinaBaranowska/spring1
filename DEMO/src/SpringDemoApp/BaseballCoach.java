package SpringDemoApp;

public class BaseballCoach implements Coach
{
    //define a private field for dependency
    private FortuneService fortuneService;

    //define a constructor for dependency ijection
    public BaseballCoach(FortuneService theFortuneService)
    {
        fortuneService = theFortuneService;
    }

    public String getDailyWorkout()
    {
        return "Spend 30 mintes on the batting practice";
    }
    public String getMyPractice()
    {
        return "This is  my first spring";
    }

    public String getDailyFortune()
    {
        //use my fortuneService to get a fortune
        return fortuneService.getFortune();
    }
}
