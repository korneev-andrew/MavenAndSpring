package impls.parts.weapons;

import impls.robots.RobotMark1;

/**
 * Created by andrew_korneev on 05.09.2017.
 */
public class OmniBlade extends WeaponBase {
    @Override
    public void attack(RobotMark1 target) {
        System.out.println("Omni-blade assault");
        super.attack(target);
    }
}
