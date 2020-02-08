import accessories.Sheetmusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class SheetmusicTest {

    private Sheetmusic sheetmusic1;

    @Before
    public void before(){
        sheetmusic1 = new Sheetmusic("Bach Solo Sonatas and Partitas", 7.00, 12);
    }

    @Test
    public void getDescription(){
        assertEquals("Bach Solo Sonatas and Partitas", sheetmusic1.getDescription());
    }

    @Test
    public void getBuyPrice(){
        assertEquals(7, sheetmusic1.getBuyPrice(), 0.01);
    }

    @Test
    public void getSellPrice(){
        assertEquals(12, sheetmusic1.getSellPrice(), 0.01);
    }
    @Test
    public void calculateMarkup(){
        assertEquals(5, sheetmusic1.calculateMarkup(), 0.01);
    }
}
