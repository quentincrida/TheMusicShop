import instruments.Theorbo;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TheorboTest {

    private Theorbo theorbo1;

    @Before
    public void before(){
        theorbo1 = new Theorbo(12, "Mixed woods", "Plucked Strings", "Tiger Woods", 9000.00, 7000.00);
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
    public void getSellPrice(){
        assertEquals(9000, theorbo1.getSellPrice(), 0.01);
    }
    @Test
    public void getBuyPrice(){
        assertEquals(7000, theorbo1.getBuyPrice(), 0.01);
    }
    @Test
    public void getSound(){
        assertEquals("Plunk plunk twang!", theorbo1.sound());
    }
    @Test
    public void calculateMarkup(){
        assertEquals(2000, theorbo1.calculateMarkup(), 0.01);
    }
}
