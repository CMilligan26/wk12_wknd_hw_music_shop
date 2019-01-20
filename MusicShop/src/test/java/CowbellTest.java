import CustomerStuff.Customer;
import InstrumentStuff.Cowbell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CowbellTest {

    private Cowbell cowbell;
    private Customer customer;

    @Before
    public void before() {
        cowbell = new Cowbell(
                "Rocket 5.5 inch Cowbell",
                "Ideal for use as part of a percussion ensemble or for attaching to drum kit.",
                5.99,
                2.99,
                "Black",
                "Steel",
                1);
        customer = new Customer("Will");
    }

    @Test
    public void hasName() {
        assertEquals("Rocket 5.5 inch Cowbell", cowbell.getName());
    }

    @Test
    public void hasDescription() {
        assertEquals("Ideal for use as part of a percussion ensemble or for attaching to drum kit.", cowbell.getDescription());
    }

    @Test
    public void hasRetailPrice() {
        assertEquals(5.99, cowbell.getRetailPrice(),0.001);
    }

    @Test
    public void hasWholesalePrice() {
        assertEquals(2.99, cowbell.getWholesalePrice(),0.001);
    }

    @Test
    public void hasColor() {
        assertEquals("Black", cowbell.getColor());
    }

    @Test
    public void hasMainMaterial() {
    assertEquals("Steel", cowbell.getMainMaterial());
    }

    @Test
    public void hasNumberOfParts() {
    assertEquals(1, cowbell.getNumberOfParts());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(3, cowbell.calculateMarkup(),0.001);
    }

    @Test
    public void canPlay() {
        assertEquals("Will is playing the Rocket 5.5 inch Cowbell", cowbell.play(customer));
    }








}