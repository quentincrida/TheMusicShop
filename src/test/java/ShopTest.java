import accessories.ViolinStrings;
import instruments.Harpsichord;
import instruments.Instrument;
import org.junit.Before;
import org.junit.Test;
import sun.nio.cs.ext.ISCII91;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    Shop shop;
    Harpsichord harpsichord;
    ViolinStrings violinStrings;


    @Before
    public void before(){
        shop = new Shop();
        harpsichord = new Harpsichord("Double",1.45, "Limewood", "Keyboard", "Ruckers", 15000.00, 12000.00);
        violinStrings = new ViolinStrings("Pirastro Oliv", 55, 75);

    }

    @Test
    public void checkStock(){
        assertEquals(0,shop.countStock());
    }
}
