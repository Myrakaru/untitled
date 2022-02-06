import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyFirstClass {
    @Test
    public void firstTestCase() {
        assertEquals(1,1);
    }
    @Test
    public void secondTestCase() {
        assertNotEquals(1, 2);
    }
    @Test
    public void thirdTestCase() {
        assertEquals("Hello", "Hello");
    }
    @Test
    public void fourthTestCase() {
        assertNotEquals("A","B");
    }
    @Test
    public void truthFalse() {
        assertTrue(true);
        assertTrue(5==5);
        assertTrue("abc"=="abc");

        assertFalse(false);
        assertFalse(5==4);
        assertFalse("abc"=="def");
    }
}
