package impls.robots;

import interfaces.Hand;
import interfaces.Head;
import interfaces.Leg;
import interfaces.Robot;
import org.springframework.util.StringUtils;

/**
 * Created by andrew_korneev on 16.06.2017.
 */
public class RobotMark1 implements Robot {

    private String name;
    private int health;

    private Hand hand;
    private Leg leg;
    private Head head;

    public RobotMark1() {
    }

    public RobotMark1(Hand hand, Leg leg, Head head, int health) {
        super();
        this.hand = hand;
        this.leg = leg;
        this.head = head;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public void action() {
        head.calc();
        hand.catchSomething();
        leg.go();
    }

    @Override
    public void say() {
        System.out.println("\nSUP DUDE\n");
    }

    @Override
    public String toString() {
        String robotName =  StringUtils.isEmpty(name) ? "noName" : name;

        return this.getClass().getSimpleName() + "[ " + robotName + " ]";
    }
}
