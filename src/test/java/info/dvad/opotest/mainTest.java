package info.dvad.opotest;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by loki.od.ua on 29.01.2016.
 */
public class mainTest {
    @Test
    public void verifyGetFirstUChar(){
        assertEquals("empty", main.getFirstUChar(""));
        assertEquals("none", main.getFirstUChar("1122334455556666777788888899999000000"));
        assertEquals("none", main.getFirstUChar("111111111111111111111111111111111"));
        assertEquals("1", main.getFirstUChar("1234567890"));
        assertEquals("1", main.getFirstUChar("000000000000000000000001234567890"));
        assertEquals("1", main.getFirstUChar("1%%@@##!!(())&&**^^%%$$##@@!!||``\"\"\'\'"));
        assertEquals("H", main.getFirstUChar("\u0048\u0065\u006C\u006C\u006F World"));
        assertEquals("_", main.getFirstUChar("\u0048\u0048\u0065\u0065\u006C\u006C\u006F_World"));
    }
}
