package InstrumentStuff.Abstracts;

public abstract class StringFamily extends Instrument{
    private int numberOfStrings;

    public StringFamily(String name, String description, double retailPrice, double wholesalePrice, String color, String mainMaterial, int numberOfStrings) {
        super(name, description, retailPrice, wholesalePrice, color, mainMaterial);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return this.numberOfStrings;
    }
}
