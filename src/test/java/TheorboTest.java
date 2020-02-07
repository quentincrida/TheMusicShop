import instruments.Theorbo;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TheorboTest {

    private Theorbo theorbo1;

    @Before
    public void before(){
        theorbo1 = new Theorbo(12, "Mixed woods", "Plucked Strings", "Tiger Woods", 9000.00);
    }

    @Test
    public void getNumberOfFrets(){
        assertEquals(12, theorbo1.getNumberOfFrets());
    }
    @Test
    public void getMaterial(){
        assertEquals("Mixed woods", theorbo1.getMaterial());
    }
    @Test
    public void getInstrumentType(){
        assertEquals("Plucked Strings", theorbo1.getInstrumentType());
    }
    @Test
    public void getMaker(){
        assertEquals("Tiger Woods", theorbo1.getMaker());
    }
    @Test
    public void getPrice(){
        assertEquals(9000, theorbo1.getPrice(), 0.01);
    }
}
