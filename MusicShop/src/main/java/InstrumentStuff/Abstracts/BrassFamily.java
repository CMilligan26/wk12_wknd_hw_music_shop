package InstrumentStuff.Abstracts;

public abstract class BrassFamily extends Instrument {
    private int lengthOfTubing;
    private int numberOfValves;


    public BrassFamily(String name, String description, double retailPrice, double wholesalePrice, String color, String mainMaterial, int lengthOfTubing, int numberOfValves) {
        super(name, description, retailPrice, wholesalePrice, color, mainMaterial);
        this.lengthOfTubing = lengthOfTubing;
        this.numberOfValves = numberOfValves;
    }

    public int getLengthOfTubing() {
        return this.lengthOfTubing;
    }

    public int getNumberOfValves() {
        return this.numberOfValves;
    }
}
