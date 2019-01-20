import CustomerStuff.Customer;
import InstrumentStuff.Didgeridoo;
import InstrumentStuff.Ocarina;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OcarinaTest {

    private Ocarina ocarina;
    private Customer customer;

    @Before
    public void before() {
        ocarina = new Ocarina(
                "Stagg Ocarina",
                "This plastic ocarina by Rocket is made in a durable plastic and is in a bright red colour. It is easy to use and sounds great!",
                7.99,
                4.99,
                "Red",
                "Plastic",
                12);
        customer = new Customer("Link");
    }

    @Test
    public void hasName() {
        assertEquals("Stagg Ocarina", ocarina.getName());
    }

    @Test
    public void hasDescription() {
        assertEquals("This plastic ocarina by Rocket is made in a durable plastic and is in a bright red colour. It is easy to use and sounds great!", ocarina.getDescription());
    }

    @Test
    public void hasRetailPrice() {
        assertEquals(7.99, ocarina.getRetailPrice(),0.001);
    }

    @Test
    public void hasWholesalePrice() {
        assertEquals(4.99, ocarina.getWholesalePrice(),0.001);
    }

    @Test
    public void hasColor() {
        assertEquals("Red", ocarina.getColor());
    }

    @Test
    public void hasMainMaterial() {
    assertEquals("Plastic", ocarina.getMainMaterial());
    }

    @Test
    public void hasNumberOfFingerHoles() {
    assertEquals(12, ocarina.getNumberOfFingerHoles());
    }


    @Test
    public void canCalculateMarkup() {
        assertEquals(3, ocarina.calculateMarkup(),0.001);
    }

    @Test
    public void canPlay() {
        assertEquals("Link is playing the Stagg Ocarina", ocarina.play(customer));
    }








}