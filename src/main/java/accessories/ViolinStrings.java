package accessories;

import behaviours.ISell;

public class ViolinStrings extends Accessory implements ISell {
    private String description;
    private double buyPrice;
    private double sellPrice;

    public ViolinStrings(String description, double buyPrice, double sellPrice) {
        super(description, buyPrice, sellPrice);
        this.description = description;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    @Override
    public double calculateMarkup(){
        return sellPrice - buyPrice;
    }

    public String getDescription() {
        return description;
    }

    public double getBuyPrice() {
        return buyPrice;
    }
    public double getSellPrice(){
        return sellPrice;
    }
}
