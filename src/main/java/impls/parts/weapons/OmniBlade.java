package impls.parts.weapons;

import impls.robots.RobotMark1;
import org.springframework.stereotype.Component;

/**
 * Created by andrew_korneev on 05.09.2017.
 */
@Component
public class OmniBlade extends WeaponBase {
    @Override
    public void attack(RobotMark1 target) {
        System.out.println("Omni-blade assault");
        super.attack(target);
    }

    @Override
    public int getDamage() {
        return 23;
    }
}
