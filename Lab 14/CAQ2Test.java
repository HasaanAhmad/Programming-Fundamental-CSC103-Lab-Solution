import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CAQ2Test {
    CAQ2 obj = new CAQ2();

    @Test
    public void test1() {
        // assertEquals(false, CAQ2.isPerfect(4));
        assertEquals(false, CAQ2.isPerfect(8));
        assertEquals(true, CAQ2.isPerfect(6));
        assertEquals(false, CAQ2.isPerfect(1234));
    }

    @Test
    public void test2() {
        // assertEquals(false, CAQ2.isPerfect(4));
        assertEquals(false, CAQ2.isPerfect(5));
        assertEquals(false, CAQ2.isPerfect(10));
        assertEquals(false, CAQ2.isPerfect(43));
        assertEquals(true, CAQ2.isPerfect(28));
    }
}
