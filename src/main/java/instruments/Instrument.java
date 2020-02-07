package instruments;

public abstract class Instrument {

    private String material;
    private String instrumentType ;
    private String maker;
    private double sellPrice;
    private double buyPrice;

    public Instrument(String material, String instrumentType, String maker, double sellPrice, double buyPrice) {
        this.material = material;
        this.instrumentType = instrumentType;
        this.maker = maker;
        this.sellPrice = sellPrice;
        this.buyPrice = buyPrice;
    }

    public String getMaterial() {
        return material;
    }

    public String getInstrumentType() {
        return instrumentType;
    }

    public String getMaker() {
        return maker;
    }
    public double getSellPrice(){
        return sellPrice;
    }
    public double getBuyPrice(){
        return buyPrice;
    }
}

