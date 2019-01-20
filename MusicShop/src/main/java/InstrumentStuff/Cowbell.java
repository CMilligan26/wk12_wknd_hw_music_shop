package InstrumentStuff;

import CustomerStuff.Customer;
import InstrumentStuff.Abstracts.PercussionFamily;

public class Cowbell extends PercussionFamily {

    public Cowbell(String name, String description, double retailPrice, double wholesalePrice, String color, String mainMaterial, int numberOfParts) {
        super(name, description, retailPrice, wholesalePrice, color, mainMaterial, numberOfParts);
    }

    @Override
    public String play(Customer customer) {
        return customer.getName() + " is playing the " + this.getName();
    }
}
