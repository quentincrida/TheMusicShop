package instruments;

import behaviours.IPlay;

public class Recorder extends Instrument implements IPlay {
    private String type;

    public Recorder(String type, String material, String instrumentType, String maker, double price) {
        super(material, instrumentType, maker, price);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String sound() {
        return "Toot toot toot!";
    }

}