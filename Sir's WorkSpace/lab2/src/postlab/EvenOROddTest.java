package postlab;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class EvenOROddTest {
    @Test
    public void testEvenOrOdd() {
        postlab1 eoo = new postlab1();
        assertEquals(postlab1.even_or_odd(6), "Even");
        assertEquals(postlab1.even_or_odd(7), "Odd");       
    }
}