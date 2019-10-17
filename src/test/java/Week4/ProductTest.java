package Week4;

import Week4.Robbery.Product;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductTest {
    private Product a = new Product("product", 10, 50);
    private Product b = new Product("product", 10, 50);
    private Product c = new Product("product", 10, 20);

    @Test
    public void testEqual(){
        assertEquals(0, a.compareTo(b));
    }

    @Test
    public void testAIsBigger(){
        assertEquals(-1, a.compareTo(c));
    }

    @Test
    public void testBIsBigger(){
        assertEquals(1, c.compareTo(a));
    }
}
