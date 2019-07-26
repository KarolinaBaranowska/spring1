package SpringDemoApp;

public class CricketCoach implements Coach
{
    private FortuneService fortuneService;
    private String emailAdress;
    private String team;

    public void setEmailAdress(String emailAdress)
    {
        this.emailAdress = emailAdress;
        System.out.println("the setter email method");
    }

    public String getEmailAdress()
    {
        return emailAdress;
    }

    public void setTeam(String team)
    {
        this.team = team;
        System.out.println("the setter team method");
    }

    public String getTeam()
    {
        return team;
    }

    public void setFortuneService(FortuneService fortuneService)
    {
        this.fortuneService = fortuneService;
        System.out.println("the setter method");
    }

    public CricketCoach()
    {
        System.out.println("in no arg constuctor");
    }

    @Override
    public String getDailyWorkout()
    {
        return "Practice fast bowlong for 15 mins";
    }

    @Override
    public String getMyPractice()
    {
        return null;
    }

    @Override
    public String getDailyFortune()
    {
        return fortuneService.getFortune();
    }
}
