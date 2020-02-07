package instruments;

import behaviours.IPlay;

public class Theorbo extends Instrument implements IPlay {
    private int numberOfFrets;

    public Theorbo(int numberOfFrets, String material, String instrumentType, String maker, double price) {
        super(material, instrumentType, maker, price);
        this.numberOfFrets = numberOfFrets;
    }

    public int getNumberOfFrets() {
        return numberOfFrets;
    }

    public String sound(){
        return "Plunk plunk twang!";
    }

}
