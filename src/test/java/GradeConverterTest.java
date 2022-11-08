import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GradeConverterTest {

    private GradeConverter gc;

    @Before
    public void setUp() throws Exception {
        gc = new GradeConverter();
    }

    @Test
    public void testConvert1() {
        String expectedVal = "A";
        String realVal = gc.convert(100);
        assertEquals(expectedVal, realVal);
    }

    @Test
    public void testConvert2() {
        String expectedVal = "A";
        String realVal = gc.convert(90);
        assertEquals(expectedVal, realVal);
    }
}