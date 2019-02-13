import ThemePark.Attractions.Rollercoaster;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestRollercoaster {

    Rollercoaster rollercoaster;

    @Before
    public void before() {
        rollercoaster = new Rollercoaster("Ronnie\'s Rocket Rollercoaster", 9);
    }

    @Test
    public void canGetName() {
        assertEquals("Ronnie\'s Rocket Rollercoaster", rollercoaster.getName());
    }
}
