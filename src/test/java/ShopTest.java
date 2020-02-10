import accessories.Sheetmusic;
import accessories.ViolinStrings;
import behaviours.ISell;
import instruments.Harpsichord;
import instruments.Instrument;
import instruments.Violin;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class ShopTest {
    Shop shop;
    Harpsichord harpsichord;
    ViolinStrings violinStrings;
    Sheetmusic sheetmusic;
    Violin violin;


    @Before
    public void before() {
        shop = new Shop();
        harpsichord = new Harpsichord("Double", 1.45, "Limewood", "Keyboard", "Ruckers", 15000.00, 12000.00);
        violinStrings = new ViolinStrings("Pirastro Oliv", 55, 75);
        sheetmusic = new Sheetmusic("Bach Solo Sonatas and Partitas", 7.00, 12);
        violin = new Violin(4, "Full size", "Mixed woods", "Stringed", "Carlo Bergonzi", 1200000.00, 750000);

    }

    @Test
    public void checkStockIsZero() {
        assertEquals(0, shop.countStock());
    }

    @Test
    public void canAddInstrumentToStock() {
        shop.stockInstrument(harpsichord);
        assertEquals(1, shop.countStock());
    }

    @Test
    public void canAddAccessoryToStock() {
        shop.stockAccessory(violinStrings);
        assertEquals(1, shop.countStock());

    }

    @Test
    public void canRemoveInstrumentFromStock() {
        shop.stockAccessory(violinStrings);
        shop.stockInstrument(harpsichord);
        shop.removeInstrument(harpsichord);
        assertEquals(1, shop.countStock());
    }

    @Test
    public void canRemoveAccessoryFromStock() {
        shop.stockAccessory(violinStrings);
        shop.stockInstrument(harpsichord);
        shop.removeAccessory(violinStrings);
        assertEquals(1, shop.countStock());
    }

    @Test
    public void canRemoveViolinFromStock() {
        shop.stockAccessory(violinStrings);
        shop.stockInstrument(harpsichord);
        shop.stockInstrument(violin);
        shop.removeInstrument(violin);
        assertEquals(2, shop.countStock());
    }

    @Test
    public void canRemoveSheetmusicFromStock() {
        shop.stockAccessory(sheetmusic);
        shop.stockInstrument(violin);
        shop.removeAccessory(sheetmusic);
        assertEquals(1, shop.countStock());
    }

   @Test
    public void getGrossProfit() {
        shop.stockAccessory(violinStrings);
        shop.stockInstrument(harpsichord);
        shop.stockInstrument(violin);
        shop.stockAccessory(violinStrings);
        assertEquals(453040.0, shop.getGrossProfit(), 0.01);
    }
//    @Test
//    public void calculateMarkup(){
//        shop.stockInstrument(harpsichord.harpsichord1.calculateMarkup(), 0.01);
//        shop.stockAccessory(sheetmusic.calculateMarkup());
//        assertEquals(3005, ());
//    }


}
