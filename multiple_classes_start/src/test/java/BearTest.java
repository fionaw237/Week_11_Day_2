import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BearTest {

    Bear bear;
    Salmon salmon;
    River river;

    @Before
    public void before(){
        bear = new Bear("Baloo");
        salmon = new Salmon();
        river = new River();
        river.addFish(salmon);
    }

    @Test
    public void bellyStartsEmpty(){
        assertEquals(0, bear.foodCount());
    }

    @Test
    public void canEatSalmon(){
        bear.eat(salmon);
        assertEquals(1, bear.foodCount());
    }

    @Test
    public void shouldEmptyBellyAfterSleep(){
        bear.eatFishFromRiver(river);
        assertEquals(1, bear.foodCount());
        bear.sleep();
        assertEquals(0, bear.foodCount());
    }

    @Test
    public void canTakeFishFromRiver() {
        bear.eatFishFromRiver(river);
        assertEquals(0, river.getFishCount());
    }


}
