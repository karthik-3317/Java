package postlab;

import static org.junit.Assert.*;

public class JUnitStringBuffer {
	public void test() {
        StringBuffer sbOne = new StringBuffer("hello");
        StringBuffer sbTwo = new StringBuffer("hello");
        postlab2 stBuffer = new postlab2();
        boolean hel = stBuffer.StringBuff(sbOne, sbTwo);
        assertEquals(true, hel);
    }
}
