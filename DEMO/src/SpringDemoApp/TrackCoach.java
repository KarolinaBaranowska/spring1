package SpringDemoApp;

public class TrackCoach implements Coach
{
    private FortuneService fortuneService;
    public TrackCoach()
    {

    }

    public TrackCoach(FortuneService fortuneService)
    {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout()
    {
        return "Run a hard 5k";
    }

    public String getMyPractice()
    {
        return "This is  my first spring";
    }
    public String getDailyFortune()
    {
        return "Just do it :" + fortuneService.getFortune();
    }

    //add an init methpod
    public void doMystartUpStuff()
    {
        System.out.println("in da starrtup");
    }
    //add a destroy methpod
    public void doMyCleantUpStuff()
    {
        System.out.println("in da cleanup");
    }


}
