import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RiverTest {

    River river;
    Salmon salmon;

    @Before
    public void before() {
        river = new River();
        salmon = new Salmon();
    }

    @Test
    public void riverStartsEmpty() {
        assertEquals(0, river.getFishCount());
    }

    @Test
    public void canAddSalmon() {
         river.addFish(salmon);
         assertEquals(1, river.getFishCount());
    }

    @Test
    public void canGetSalmon() {
        river.addFish(salmon);
        assertEquals(1, river.getFishCount());
        river.removeFish();
        assertEquals(0, river.getFishCount());
    }
}
