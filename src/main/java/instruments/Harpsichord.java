package instruments;

public class Harpsichord {
    private String numberOfManuals;
    private double lengthInMetres;

    public Harpsichord(String numberOfManuals, double lengthInMetres) {
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
