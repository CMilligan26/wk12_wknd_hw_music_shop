package InstrumentStuff.Abstracts;

public abstract class PercussionFamily extends Instrument{

    private int numberOfParts;

    public PercussionFamily(String name, String description, double retailPrice, double wholesalePrice, String color, String mainMaterial, int numberOfParts) {
        super(name, description, retailPrice, wholesalePrice, color, mainMaterial);
        this.numberOfParts = numberOfParts;
    }

    public int getNumberOfParts() {
        return this.numberOfParts;
    }
}
