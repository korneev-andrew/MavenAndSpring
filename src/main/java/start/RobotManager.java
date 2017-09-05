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

		RobotMark1 robotMark1WithArgs = (RobotMark1) context.getBean("robotMark1WithArgs");
		robotMark1WithArgs.action();

		//-----------------------------------------------------------------

		RobotMark2 robotMark2  = (RobotMark2) context.getBean("robotMark2");
		robotMark2.say();
		robotMark2.attack(robotMark1WithArgs);
	}

}
