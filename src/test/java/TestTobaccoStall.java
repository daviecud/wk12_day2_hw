import ThemePark.Stalls.TobaccoStall;
import ThemePark.Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestTobaccoStall {

    TobaccoStall tobaccoStall;

    @Before
    public void before() {
        tobaccoStall = new TobaccoStall("Terry\'s Tobacco", "Terry Butcher", 3);
    }

    @Test
    public void canGetName() {
        assertEquals("Terry\'s Tobacco", tobaccoStall.getName());
    }

    @Test
    public void canGetOwnerName() {
        assertEquals("Terry Butcher", tobaccoStall.getOwnerName());
    }

    @Test
    public void canGetParkingSpot() {
        assertEquals(3, tobaccoStall.getParkingSpotNumbers());
    }

    @Test
    public void canCheckIfOldEnoughToPurchase(Visitor visitor) {
        assertEquals(true, tobaccoStall.allowedToRide(visitor));
    }
}
