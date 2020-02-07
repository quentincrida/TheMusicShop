import instruments.Harpsichord;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HarpsichordTest {
    private Harpsichord harpsichord1;

    @Before
    public void before(){
        harpsichord1 = new Harpsichord("Double",1.45);
    }
    @Test
    public void getNumberOfManuals(){
        assertEquals("Double", harpsichord1.getNumberOfManuals());
    }
    @Test
    public void getLengthInMetres(){
        assertEquals(1.45, harpsichord1.getLengthInMetres(), 0.01);
    }
}
