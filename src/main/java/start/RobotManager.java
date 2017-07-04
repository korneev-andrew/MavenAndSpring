package start;


import impls.robot.Robot1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RobotManager {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

		Robot1 robot1 = (Robot1) context.getBean("robot1");
		robot1.say();

		//-----------------------------------------------------------------

		Robot1 robotWithArgs = (Robot1) context.getBean("robotWithArgs");
		robotWithArgs.action();
	}

}
