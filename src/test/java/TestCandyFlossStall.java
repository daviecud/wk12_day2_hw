import ThemePark.Stalls.CandyFlossStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCandyFlossStall {

    CandyFlossStall candyFlossStall;

    @Before
    public void before() {
        candyFlossStall = new CandyFlossStall("Sweet Candy", "CandyMan", 5);
    }

    @Test
    public void canGetOwnersName() {
        assertEquals("CandyMan", candyFlossStall.getOwnerName());
    }

    @Test
    public void canGetParkingSpot() {
        assertEquals(5, candyFlossStall.getParkingSpotNumbers());
    }

    @Test
    public void canGetStallName() {
        assertEquals("Sweet Candy", candyFlossStall.getName());
    }
}
