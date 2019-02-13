import ThemePark.Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestVisitor {

    Visitor visitor;

    @Before
    public void before() {
        visitor = new Visitor("Mexican Bob", 42, 1.8034, 10.66);
    }

    @Test
    public void canGetName() {
        assertEquals("Mexican Bob", visitor.getName());
    }

    @Test
    public void canGetAge() {
        assertEquals(42, visitor.getAge());
    }

    @Test
    public void canGetHeight() {
        assertEquals(1.8034, visitor.getHeight(), 0);
    }

    @Test
    public void canGetMoney() {
        assertEquals(10.66, visitor.getMoney(), 0);
    }


}
