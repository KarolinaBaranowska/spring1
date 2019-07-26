package SpringDemoApp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleMain
{
    public static void main(String[] args)
    {
        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("contekst.xml");
        Coach theCoach = context.getBean("myCoach",Coach.class);
        System.out.println(theCoach.getDailyWorkout());
        context.close();
    }
}
