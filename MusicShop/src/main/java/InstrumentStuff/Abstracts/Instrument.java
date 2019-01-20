package InstrumentStuff.Abstracts;

import InstrumentStuff.Behaviors.IPlay;
import ShopStuff.StockItem;

public abstract class Instrument extends StockItem implements IPlay {
    private String color;
    private String mainMaterial;


    public Instrument(String name, String description, double retailPrice, double wholesalePrice, String color, String mainMaterial) {
        super(name, description, retailPrice, wholesalePrice);
        this.color = color;
        this.mainMaterial = mainMaterial;
    }

    public String getColor() {
        return this.color;
    }

    public String getMainMaterial() {
        return this.mainMaterial;
    }
}
