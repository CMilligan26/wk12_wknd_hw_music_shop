package InstrumentStuff;

import CustomerStuff.Customer;
import InstrumentStuff.Abstracts.BrassFamily;

public class Didgeridoo extends BrassFamily {

    public Didgeridoo(String name, String description, double retailPrice, double wholesalePrice, String color, String mainMaterial, int lengthOfTubing, int numberOfValves) {
        super(name, description, retailPrice, wholesalePrice, color, mainMaterial, lengthOfTubing, numberOfValves);
    }

    @Override
    public String play(Customer customer) {
        return customer.getName() + " is playing the " + this.getName();
    }
}
