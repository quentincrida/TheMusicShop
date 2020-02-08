import behaviours.ISell;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;

    public Shop() {
        stock = new ArrayList<ISell>();
    }

    public int countStock(){
        return this.stock.size();
    }
    public void stockInstrument(ISell instrument){
        this.stock.add(instrument);
    }
    public void stockAccessory(ISell accessory){
        this.stock.add(accessory);
    }
}
