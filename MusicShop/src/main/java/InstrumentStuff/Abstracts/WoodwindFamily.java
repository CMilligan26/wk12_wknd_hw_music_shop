package InstrumentStuff.Abstracts;

public abstract class WoodwindFamily extends Instrument {

    private int numberOfFingerHoles;

    public WoodwindFamily(String name, String description, double retailPrice, double wholesalePrice, String color, String mainMaterial, int numberOfFingerHoles) {
        super(name, description, retailPrice, wholesalePrice, color, mainMaterial);
        this.numberOfFingerHoles = numberOfFingerHoles;
    }

    public int getNumberOfFingerHoles() {
        return this.numberOfFingerHoles;
    }
}
