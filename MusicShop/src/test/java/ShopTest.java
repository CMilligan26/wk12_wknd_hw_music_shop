import InstrumentStuff.Cowbell;
import ShopStuff.Shop;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    private Shop shop;
    private Cowbell cowbell;

    @Before
    public void before(){
        shop = new Shop();
        cowbell = new Cowbell(
                "Rocket 5.5 inch Cowbell",
                "Ideal for use as part of a percussion ensemble or for attaching to drum kit.",
                5.99,
                2.99,
                "Black",
                "Steel",
                1);
    }

    @Test
    public void hasStock(){
        assertEquals(0, shop.getStock().size());
    }

    @Test
    public void canAddStock(){
        shop.addStock(cowbell);
    assertEquals(1, shop.getStock().size());
    }

    @Test
    public void canRemoveStock(){
        shop.addStock(cowbell);
        assertEquals(1, shop.getStock().size());
        shop.removeStock(cowbell);
        assertEquals(0, shop.getStock().size());
    }

    @Test
    public void canCalculateProfit(){
        shop.addStock(cowbell);
        assertEquals(1, shop.getStock().size());
        assertEquals(2.40, shop.calculateProfit(0.2), 0.001);
    }

}
