package instruments;

public class Theorbo extends Instrument{
    private double price;
    private int numberOfFrets;

    public Theorbo(int numberOfFrets, String material, String instrumentType, String maker, double price) {
        super(material, instrumentType, maker, price);
        this.numberOfFrets = numberOfFrets;
    }

    public int getNumberOfFrets() {
        return numberOfFrets;
    }

}
