import instruments.Harpsichord;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HarpsichordTest {
    private Harpsichord harpsichord1;

    @Before
    public void before(){
        harpsichord1 = new Harpsichord("Double",1.45, "Limewood", "Keyboard", "Ruckers", 15000.00, 12000.00);
    }
    @Test
    public void getNumberOfManuals(){
        assertEquals("Double", harpsichord1.getNumberOfManuals());
    }
    @Test
    public void getLengthInMetres(){
        assertEquals(1.45, harpsichord1.getLengthInMetres(), 0.01);
    }
    @Test
    public void getMaterial(){
        assertEquals("Limewood", harpsichord1.getMaterial());
    }
    @Test
    public void getInstrumentType(){
        assertEquals("Keyboard", harpsichord1.getInstrumentType());
    }
    @Test
    public void getMaker(){
        assertEquals("Ruckers", harpsichord1.getMaker());
    }
    @Test
    public void getSellPrice(){
        assertEquals(15000, harpsichord1.getSellPrice(), 0.01);
    }
    @Test
    public void getBuyPrice(){
        assertEquals(12000, harpsichord1.getBuyPrice(), 0.01);
    }

    @Test
    public void getSound(){
        assertEquals("Tinkle tinkle little star!", harpsichord1.sound());
    }
    @Test
    public void calculateMarkup(){
        assertEquals(3000, harpsichord1.calculateMarkup(),0.01);
    }
}
