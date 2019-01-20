import CustomerStuff.Customer;
import InstrumentStuff.Clavichord;
import InstrumentStuff.Ocarina;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClavichordTest {

    private Clavichord clavichord;
    private Customer customer;

    @Before
    public void before() {
        clavichord = new Clavichord(
                "Roland C-30 digital harpsichord",
                "The Roland C-30 Digital Harpsichord is a 61-Note Digital Harpsichord, with a Click Action F-Scale Keyboard, and 4 Instrument Types with 6 Tones.",
                3000,
                2200,
                "Brown",
                "Wood",
                61);
        customer = new Customer("Bjork");
    }

    @Test
    public void hasName() {
        assertEquals("Roland C-30 digital harpsichord", clavichord.getName());
    }

    @Test
    public void hasDescription() {
        assertEquals("The Roland C-30 Digital Harpsichord is a 61-Note Digital Harpsichord, with a Click Action F-Scale Keyboard, and 4 Instrument Types with 6 Tones.", clavichord.getDescription());
    }

    @Test
    public void hasRetailPrice() {
        assertEquals(3000, clavichord.getRetailPrice(),0.001);
    }

    @Test
    public void hasWholesalePrice() {
        assertEquals(2200, clavichord.getWholesalePrice(),0.001);
    }

    @Test
    public void hasColor() {
        assertEquals("Brown", clavichord.getColor());
    }

    @Test
    public void hasMainMaterial() {
    assertEquals("Wood", clavichord.getMainMaterial());
    }

    @Test
    public void hasNumberOfKeys() {
    assertEquals(61, clavichord.getNumberOfKeys());
    }


    @Test
    public void canCalculateMarkup() {
        assertEquals(800, clavichord.calculateMarkup(),0.001);
    }

    @Test
    public void canPlay() {
        assertEquals("Bjork is playing the Roland C-30 digital harpsichord", clavichord.play(customer));
    }








}