package test;

import rpg_lab.*;

public class HeroTest {
    public static final int WEAPON_ATTACK = 10;
    public static final int WEAPON_DURABILITY = 10;
    public static final int TARGET_EXPERIENCE = 10;
    public void heroGainsExperienceFromDeadTarget(){
        Weapon weapon = new Axe(WEAPON_ATTACK,WEAPON_DURABILITY);
        Hero hero = new Hero("Manteko",weapon);
        Target target = new Target() {
            public int getHealth() {
                return 0;
            }

            public void takeAttack(int attackPoint) {

            }

            public int giveExprerience() {
                return TARGET_EXPERIENCE;
            }

            public boolean isDead() {
                return true;
            }
        };
        
    }
}
