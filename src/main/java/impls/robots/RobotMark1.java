package impls.robots;

import interfaces.Hand;
import interfaces.Head;
import interfaces.Leg;
import interfaces.Robot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.util.StringUtils;

/**
 * Created by andrew_korneev on 16.06.2017.
 */
public class RobotMark1 implements Robot {

    private String name;

    private int health;

    public RobotMark1() {
        health = 100;
    }

    @Autowired
    @Qualifier("toshibaHand")
    private Hand hand;

    @Autowired
    @Qualifier("toshibaLeg")
    private Leg leg;

    @Autowired
    @Qualifier("toshibaHead")
    private Head head;

    public Hand getHand() {
        return hand;
    }


    public Leg getLeg() {
        return leg;
    }


    public Head getHead() {
        return head;
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
        getHead().calc();
        getHand().catchSomething();
        getLeg().go();
    }

    @Override
    public void say() {
        System.out.println(this + "\nSUP DUDE\n");
    }

    @Override
    public String toString() {
        String robotName =  StringUtils.isEmpty(name) ? "noName" : name;

        return this.getClass().getSimpleName() + "[ " + robotName + " ]";
    }
}
