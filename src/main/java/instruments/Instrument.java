package instruments;

public abstract class Instrument {

    private String material;
    private String instrumentType ;
    private String maker;
    private double price;

    public Instrument(String material, String instrumentType, String maker, double price) {
        this.material = material;
        this.instrumentType = instrumentType;
        this.maker = maker;
        this.price = price;
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
    public double getPrice(){
        return price;
    }
}

