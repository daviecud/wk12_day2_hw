import ThemePark.Attractions.Playground;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPlayground {

    Playground playground;

    @Before
    public void before() {
        playground = new Playground("Polly\'s Playground", 6);
    }

    @Test
    public void canGetName() {
        assertEquals("Polly\'s Playground", playground.getName());
    }
}
