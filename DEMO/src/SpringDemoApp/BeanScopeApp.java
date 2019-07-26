package SpringDemoApp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeApp
{
    public static void main(String[] args)
    {
        //load spring config file
        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("appContext.xml");
        //retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach",Coach.class);
        Coach alphaCoach = context.getBean("myCoach",Coach.class);

        //check if beans are the same
        boolean result =(theCoach==alphaCoach);
        System.out.println("\n Result: "+ result);
        System.out.println("\n Memory location for theCoach : "+theCoach );
        System.out.println("\n Memory location for alphaCoach : "+alphaCoach );
    context.close();

    }
}
