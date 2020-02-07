import instruments.Violin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ViolinTest {
    private Violin violin1;

    @Before
    public void before() {
        violin1 = new Violin(4, "Full size", "Mixed woods", "Stringed", "Carlo Bergonzi", 1200000.00);
    }
        @Test
        public void getNumberOfStrings() {
            assertEquals(4, violin1.getNumberOfStrings());
    }
    @Test
    public void getSize(){
        assertEquals("Full size", violin1.getSize());
    }
    @Test
    public void getMaterial(){
        assertEquals("Mixed woods", violin1.getMaterial());
    }
    @Test
    public void getinstrumentType(){
        assertEquals("Stringed", violin1.getInstrumentType());
    }
    @Test
    public void getMaker(){
        assertEquals("Carlo Bergonzi", violin1.getMaker());
    }
    @Test
    public void getPrice(){
        assertEquals(1200000.00, violin1.getPrice(), 0.01);
    }
}
