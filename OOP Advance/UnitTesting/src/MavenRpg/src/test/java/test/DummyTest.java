package test;

import org.junit.Assert;
import org.junit.Test;
import rpg_lab.Dummy;

public class DummyTest {
    @Test
    public void testDummyHealthWhenAttacked(){
        Dummy testDummy = new Dummy(10,10);
        testDummy.takeAttack(5);
        Assert.assertTrue(testDummy.getHealth() == 5);
    }
    @Test(expected = IllegalStateException.class)
    public void testDeadDummyWhenAttacked(){
        Dummy testdummy = new Dummy(0,5);
        testdummy.takeAttack(5);
    }
    @Test
    public void testTakeXPfromDeadDummy(){
        Dummy testDummy = new Dummy(10,10);
        testDummy.takeAttack(15);
        testDummy.giveExperience();
    }
    @Test(expected = IllegalStateException.class)
    public void testAliveDummyCantGiveXP(){
        Dummy testDummy = new Dummy(10,10);
        testDummy.giveExperience();
    }
}
