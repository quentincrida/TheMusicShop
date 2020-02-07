package instruments;

public class Recorder extends Instrument{
    private String type;

    public Recorder(String type, String material, String instrumentType, String maker, double price) {
        super(material, instrumentType, maker, price);
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
