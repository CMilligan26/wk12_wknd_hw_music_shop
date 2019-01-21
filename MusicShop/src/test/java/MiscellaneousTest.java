import CustomerStuff.Customer;
import ShopStuff.Miscellaneous;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MiscellaneousTest {

    private Miscellaneous miscellaneous;
    private Customer customer;

    @Before
    public void before() {
        miscellaneous = new Miscellaneous(
                "Strings",
                "Slinky Strings",
                5,
                2,
                "Guitar");
        customer = new Customer("Jimi");
    }

    @Test
    public void hasName() {
        assertEquals("Strings", miscellaneous.getName());
    }

    @Test
    public void hasDescription() {
        assertEquals("Slinky Strings", miscellaneous.getDescription());
    }

    @Test
    public void hasRelatedInstrument(){
        assertEquals("Guitar", miscellaneous.getRelatedInstrument());
    }

    @Test
    public void hasRetailPrice() {
        assertEquals(5, miscellaneous.getRetailPrice(),0.001);
    }

    @Test
    public void hasWholesalePrice() {
        assertEquals(2, miscellaneous.getWholesalePrice(),0.001);
    }


    @Test
    public void canCalculateMarkup() {
        assertEquals(3, miscellaneous.calculateMarkup(),0.001);
    }

}