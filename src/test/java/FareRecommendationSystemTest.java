import org.junit.Test;
import static org.junit.Assert.*;

public class FareRecommendationSystemTest {
    
    @Test
    public void isStudentTest() {
        AirlineCustomer s1 = new AirlineCustomer(20, 9, TravelerType.STUDENT, TravelClass.ECONOMY, null, 0, false, false);
        assertEquals(true, FareRecommendationSystem.isStudent(s1));

        AirlineCustomer s2 = new AirlineCustomer(17, 9, TravelerType.STUDENT, TravelClass.ECONOMY, null, 0, false, false);
        assertEquals(false, FareRecommendationSystem.isStudent(s2));

        AirlineCustomer s3 = new AirlineCustomer(26, 9, TravelerType.STUDENT, TravelClass.ECONOMY, null, 0, false, false);
        assertEquals(false, FareRecommendationSystem.isStudent(s3));

        AirlineCustomer s4 = new AirlineCustomer(20, 9, TravelerType.WORKER, TravelClass.ECONOMY, null, 0, false, false);
        assertEquals(false, FareRecommendationSystem.isStudent(s4));

        AirlineCustomer s5 = new AirlineCustomer(20, 9, TravelerType.STUDENT, TravelClass.BUSINESS, null, 0, false, false);
        assertEquals(false, FareRecommendationSystem.isStudent(s5));

        AirlineCustomer s6 = new AirlineCustomer(20, 8, TravelerType.STUDENT, TravelClass.ECONOMY, null, 0, false, false);
        assertEquals(false, FareRecommendationSystem.isStudent(s6));
    }

    @Test
    public void isYoungWorkerTest() {
        AirlineCustomer y1 = new AirlineCustomer(22, 3, TravelerType.WORKER, TravelClass.ECONOMY, null, 0, false, false);
        assertEquals(true, FareRecommendationSystem.isYoungWorker(y1));

        AirlineCustomer y2 = new AirlineCustomer(17, 3, TravelerType.WORKER, TravelClass.ECONOMY, null, 0, false, false);
        assertEquals(false, FareRecommendationSystem.isYoungWorker(y2));

        AirlineCustomer y3 = new AirlineCustomer(26, 3, TravelerType.WORKER, TravelClass.ECONOMY, null, 0, false, false);
        assertEquals(false, FareRecommendationSystem.isYoungWorker(y3));

        AirlineCustomer y4 = new AirlineCustomer(22, 3, TravelerType.STUDENT, TravelClass.ECONOMY, null, 0, false, false);
        assertEquals(false, FareRecommendationSystem.isYoungWorker(y4));

        AirlineCustomer y5 = new AirlineCustomer(22, 3, TravelerType.WORKER, TravelClass.BUSINESS, null, 0, false, false);
        assertEquals(false, FareRecommendationSystem.isYoungWorker(y5));

        AirlineCustomer y6 = new AirlineCustomer(22, 2, TravelerType.WORKER, TravelClass.BUSINESS, null, 0, false, false);
        assertEquals(false, FareRecommendationSystem.isYoungWorker(y6));
    }

    @Test
    public void isMidIncomeAdultTest() {
        AirlineCustomer m1 = new AirlineCustomer(30, 6, null, TravelClass.ECONOMY, Destination.EUROPE, 25000, false, false);
        assertEquals(true, FareRecommendationSystem.isMidIncomeAdult(m1));

        AirlineCustomer m2 = new AirlineCustomer(25, 6, null, TravelClass.ECONOMY, Destination.EUROPE, 25000, false, false);
        assertEquals(false, FareRecommendationSystem.isMidIncomeAdult(m2));

        AirlineCustomer m3 = new AirlineCustomer(30, 6, null, TravelClass.ECONOMY, Destination.EUROPE, 19000, false, false);
        assertEquals(false, FareRecommendationSystem.isMidIncomeAdult(m3));

        AirlineCustomer m4 = new AirlineCustomer(30, 6, null, TravelClass.ECONOMY, Destination.EUROPE, 36000, false, false);
        assertEquals(false, FareRecommendationSystem.isMidIncomeAdult(m4));

        AirlineCustomer m5 = new AirlineCustomer(30, 6, null, TravelClass.BUSINESS, Destination.EUROPE, 25000, false, false);
        assertEquals(false, FareRecommendationSystem.isMidIncomeAdult(m5));

        AirlineCustomer m6 = new AirlineCustomer(30, 5, null, TravelClass.ECONOMY, Destination.EUROPE, 25000, false, false);
        assertEquals(false, FareRecommendationSystem.isMidIncomeAdult(m6));

        AirlineCustomer m7 = new AirlineCustomer(30, 6, null, TravelClass.ECONOMY, Destination.ASIA, 25000, false, false);
        assertEquals(false, FareRecommendationSystem.isMidIncomeAdult(m7));
    }

    @Test
    public void isHighIncomeAdultTest() {
        AirlineCustomer h1 = new AirlineCustomer(40, 6, null, TravelClass.BUSINESS, Destination.ASIA, 50000, false, false);
        assertEquals(true, FareRecommendationSystem.isHighIncomeAdult(h1));

        AirlineCustomer h2 = new AirlineCustomer(25, 6, null, TravelClass.BUSINESS, Destination.ASIA, 50000, false, false);
        assertEquals(false, FareRecommendationSystem.isHighIncomeAdult(h2));

        AirlineCustomer h3 = new AirlineCustomer(40, 6, null, TravelClass.BUSINESS, Destination.ASIA, 34000, false, false);
        assertEquals(false, FareRecommendationSystem.isHighIncomeAdult(h3));

        AirlineCustomer h4 = new AirlineCustomer(40, 6, null, TravelClass.ECONOMY, Destination.ASIA, 50000, false, false);
        assertEquals(false, FareRecommendationSystem.isHighIncomeAdult(h4));

        AirlineCustomer h5 = new AirlineCustomer(40, 5, null, TravelClass.BUSINESS, Destination.ASIA, 50000, false, false);
        assertEquals(false, FareRecommendationSystem.isHighIncomeAdult(h5));

        AirlineCustomer h6 = new AirlineCustomer(40, 6, null, TravelClass.BUSINESS, Destination.EUROPE, 50000, false, false);
        assertEquals(false, FareRecommendationSystem.isHighIncomeAdult(h6));
    }

}
