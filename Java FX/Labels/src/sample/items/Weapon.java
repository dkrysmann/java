package items;

import items.Item;

public abstract class Weapon extends Item {
    private double damage;
    private double speed;

    public Weapon(String name, double damage, double speed) throws Exception {
        super(name);
        this.setDamage(damage);
        this.setSpeed(speed);
    }

    private void setDamage(double damage) throws Exception {
        if (damage <= 0)
            throw new Exception("Invalid Weapon Damage Value");
        else
            this.damage = damage;
    }

    private void setSpeed(double speed) throws Exception {
        if (speed <= 0)
            throw new Exception("Invalid Weapon Speed Value");
        else
            this.speed = speed;
    }
}
