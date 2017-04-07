package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rpg_lab.Axe;
import rpg_lab.Dummy;

public class AxeTest {

    private static final int AXE_ATTACK = 10;
    private static final int AXE_DURABILITY = 10;
    private static final int DUMMY_HEALTH = 10;
    private static final int DUMMY_EXPIRINCE = 10;
    private static final int EXPECTED_DURABILITY = 9;

    private Axe testAxe;
    private Dummy testDummy;

    @Before
    public void initializeTestObjects(){
        this.testAxe = new Axe(AXE_ATTACK,AXE_DURABILITY);
        this.testDummy = new Dummy(DUMMY_HEALTH,DUMMY_EXPIRINCE);
    }

    @Test
    public void testAxeDurability(){
        //arange
       testAxe.attack(testDummy);
        //assert
        Assert.assertEquals("Wrong durability",EXPECTED_DURABILITY,this.testAxe.getDurabilityPoints());
    }
    @Test(expected = IllegalStateException.class)
    public void testBrokenAxeAttack(){
       while (this.testAxe.getDurabilityPoints() > 0){
           this.testAxe.attack(testDummy);
       }
    }
}
