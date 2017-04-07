package test;

import org.junit.Assert;
import org.junit.Test;
import rpg_lab.Axe;
import rpg_lab.Dummy;

public class AxeTest {
    @Test
    public void testAxeDurability(){
        //arange
        Axe testAxe = new Axe(10,10);
        Dummy testDummy = new Dummy(10,10);
        //act
        testAxe.attack(testDummy);
        //assert
        Assert.assertTrue(testAxe.getDurabilityPoints() == 9);
    }
    @Test(expected = IllegalStateException.class)
    public void testBrokenAxeAttack(){
        Axe testAxe = new Axe(10,0);
        Dummy testDummy = new Dummy(10,10);
        testAxe.attack(testDummy);
    }
}
