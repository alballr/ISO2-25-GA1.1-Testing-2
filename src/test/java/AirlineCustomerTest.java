import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class AirlineCustomerTest {
    
    private AirlineCustomer customer;
    
    @Before
    public void setUp() {
        customer = new AirlineCustomer();
    }
    
    @Test
    public void testDefaultConstructor() {
        assertNotNull(customer);
    }
    
    @Test
    public void testParameterizedConstructor() {
        AirlineCustomer c = new AirlineCustomer(
            20, 10, TravelerType.STUDENT, TravelClass.ECONOMY, 
            Destination.EUROPE, 15000.0, false, true
        );
        
        assertEquals(20, c.getAge());
        assertEquals(10, c.getFlightsPerYear());
        assertEquals(TravelerType.STUDENT, c.getTravelerType());
        assertEquals(TravelClass.ECONOMY, c.getTravelClass());
        assertEquals(Destination.EUROPE, c.getDestination());
        assertEquals(15000.0, c.getIncome(), 0.01);
        assertFalse(c.isTravelWithChildren());
        assertTrue(c.isLivesWithParents());
    }
    
    @Test
    public void testSetAndGetAge() {
        customer.setAge(25);
        assertEquals(25, customer.getAge());
    }
    
    @Test
    public void testSetAndGetFlightsPerYear() {
        customer.setFlightsPerYear(12);
        assertEquals(12, customer.getFlightsPerYear());
    }
    
    @Test
    public void testSetAndGetTravelerType() {
        customer.setTravelerType(TravelerType.WORKER);
        assertEquals(TravelerType.WORKER, customer.getTravelerType());
    }
    
    @Test
    public void testSetAndGetTravelClass() {
        customer.setTravelClass(TravelClass.BUSINESS);
        assertEquals(TravelClass.BUSINESS, customer.getTravelClass());
    }
    
    @Test
    public void testSetAndGetDestination() {
        customer.setDestination(Destination.ASIA);
        assertEquals(Destination.ASIA, customer.getDestination());
    }
    
    @Test
    public void testSetAndGetIncome() {
        customer.setIncome(30000.0);
        assertEquals(30000.0, customer.getIncome(), 0.01);
    }
    
    @Test
    public void testSetAndGetTravelWithChildren() {
        customer.setTravelWithChildren(true);
        assertTrue(customer.isTravelWithChildren());
        
        customer.setTravelWithChildren(false);
        assertFalse(customer.isTravelWithChildren());
    }
    
    @Test
    public void testSetAndGetLivesWithParents() {
        customer.setLivesWithParents(true);
        assertTrue(customer.isLivesWithParents());
        
        customer.setLivesWithParents(false);
        assertFalse(customer.isLivesWithParents());
    }
}
