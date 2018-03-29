package start;


import impls.robots.RobotMark1;
import impls.robots.RobotMark2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RobotManager {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

		RobotMark1 robotMark1 = (RobotMark1) context.getBean("robotMark1");
		robotMark1.say();

		//-----------------------------------------------------------------

		RobotMark1 autowiredRobotMark1 = (RobotMark1) context.getBean("autowiredRobotMark1");
		autowiredRobotMark1.say();
		autowiredRobotMark1.action();

		//-----------------------------------------------------------------

		RobotMark2 autowiredRobotMark2  = (RobotMark2) context.getBean("autowiredRobotMark2");
		autowiredRobotMark2.say();
		autowiredRobotMark2.attack(autowiredRobotMark2);
	}

}
