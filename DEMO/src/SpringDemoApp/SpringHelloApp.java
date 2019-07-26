package SpringDemoApp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp
{
    public static void main(String[] args)
    {
        //load the spring configuration file
        ClassPathXmlApplicationContext context =  new ClassPathXmlApplicationContext("applicationContext.xml");
        //retrieve bean from container
        Coach theCoach = context.getBean("myCoach", Coach.class);
        Coach theCoach1 = context.getBean("myCoach1", Coach.class);
        //Coach theCoach2 = context.getBean("myCoach2", Coach.class);
        //call methods on the bean
        System.out.println(theCoach.getDailyWorkout());
        //System.out.println(theCoach1.getDailyWorkout());
        //System.out.println(theCoach2.getDailyFortune());
        //close th econtext
        context.close();

    }
}
