import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle(100);
    }

    @Test
    public void startsAtCapacity100(){
        assertEquals(100,waterBottle.getCapacity());
    }
    @Test
    public void canDrink10(){
        waterBottle.drink10();
        assertEquals(90, waterBottle.getCapacity());
    }

    @Test
    public void canDrinkMultiple(){
        waterBottle.drink10();
        waterBottle.drink10();
        waterBottle.drink10();
        assertEquals(70, waterBottle.getCapacity());

    }

    @Test
    public void canEmpty(){
        waterBottle.emptyBottle();
        assertEquals(0,waterBottle.getCapacity());
    }

    @Test
    public void canFill(){
        waterBottle.fillBottle();
        assertEquals(100,waterBottle.getCapacity());
    }

}
