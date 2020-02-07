package instruments;

public class Harpsichord extends Instrument {
    private String numberOfManuals;
    private double lengthInMetres;

    public Harpsichord(String numberOfManuals, double lengthInMetres, String material, String instrumentType, String maker, double price ) {
        super(material, instrumentType, maker, price);
        this.numberOfManuals = numberOfManuals;
        this.lengthInMetres = lengthInMetres;
    }

    public String getNumberOfManuals() {
        return numberOfManuals;
    }

    public double getLengthInMetres() {
        return lengthInMetres;
    }
}
