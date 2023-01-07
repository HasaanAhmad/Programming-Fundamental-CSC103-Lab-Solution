import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CAQ1Test {
    CAQ1 obj = new CAQ1();

    @Test
    public void test() {
        assertEquals(true, obj.checkDate(12, 11, 2022));
        assertEquals(true, obj.checkDate(31, 12, 2022));
        assertEquals(false, obj.checkDate(29, 02, 2022));
        assertEquals(true, obj.checkDate(12, 11, 1999));
    }

    @Test
    public void test2() {
        assertEquals(false, obj.checkDate(29, 02, 2022));
        assertEquals(true, obj.checkDate(12, 11, 1999));
    }
}
