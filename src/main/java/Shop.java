import behaviours.IPlay;
import behaviours.ISell;
import instruments.Harpsichord;
import instruments.Instrument;
import instruments.Violin;


import java.util.ArrayList;

public class Shop  {

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

    public void removeInstrument(ISell instrument) {
        this.stock.remove(instrument);
    }

    public void removeAccessory(ISell accessory) {
        this.stock.remove(accessory);
    }
//
    public double getGrossProfit(){
        double grossProfit = 0;
        for(ISell iSell : this.stock){
            grossProfit += iSell.calculateMarkup();
        }
       return grossProfit;
   }
//    public double getGrossProfit(){
//        double grossProfit = 0;
//        for(ISell iSell : this.stock){
//            grossProfit += (i);
//        }
//    }
}
