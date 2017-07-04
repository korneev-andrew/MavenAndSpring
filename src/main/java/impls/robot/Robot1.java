package impls.robot;

import interfaces.Hand;
import interfaces.Head;
import interfaces.Leg;
import interfaces.Robot;

/**
 * Created by andrew_korneev on 16.06.2017.
 */
public class Robot1 implements Robot {

    private Hand hand;
    private Leg leg;
    private Head head;

    public Robot1() {
    }

    public Robot1(Hand hand, Leg leg, Head head) {
        super();
        this.hand = hand;
        this.leg = leg;
        this.head = head;
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
}
