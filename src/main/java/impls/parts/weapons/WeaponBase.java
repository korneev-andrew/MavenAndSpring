package impls.parts.weapons;

import impls.robots.RobotMark1;
import interfaces.Weapon;

/**
 * Created by andrew_korneev on 06.09.2017.
 */
public class WeaponBase implements Weapon {
    private int damage;

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public void attack(RobotMark1 target) {
        target.setHealth(target.getHealth() - getDamage());
        System.out.println(String.format("Dealt damage is %d", getDamage()));
    }
}
