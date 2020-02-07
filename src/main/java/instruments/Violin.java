package instruments;

import behaviours.IPlay;

public class Violin extends Instrument implements IPlay {
    private int numberOfStrings;
    private String size;

    public Violin(int numberOfStrings, String size, String material, String instrumentType, String maker, double price) {
        super(material,instrumentType,maker,price);

        this.numberOfStrings = numberOfStrings;
        this.size = size;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String getSize() {
        return size;
    }

    public String sound(){
        return "It depends who's playing";
    }
}



