import accessories.ViolinStrings;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ViolinStringsTest {
    private ViolinStrings violinStrings1;

    @Before
    public void before(){
        violinStrings1 = new ViolinStrings("Pirastro Oliv", 55, 75);
    }

    @Test
    public void getDescription(){
        assertEquals("Pirastro Oliv", violinStrings1.getDescription());
    }
    @Test
    public void getBuyPrice(){
        assertEquals(55, violinStrings1.getBuyPrice(), 0.01);
    }
    @Test
    public void getSellPrice(){
        assertEquals(75, violinStrings1.getSellPrice(), 0.01);
    }
    @Test
    public void calculateMarkup(){
        assertEquals(20, violinStrings1.calculateMarkup(), 0.01);
    }



}
