package start;

import impls.robots.RobotManager;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by andrew_korneev on 31.03.2018.
 */
public class RobotApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        RobotManager robotManager = context.getBean(RobotManager.class);
        robotManager.start();
    }
}
