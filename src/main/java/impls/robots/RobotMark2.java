package impls.robots;

import interfaces.*;

/**
 * Created by andrew_korneev on 05.09.2017.
 */
public class RobotMark2 extends RobotMark1 {

    private Weapon weapon;

    public RobotMark2() {}

    public RobotMark2(Hand hand, Leg leg, Head head, int health, Weapon weapon) {
        super(hand, leg, head, health);
        this.weapon = weapon;
    }

    @Override
    public void say() {
        super.say();
        System.out.println("\nHERE COMES JOHNY\n");
    }

    @Override
    public void action() {
        super.action();
    }

    public void attack(RobotMark1 target) {
        System.out.println("////////// FIGHT //////////");
        System.out.println(this + " vs " + target);
        weapon.attack(target);
        System.out.println("///////////////////////////");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
