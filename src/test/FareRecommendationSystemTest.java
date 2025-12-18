import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class FareRecommendationSystemTest {
    
    private AirlineCustomer customer;
    
    @Before
    public void setUp() {
        customer = new AirlineCustomer();
    }
    
    // Tests for "Pajarillo" fare (age < 18, flights >= 6)
    @Test
    public void testGetFare_Pajarillo() {
        customer.setAge(15);
        customer.setFlightsPerYear(6);
        
        TypeFare fare = FareRecommendationSystem.getFare(customer);
        
        assertNotNull(fare);
        assertEquals("Pajarillo", fare.getName());
        assertEquals(10, fare.getDiscount());
    }
    
    @Test
    public void testGetFare_PajarilloWithMoreFlights() {
        customer.setAge(17);
        customer.setFlightsPerYear(10);
        
        TypeFare fare = FareRecommendationSystem.getFare(customer);
        
        assertNotNull(fare);
        assertEquals("Pajarillo", fare.getName());
        assertEquals(10, fare.getDiscount());
    }
    
    @Test
    public void testGetFare_NotPajarillo_TooOld() {
        customer.setAge(18);
        customer.setFlightsPerYear(6);
        customer.setTravelerType(TravelerType.WORKER);
        customer.setTravelClass(TravelClass.ECONOMY);
        
        TypeFare fare = FareRecommendationSystem.getFare(customer);
        
        // Should not get Pajarillo because age >= 18
        if (fare != null) {
            assertNotEquals("Pajarillo", fare.getName());
        }
    }
    
    @Test
    public void testGetFare_NotPajarillo_NotEnoughFlights() {
        customer.setAge(15);
        customer.setFlightsPerYear(5);
        
        TypeFare fare = FareRecommendationSystem.getFare(customer);
        
        // Should not get Pajarillo because flights < 6
        assertNull(fare);
    }
    
    // Tests for "Gorrión" fare (student: age 18-25, student, economy, flights >= 9)
    @Test
    public void testIsStudent_True() {
        customer.setAge(20);
        customer.setTravelerType(TravelerType.STUDENT);
        customer.setTravelClass(TravelClass.ECONOMY);
        customer.setFlightsPerYear(9);
        
        assertTrue(FareRecommendationSystem.isStudent(customer));
    }
    
    @Test
    public void testIsStudent_False_TooYoung() {
        customer.setAge(17);
        customer.setTravelerType(TravelerType.STUDENT);
        customer.setTravelClass(TravelClass.ECONOMY);
        customer.setFlightsPerYear(9);
        
        assertFalse(FareRecommendationSystem.isStudent(customer));
    }
    
    @Test
    public void testIsStudent_False_TooOld() {
        customer.setAge(26);
        customer.setTravelerType(TravelerType.STUDENT);
        customer.setTravelClass(TravelClass.ECONOMY);
        customer.setFlightsPerYear(9);
        
        assertFalse(FareRecommendationSystem.isStudent(customer));
    }
    
    @Test
    public void testIsStudent_False_NotStudent() {
        customer.setAge(20);
        customer.setTravelerType(TravelerType.WORKER);
        customer.setTravelClass(TravelClass.ECONOMY);
        customer.setFlightsPerYear(9);
        
        assertFalse(FareRecommendationSystem.isStudent(customer));
    }
    
    @Test
    public void testIsStudent_False_BusinessClass() {
        customer.setAge(20);
        customer.setTravelerType(TravelerType.STUDENT);
        customer.setTravelClass(TravelClass.BUSINESS);
        customer.setFlightsPerYear(9);
        
        assertFalse(FareRecommendationSystem.isStudent(customer));
    }
    
    @Test
    public void testIsStudent_False_NotEnoughFlights() {
        customer.setAge(20);
        customer.setTravelerType(TravelerType.STUDENT);
        customer.setTravelClass(TravelClass.ECONOMY);
        customer.setFlightsPerYear(8);
        
        assertFalse(FareRecommendationSystem.isStudent(customer));
    }
    
    @Test
    public void testGetFare_Gorrion() {
        customer.setAge(22);
        customer.setTravelerType(TravelerType.STUDENT);
        customer.setTravelClass(TravelClass.ECONOMY);
        customer.setFlightsPerYear(10);
        
        TypeFare fare = FareRecommendationSystem.getFare(customer);
        
        assertNotNull(fare);
        assertEquals("Gorrión", fare.getName());
        assertEquals(15, fare.getDiscount());
    }
    
    // Tests for young worker fares (age 18-25, worker, economy, flights >= 3)
    @Test
    public void testIsYoungWorker_True() {
        customer.setAge(23);
        customer.setTravelerType(TravelerType.WORKER);
        customer.setTravelClass(TravelClass.ECONOMY);
        customer.setFlightsPerYear(3);
        
        assertTrue(FareRecommendationSystem.isYoungWorker(customer));
    }
    
    @Test
    public void testIsYoungWorker_False_TooYoung() {
        customer.setAge(17);
        customer.setTravelerType(TravelerType.WORKER);
        customer.setTravelClass(TravelClass.ECONOMY);
        customer.setFlightsPerYear(3);
        
        assertFalse(FareRecommendationSystem.isYoungWorker(customer));
    }
    
    @Test
    public void testIsYoungWorker_False_TooOld() {
        customer.setAge(26);
        customer.setTravelerType(TravelerType.WORKER);
        customer.setTravelClass(TravelClass.ECONOMY);
        customer.setFlightsPerYear(3);
        
        assertFalse(FareRecommendationSystem.isYoungWorker(customer));
    }
    
    @Test
    public void testIsYoungWorker_False_NotWorker() {
        customer.setAge(23);
        customer.setTravelerType(TravelerType.STUDENT);
        customer.setTravelClass(TravelClass.ECONOMY);
        customer.setFlightsPerYear(3);
        
        assertFalse(FareRecommendationSystem.isYoungWorker(customer));
    }
    
    @Test
    public void testIsYoungWorker_False_NotEnoughFlights() {
        customer.setAge(23);
        customer.setTravelerType(TravelerType.WORKER);
        customer.setTravelClass(TravelClass.ECONOMY);
        customer.setFlightsPerYear(2);
        
        assertFalse(FareRecommendationSystem.isYoungWorker(customer));
    }
    
    @Test
    public void testGetFare_TravelWhileYouCan_LivesWithParents() {
        customer.setAge(24);
        customer.setTravelerType(TravelerType.WORKER);
        customer.setTravelClass(TravelClass.ECONOMY);
        customer.setFlightsPerYear(5);
        customer.setLivesWithParents(true);
        
        TypeFare fare = FareRecommendationSystem.getFare(customer);
        
        assertNotNull(fare);
        assertEquals("Travel While You Can", fare.getName());
        assertEquals(5, fare.getDiscount());
    }
    
    @Test
    public void testGetFare_DaringToLeaveTheNest_NotLivesWithParents() {
        customer.setAge(24);
        customer.setTravelerType(TravelerType.WORKER);
        customer.setTravelClass(TravelClass.ECONOMY);
        customer.setFlightsPerYear(5);
        customer.setLivesWithParents(false);
        
        TypeFare fare = FareRecommendationSystem.getFare(customer);
        
        assertNotNull(fare);
        assertEquals("Daring to Leave the Nest", fare.getName());
        assertEquals(25, fare.getDiscount());
    }
    
    // Tests for mid-income adult (age > 25, income 20k-35k, economy, flights >= 6, Europe)
    @Test
    public void testIsMidIncomeAdult_True() {
        customer.setAge(30);
        customer.setIncome(25000);
        customer.setTravelClass(TravelClass.ECONOMY);
        customer.setFlightsPerYear(6);
        customer.setDestination(Destination.EUROPE);
        
        assertTrue(FareRecommendationSystem.isMidIncomeAdult(customer));
    }
    
    @Test
    public void testIsMidIncomeAdult_False_TooYoung() {
        customer.setAge(25);
        customer.setIncome(25000);
        customer.setTravelClass(TravelClass.ECONOMY);
        customer.setFlightsPerYear(6);
        customer.setDestination(Destination.EUROPE);
        
        assertFalse(FareRecommendationSystem.isMidIncomeAdult(customer));
    }
    
    @Test
    public void testIsMidIncomeAdult_False_IncomeTooLow() {
        customer.setAge(30);
        customer.setIncome(19999);
        customer.setTravelClass(TravelClass.ECONOMY);
        customer.setFlightsPerYear(6);
        customer.setDestination(Destination.EUROPE);
        
        assertFalse(FareRecommendationSystem.isMidIncomeAdult(customer));
    }
    
    @Test
    public void testIsMidIncomeAdult_False_IncomeTooHigh() {
        customer.setAge(30);
        customer.setIncome(35000);
        customer.setTravelClass(TravelClass.ECONOMY);
        customer.setFlightsPerYear(6);
        customer.setDestination(Destination.EUROPE);
        
        assertFalse(FareRecommendationSystem.isMidIncomeAdult(customer));
    }
    
    @Test
    public void testIsMidIncomeAdult_False_BusinessClass() {
        customer.setAge(30);
        customer.setIncome(25000);
        customer.setTravelClass(TravelClass.BUSINESS);
        customer.setFlightsPerYear(6);
        customer.setDestination(Destination.EUROPE);
        
        assertFalse(FareRecommendationSystem.isMidIncomeAdult(customer));
    }
    
    @Test
    public void testIsMidIncomeAdult_False_NotEnoughFlights() {
        customer.setAge(30);
        customer.setIncome(25000);
        customer.setTravelClass(TravelClass.ECONOMY);
        customer.setFlightsPerYear(5);
        customer.setDestination(Destination.EUROPE);
        
        assertFalse(FareRecommendationSystem.isMidIncomeAdult(customer));
    }
    
    @Test
    public void testIsMidIncomeAdult_False_WrongDestination() {
        customer.setAge(30);
        customer.setIncome(25000);
        customer.setTravelClass(TravelClass.ECONOMY);
        customer.setFlightsPerYear(6);
        customer.setDestination(Destination.ASIA);
        
        assertFalse(FareRecommendationSystem.isMidIncomeAdult(customer));
    }
    
    @Test
    public void testGetFare_DiscoverEurope_NoChildren() {
        customer.setAge(35);
        customer.setIncome(28000);
        customer.setTravelClass(TravelClass.ECONOMY);
        customer.setFlightsPerYear(8);
        customer.setDestination(Destination.EUROPE);
        customer.setTravelWithChildren(false);
        
        TypeFare fare = FareRecommendationSystem.getFare(customer);
        
        assertNotNull(fare);
        assertEquals("Discover Europe", fare.getName());
        assertEquals(15, fare.getDiscount());
    }
    
    @Test
    public void testGetFare_DiscoverEuropeWithChildren() {
        customer.setAge(35);
        customer.setIncome(28000);
        customer.setTravelClass(TravelClass.ECONOMY);
        customer.setFlightsPerYear(8);
        customer.setDestination(Destination.EUROPE);
        customer.setTravelWithChildren(true);
        
        TypeFare fare = FareRecommendationSystem.getFare(customer);
        
        assertNotNull(fare);
        assertEquals("Discover Europe with Your Little Ones", fare.getName());
        assertEquals(10, fare.getDiscount());
    }
    
    // Tests for high-income adult (age > 25, income >= 35k, business, flights >= 6, Asia/America)
    @Test
    public void testIsHighIncomeAdult_True_Asia() {
        customer.setAge(40);
        customer.setIncome(50000);
        customer.setTravelClass(TravelClass.BUSINESS);
        customer.setFlightsPerYear(10);
        customer.setDestination(Destination.ASIA);
        
        assertTrue(FareRecommendationSystem.isHighIncomeAdult(customer));
    }
    
    @Test
    public void testIsHighIncomeAdult_True_America() {
        customer.setAge(40);
        customer.setIncome(50000);
        customer.setTravelClass(TravelClass.BUSINESS);
        customer.setFlightsPerYear(10);
        customer.setDestination(Destination.AMERICA);
        
        assertTrue(FareRecommendationSystem.isHighIncomeAdult(customer));
    }
    
    @Test
    public void testIsHighIncomeAdult_False_TooYoung() {
        customer.setAge(25);
        customer.setIncome(50000);
        customer.setTravelClass(TravelClass.BUSINESS);
        customer.setFlightsPerYear(10);
        customer.setDestination(Destination.ASIA);
        
        assertFalse(FareRecommendationSystem.isHighIncomeAdult(customer));
    }
    
    @Test
    public void testIsHighIncomeAdult_False_IncomeTooLow() {
        customer.setAge(40);
        customer.setIncome(34999);
        customer.setTravelClass(TravelClass.BUSINESS);
        customer.setFlightsPerYear(10);
        customer.setDestination(Destination.ASIA);
        
        assertFalse(FareRecommendationSystem.isHighIncomeAdult(customer));
    }
    
    @Test
    public void testIsHighIncomeAdult_False_EconomyClass() {
        customer.setAge(40);
        customer.setIncome(50000);
        customer.setTravelClass(TravelClass.ECONOMY);
        customer.setFlightsPerYear(10);
        customer.setDestination(Destination.ASIA);
        
        assertFalse(FareRecommendationSystem.isHighIncomeAdult(customer));
    }
    
    @Test
    public void testIsHighIncomeAdult_False_NotEnoughFlights() {
        customer.setAge(40);
        customer.setIncome(50000);
        customer.setTravelClass(TravelClass.BUSINESS);
        customer.setFlightsPerYear(5);
        customer.setDestination(Destination.ASIA);
        
        assertFalse(FareRecommendationSystem.isHighIncomeAdult(customer));
    }
    
    @Test
    public void testIsHighIncomeAdult_False_WrongDestination_Europe() {
        customer.setAge(40);
        customer.setIncome(50000);
        customer.setTravelClass(TravelClass.BUSINESS);
        customer.setFlightsPerYear(10);
        customer.setDestination(Destination.EUROPE);
        
        assertFalse(FareRecommendationSystem.isHighIncomeAdult(customer));
    }
    
    @Test
    public void testIsHighIncomeAdult_False_WrongDestination_Other() {
        customer.setAge(40);
        customer.setIncome(50000);
        customer.setTravelClass(TravelClass.BUSINESS);
        customer.setFlightsPerYear(10);
        customer.setDestination(Destination.OTHER);
        
        assertFalse(FareRecommendationSystem.isHighIncomeAdult(customer));
    }
    
    @Test
    public void testGetFare_DiscoverTheWorld_NoChildren() {
        customer.setAge(45);
        customer.setIncome(60000);
        customer.setTravelClass(TravelClass.BUSINESS);
        customer.setFlightsPerYear(12);
        customer.setDestination(Destination.ASIA);
        customer.setTravelWithChildren(false);
        
        TypeFare fare = FareRecommendationSystem.getFare(customer);
        
        assertNotNull(fare);
        assertEquals("Discover the World", fare.getName());
        assertEquals(20, fare.getDiscount());
    }
    
    @Test
    public void testGetFare_DiscoverTheWorldWithChildren() {
        customer.setAge(45);
        customer.setIncome(60000);
        customer.setTravelClass(TravelClass.BUSINESS);
        customer.setFlightsPerYear(12);
        customer.setDestination(Destination.AMERICA);
        customer.setTravelWithChildren(true);
        
        TypeFare fare = FareRecommendationSystem.getFare(customer);
        
        assertNotNull(fare);
        assertEquals("Discover the World with Your Little Ones", fare.getName());
        assertEquals(10, fare.getDiscount());
    }
    
    // Edge cases and null tests
    @Test
    public void testGetFare_NoMatchingFare() {
        customer.setAge(30);
        customer.setIncome(15000);
        customer.setTravelClass(TravelClass.ECONOMY);
        customer.setFlightsPerYear(2);
        customer.setDestination(Destination.OTHER);
        
        TypeFare fare = FareRecommendationSystem.getFare(customer);
        
        assertNull(fare);
    }
    
    @Test
    public void testGetFare_BoundaryAge18_Student() {
        customer.setAge(18);
        customer.setTravelerType(TravelerType.STUDENT);
        customer.setTravelClass(TravelClass.ECONOMY);
        customer.setFlightsPerYear(9);
        
        TypeFare fare = FareRecommendationSystem.getFare(customer);
        
        assertNotNull(fare);
        assertEquals("Gorrión", fare.getName());
    }
    
    @Test
    public void testGetFare_BoundaryAge25_Student() {
        customer.setAge(25);
        customer.setTravelerType(TravelerType.STUDENT);
        customer.setTravelClass(TravelClass.ECONOMY);
        customer.setFlightsPerYear(9);
        
        TypeFare fare = FareRecommendationSystem.getFare(customer);
        
        assertNotNull(fare);
        assertEquals("Gorrión", fare.getName());
    }
    
    @Test
    public void testGetFare_BoundaryAge26() {
        customer.setAge(26);
        customer.setIncome(25000);
        customer.setTravelClass(TravelClass.ECONOMY);
        customer.setFlightsPerYear(6);
        customer.setDestination(Destination.EUROPE);
        
        TypeFare fare = FareRecommendationSystem.getFare(customer);
        
        assertNotNull(fare);
        assertEquals("Discover Europe", fare.getName());
    }
    
    @Test
    public void testGetFare_BoundaryIncome20000() {
        customer.setAge(30);
        customer.setIncome(20000);
        customer.setTravelClass(TravelClass.ECONOMY);
        customer.setFlightsPerYear(6);
        customer.setDestination(Destination.EUROPE);
        
        TypeFare fare = FareRecommendationSystem.getFare(customer);
        
        assertNotNull(fare);
        assertEquals("Discover Europe", fare.getName());
    }
    
    @Test
    public void testGetFare_BoundaryIncome35000_HighIncome() {
        customer.setAge(30);
        customer.setIncome(35000);
        customer.setTravelClass(TravelClass.BUSINESS);
        customer.setFlightsPerYear(6);
        customer.setDestination(Destination.ASIA);
        
        TypeFare fare = FareRecommendationSystem.getFare(customer);
        
        assertNotNull(fare);
        assertEquals("Discover the World", fare.getName());
    }
}
