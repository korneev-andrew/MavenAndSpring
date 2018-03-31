package impls.robots;


import interfaces.Robot;
import interfaces.WeaponWielder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Collection;
import java.util.Random;

@Controller
public class RobotManager {

	@Autowired
	private RobotPool robotPool;

    public void start() {
		Collection<Robot> robots = robotPool.get();

		for (Robot robot : robots) {
			robot.say();
			robot.action();

			if (robot instanceof WeaponWielder) {
				attackRandomTarget((WeaponWielder) robot, robots);
			}
		}
	}

	private void attackRandomTarget(WeaponWielder attacker, Collection<Robot> robots) {
		int randomIndex = new Random().nextInt(robots.size());

		attacker.attack((Robot) robots.toArray()[randomIndex]);
	}
}
