import CustomerStuff.Customer;
import InstrumentStuff.Cowbell;
import InstrumentStuff.Didgeridoo;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DidgeridooTest {

    private Didgeridoo didgeridoo;
    private Customer customer;

    @Before
    public void before() {
        didgeridoo = new Didgeridoo(
                "Meinl Bamboo Wood Didgeridoo 47 inch, Brown",
                "These Didgeridoos are made of bamboo and offer a great way to get started with the oldest wind instrument in the world. Its distinctive drone with harmonic overtones goes great with all kinds of percussion.",
                21.99,
                13.99,
                "Brown",
                "Bamboo",
                100,
                0);
        customer = new Customer("Lisa");
    }

    @Test
    public void hasName() {
        assertEquals("Meinl Bamboo Wood Didgeridoo 47 inch, Brown", didgeridoo.getName());
    }

    @Test
    public void hasDescription() {
        assertEquals("These Didgeridoos are made of bamboo and offer a great way to get started with the oldest wind instrument in the world. Its distinctive drone with harmonic overtones goes great with all kinds of percussion.", didgeridoo.getDescription());
    }

    @Test
    public void hasRetailPrice() {
        assertEquals(21.99, didgeridoo.getRetailPrice(),0.001);
    }

    @Test
    public void hasWholesalePrice() {
        assertEquals(13.99, didgeridoo.getWholesalePrice(),0.001);
    }

    @Test
    public void hasColor() {
        assertEquals("Brown", didgeridoo.getColor());
    }

    @Test
    public void hasMainMaterial() {
    assertEquals("Bamboo", didgeridoo.getMainMaterial());
    }

    @Test
    public void hasLengthOfTubing() {
    assertEquals(100, didgeridoo.getLengthOfTubing());
    }

    @Test
    public void hasNumberOfValves() {
        assertEquals(0, didgeridoo.getNumberOfValves());
    }


    @Test
    public void canCalculateMarkup() {
        assertEquals(8, didgeridoo.calculateMarkup(),0.001);
    }

    @Test
    public void canPlay() {
        assertEquals("Lisa is playing the Meinl Bamboo Wood Didgeridoo 47 inch, Brown", didgeridoo.play(customer));
    }








}