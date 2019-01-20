import CustomerStuff.Customer;
import InstrumentStuff.Guqin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuqinTest {

    private Guqin guqin;
    private Customer customer;

    @Before
    public void before() {
        guqin = new Guqin(
                "Paulownia Wood Guqin, Chinese 7-string Zither, for Beginner",
                "Great for beginners!",
                180,
                130,
                "Brown",
                "Wood",
                7);
        customer = new Customer("Xu Kuanghua");
    }

    @Test
    public void hasName() {
        assertEquals("Paulownia Wood Guqin, Chinese 7-string Zither, for Beginner", guqin.getName());
    }

    @Test
    public void hasDescription() {
        assertEquals("Great for beginners!", guqin.getDescription());
    }

    @Test
    public void hasRetailPrice() {
        assertEquals(180, guqin.getRetailPrice(),0.001);
    }

    @Test
    public void hasWholesalePrice() {
        assertEquals(130, guqin.getWholesalePrice(),0.001);
    }

    @Test
    public void hasColor() {
        assertEquals("Brown", guqin.getColor());
    }

    @Test
    public void hasMainMaterial() {
    assertEquals("Wood", guqin.getMainMaterial());
    }

    @Test
    public void hasNumberOfStrings() {
    assertEquals(7, guqin.getNumberOfStrings());
    }


    @Test
    public void canCalculateMarkup() {
        assertEquals(50, guqin.calculateMarkup(),0.001);
    }

    @Test
    public void canPlay() {
        assertEquals("Xu Kuanghua is playing the Paulownia Wood Guqin, Chinese 7-string Zither, for Beginner", guqin.play(customer));
    }








}