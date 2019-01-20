package InstrumentStuff;

import CustomerStuff.Customer;
import InstrumentStuff.Abstracts.StringFamily;

public class Guqin extends StringFamily {

    public Guqin(String name, String description, double retailPrice, double wholesalePrice, String color, String mainMaterial, int numberOfStrings) {
        super(name, description, retailPrice, wholesalePrice, color, mainMaterial, numberOfStrings);
    }

    @Override
    public String play(Customer customer) {
        return customer.getName() + " is playing the " + this.getName();
    }
}
