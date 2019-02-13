import ThemePark.Attractions.Dodgems;
import ThemePark.Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDodgems {

    Dodgems dodgems;

    @Before
    public void before() {
        dodgems = new Dodgems("Debi\'s Dodgy Dodgems", 8);

    }

    @Test
    public void canGetName() {
        assertEquals("Debi\'s Dodgy Dodgems", dodgems.getName());
    }

    @Test
    public void canGetPriceIfUnder13() {
        assertEquals(2.25, dodgems.priceFor(), 0);
    }
}
