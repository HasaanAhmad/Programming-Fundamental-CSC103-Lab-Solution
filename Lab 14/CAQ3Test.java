import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CAQ3Test {
    @Test
    public void test1() {
        CAQ3 obj = new CAQ3();
        assertEquals("Tuesday", CAQ3.dayOfTheWeek(2));
        assertEquals("Friday", CAQ3.dayOfTheWeek(5));
    }

    @Test
    public void test2() {
        CAQ3 obj = new CAQ3();
        assertEquals("Sunday", CAQ3.dayOfTheWeek(7));
        assertEquals("Wednesday", CAQ3.dayOfTheWeek(3));
    }
}
