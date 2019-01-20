package InstrumentStuff;

import CustomerStuff.Customer;
import InstrumentStuff.Abstracts.WoodwindFamily;

public class Ocarina extends WoodwindFamily {
    public Ocarina(String name, String description, double retailPrice, double wholesalePrice, String color, String mainMaterial, int numberOfFingerHoles) {
        super(name, description, retailPrice, wholesalePrice, color, mainMaterial, numberOfFingerHoles);
    }

    @Override
    public String play(Customer customer) {
        return customer.getName() + " is playing the " + this.getName();
    }
}
