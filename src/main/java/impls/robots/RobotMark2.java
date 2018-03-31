package impls.robots;

import interfaces.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Created by andrew_korneev on 05.09.2017.
 */
public class RobotMark2 extends RobotMark1 implements WeaponWielder {

    @Autowired
    @Qualifier("sonyHand")
    private Hand hand;

    @Autowired
    @Qualifier("sonyLeg")
    private Leg leg;

    @Autowired
    @Qualifier("sonyHead")
    private Head head;

    @Autowired
    private Weapon weapon;

    public Hand getHand() {
        return hand;
    }

    public Leg getLeg() {
        return leg;
    }

    public Head getHead() {
        return head;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    @Override
    public void say() {
        super.say();
        System.out.println("HERE COMES JOHNY");
    }

    @Override
    public void action() {
        super.action();
    }

    @Override
    public void attack(Robot target) {
        System.out.println("////////// FIGHT //////////");
        System.out.println(this + " vs " + target);
        getWeapon().attack((RobotMark1) target);
        System.out.println("///////////////////////////");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
