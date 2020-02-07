package instruments;

import behaviours.IPlay;

public class Harpsichord extends Instrument {
    private String numberOfManuals;
    private double lengthInMetres;

    public Harpsichord(String numberOfManuals, double lengthInMetres, String material, String instrumentType, String maker, double sellPrice, double buyPrice ) {
        super(material, instrumentType, maker, sellPrice, buyPrice);
        this.numberOfManuals = numberOfManuals;
        this.lengthInMetres = lengthInMetres;
    }

    public String getNumberOfManuals() {
        return numberOfManuals;
    }

    public double getLengthInMetres() {
        return lengthInMetres;
    }

    public String sound(){
        return "Tinkle tinkle little star!";
    }


}
