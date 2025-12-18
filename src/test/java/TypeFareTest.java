import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class TypeFareTest {
    
    private TypeFare fare;
    
    @Before
    public void setUp() {
        fare = new TypeFare("Test Fare", 15);
    }
    
    @Test
    public void testConstructor() {
        assertNotNull(fare);
        assertEquals("Test Fare", fare.getName());
        assertEquals(15, fare.getDiscount());
    }
    
    @Test
    public void testGetName() {
        TypeFare customFare = new TypeFare("Premium Fare", 20);
        assertEquals("Premium Fare", customFare.getName());
    }
    
    @Test
    public void testGetDiscount() {
        TypeFare customFare = new TypeFare("Economy Fare", 10);
        assertEquals(10, customFare.getDiscount());
    }
    
    @Test
    public void testZeroDiscount() {
        TypeFare zeroFare = new TypeFare("No Discount", 0);
        assertEquals(0, zeroFare.getDiscount());
    }
    
    @Test
    public void testHighDiscount() {
        TypeFare highFare = new TypeFare("High Discount", 50);
        assertEquals(50, highFare.getDiscount());
    }
}
