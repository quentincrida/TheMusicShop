package instruments;

import behaviours.IPlay;

public class Recorder extends Instrument {
    private String type;

    public Recorder(String type, String material, String instrumentType, String maker, double sellPrice, double buyPrice) {
        super(material, instrumentType, maker, sellPrice, buyPrice);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String sound() {
        return "Toot toot toot!";
    }

}