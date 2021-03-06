import instruments.Recorder;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RecorderTest {
    private Recorder recorder1;

    @Before
        public void before(){
        recorder1 = new Recorder("Treble", "Rosewood", "Woodwind", "Dolmetsch", 1000, 750);
    }

    @Test
    public void getType(){
        assertEquals("Treble", recorder1.getType());
    }
    @Test
    public void getMaterial(){
        assertEquals("Rosewood", recorder1.getMaterial());
    }
    @Test
    public void getInstrumentType(){
        assertEquals("Woodwind", recorder1.getInstrumentType());
    }
    @Test
    public void getMaker(){
        assertEquals("Dolmetsch", recorder1.getMaker());
    }
    @Test
    public void getSellPrice(){
        assertEquals(1000, recorder1.getSellPrice(), 0.01);
    }
    @Test
    public void getBuyPrice(){
        assertEquals(750, recorder1.getBuyPrice(), 0.01);
    }
    @Test
    public void getSound(){
        assertEquals("Toot toot toot!", recorder1.sound());
    }
    @Test
    public void calculateMarkup(){
        assertEquals(250, recorder1.calculateMarkup(),0.01);
    }
}
