package InstrumentStuff.Abstracts;

public abstract class KeyboardFamily extends Instrument {
    private int numberOfKeys;


    public KeyboardFamily(String name, String description, double retailPrice, double wholesalePrice, String color, String mainMaterial, int numberOfKeys) {
        super(name, description, retailPrice, wholesalePrice, color, mainMaterial);
        this.numberOfKeys = numberOfKeys;
    }

    public int getNumberOfKeys() {
        return this.numberOfKeys;
    }
}
