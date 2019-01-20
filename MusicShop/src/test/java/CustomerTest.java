import CustomerStuff.Customer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {
    private Customer customer;

    @Before
    public void before(){
        customer = new Customer("Gene");
    }

    @Test
    public void hasName(){
        assertEquals("Gene", customer.getName());
    }
}
