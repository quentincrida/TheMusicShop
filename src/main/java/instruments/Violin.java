package instruments;

public class Violin {
    private int numberOfStrings;
    private String size;

    public Violin(int numberOfStrings, String size) {
        this.numberOfStrings = numberOfStrings;
        this.size = size;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String getSize() {
        return size;
    }
}



