package InstrumentStuff.Abstracts;

import CustomerStuff.Customer;
import ShopStuff.StockItem;

public abstract class Instrument extends StockItem {
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

    public String play(Customer customer) {
        return customer.getName() + " is playing the " + this.getName();
    }
}
