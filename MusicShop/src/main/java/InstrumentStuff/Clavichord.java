package InstrumentStuff;

import CustomerStuff.Customer;
import InstrumentStuff.Abstracts.KeyboardFamily;

public class Clavichord extends KeyboardFamily {
    public Clavichord(String name, String description, double retailPrice, double wholesalePrice, String color, String mainMaterial, int numberOfKeys) {
        super(name, description, retailPrice, wholesalePrice, color, mainMaterial, numberOfKeys);
    }

    @Override
    public String play(Customer customer) {
        return customer.getName() + " is playing the " + this.getName();
    }
}
