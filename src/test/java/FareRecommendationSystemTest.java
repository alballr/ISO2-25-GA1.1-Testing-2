import org.junit.Test;
import static org.junit.Assert.*;

public class FareRecommendationSystemTest {
    
    @Test
    public void isStudentTest() {

        AirlineCustomer p1 = new AirlineCustomer(0, 0, TravelerType.STUDENT, TravelClass.ECONOMY, null, 0, false, false);
        assertEquals(false, FareRecommendationSystem.isStudent(p1));

        AirlineCustomer p2 = new AirlineCustomer(0, 7, TravelerType.WORKER, TravelClass.BUSINESS, null, 0, false, false);
        assertEquals(false, FareRecommendationSystem.isStudent(p2));

        AirlineCustomer p3 = new AirlineCustomer(11, 9, TravelerType.STUDENT, TravelClass.BUSINESS, null, 0, false, false);
        assertEquals(false, FareRecommendationSystem.isStudent(p3));

        AirlineCustomer p4 = new AirlineCustomer(11, 19, TravelerType.WORKER, TravelClass.ECONOMY, null, 0, false, false);
        assertEquals(false, FareRecommendationSystem.isStudent(p4));

        AirlineCustomer p5 = new AirlineCustomer(18, 0, TravelerType.WORKER, TravelClass.BUSINESS, null, 0, false, false);
        assertEquals(false, FareRecommendationSystem.isStudent(p5));

        AirlineCustomer p6 = new AirlineCustomer(18, 7, TravelerType.STUDENT, TravelClass.ECONOMY, null, 0, false, false);
        assertEquals(false, FareRecommendationSystem.isStudent(p6));

        AirlineCustomer p7 = new AirlineCustomer(21, 9, TravelerType.WORKER, TravelClass.ECONOMY, null, 0, false, false);
        assertEquals(false, FareRecommendationSystem.isStudent(p7));

        AirlineCustomer p8 = new AirlineCustomer(21, 19, TravelerType.STUDENT, TravelClass.BUSINESS, null, 0, false, false);
        assertEquals(false, FareRecommendationSystem.isStudent(p8));

        AirlineCustomer p9 = new AirlineCustomer(25, 0, TravelerType.STUDENT, TravelClass.ECONOMY, null, 0, false, false);
        assertEquals(false, FareRecommendationSystem.isStudent(p9));

        AirlineCustomer p10 = new AirlineCustomer(25, 7, TravelerType.WORKER, TravelClass.BUSINESS, null, 0, false, false);
        assertEquals(false, FareRecommendationSystem.isStudent(p10));

        AirlineCustomer p11 = new AirlineCustomer(30, 0, TravelerType.STUDENT, TravelClass.ECONOMY, null, 0, false, false);
        assertEquals(false, FareRecommendationSystem.isStudent(p11));

        AirlineCustomer p12 = new AirlineCustomer(30, 7, TravelerType.WORKER, TravelClass.BUSINESS, null, 0, false, false);
        assertEquals(false, FareRecommendationSystem.isStudent(p12));

        AirlineCustomer p13 = new AirlineCustomer(0, 9, TravelerType.STUDENT, TravelClass.ECONOMY, null, 0, false, false);
        assertEquals(false, FareRecommendationSystem.isStudent(p13));

        AirlineCustomer p14 = new AirlineCustomer(0, 19, TravelerType.STUDENT, TravelClass.ECONOMY, null, 0, false, false);
        assertEquals(false, FareRecommendationSystem.isStudent(p14));

        AirlineCustomer p15 = new AirlineCustomer(11, 0, TravelerType.STUDENT, TravelClass.ECONOMY, null, 0, false, false);
        assertEquals(false, FareRecommendationSystem.isStudent(p15));

        AirlineCustomer p16 = new AirlineCustomer(11, 7, TravelerType.STUDENT, TravelClass.ECONOMY, null, 0, false, false);
        assertEquals(false, FareRecommendationSystem.isStudent(p16));

        AirlineCustomer p17 = new AirlineCustomer(18, 9, TravelerType.STUDENT, TravelClass.ECONOMY, null, 0, false, false);
        assertEquals(true, FareRecommendationSystem.isStudent(p17));

        AirlineCustomer p18 = new AirlineCustomer(18, 19, TravelerType.STUDENT, TravelClass.ECONOMY, null, 0, false, false);
        assertEquals(true, FareRecommendationSystem.isStudent(p18));

        AirlineCustomer p19 = new AirlineCustomer(21, 0, TravelerType.STUDENT, TravelClass.ECONOMY, null, 0, false, false);
        assertEquals(false, FareRecommendationSystem.isStudent(p19));

        AirlineCustomer p20 = new AirlineCustomer(21, 7, TravelerType.STUDENT, TravelClass.ECONOMY, null, 0, false, false);
        assertEquals(false, FareRecommendationSystem.isStudent(p20));

        AirlineCustomer p21 = new AirlineCustomer(25, 9, TravelerType.STUDENT, TravelClass.ECONOMY, null, 0, false, false);
        assertEquals(true, FareRecommendationSystem.isStudent(p21));

        AirlineCustomer p22 = new AirlineCustomer(25, 19, TravelerType.STUDENT, TravelClass.ECONOMY, null, 0, false, false);
        assertEquals(true, FareRecommendationSystem.isStudent(p22));

        AirlineCustomer p23 = new AirlineCustomer(30, 9, TravelerType.STUDENT, TravelClass.ECONOMY, null, 0, false, false);
        assertEquals(false, FareRecommendationSystem.isStudent(p23));

        AirlineCustomer p24 = new AirlineCustomer(30, 19, TravelerType.STUDENT, TravelClass.ECONOMY, null, 0, false, false);
        assertEquals(false, FareRecommendationSystem.isStudent(p24));

        AirlineCustomer m1 = new AirlineCustomer(20, 9, TravelerType.STUDENT, TravelClass.ECONOMY, null, 0, false, false);
        assertEquals(true, FareRecommendationSystem.isStudent(m1));

        AirlineCustomer m2 = new AirlineCustomer(17, 9, TravelerType.STUDENT, TravelClass.ECONOMY, null, 0, false, false);
        assertEquals(false, FareRecommendationSystem.isStudent(m2));

        AirlineCustomer m3 = new AirlineCustomer(26, 9, TravelerType.STUDENT, TravelClass.ECONOMY, null, 0, false, false);
        assertEquals(false, FareRecommendationSystem.isStudent(m3));

        AirlineCustomer m4 = new AirlineCustomer(20, 9, TravelerType.WORKER, TravelClass.ECONOMY, null, 0, false, false);
        assertEquals(false, FareRecommendationSystem.isStudent(m4));

        AirlineCustomer m5 = new AirlineCustomer(20, 9, TravelerType.STUDENT, TravelClass.BUSINESS, null, 0, false, false);
        assertEquals(false, FareRecommendationSystem.isStudent(m5));

        AirlineCustomer m6 = new AirlineCustomer(20, 8, TravelerType.STUDENT, TravelClass.ECONOMY, null, 0, false, false);
        assertEquals(false, FareRecommendationSystem.isStudent(m6));
    }


    @Test
    public void isYoungWorkerTest() {

        AirlineCustomer p1 = new AirlineCustomer(0, 0, TravelerType.STUDENT, TravelClass.ECONOMY, null, 0, false, false);
        assertEquals(false, FareRecommendationSystem.isYoungWorker(p1));

        AirlineCustomer p2 = new AirlineCustomer(0, 2, TravelerType.WORKER, TravelClass.BUSINESS, null, 0, false, false);
        assertEquals(false, FareRecommendationSystem.isYoungWorker(p2));

        AirlineCustomer p3 = new AirlineCustomer(11, 3, TravelerType.STUDENT, TravelClass.BUSINESS, null, 0, false, false);
        assertEquals(false, FareRecommendationSystem.isYoungWorker(p3));

        AirlineCustomer p4 = new AirlineCustomer(11, 19, TravelerType.WORKER, TravelClass.ECONOMY, null, 0, false, false);
        assertEquals(false, FareRecommendationSystem.isYoungWorker(p4));

        AirlineCustomer p5 = new AirlineCustomer(18, 0, TravelerType.WORKER, TravelClass.BUSINESS, null, 0, false, false);
        assertEquals(false, FareRecommendationSystem.isYoungWorker(p5));

        AirlineCustomer p6 = new AirlineCustomer(18, 2, TravelerType.STUDENT, TravelClass.ECONOMY, null, 0, false, false);
        assertEquals(false, FareRecommendationSystem.isYoungWorker(p6));

        AirlineCustomer p7 = new AirlineCustomer(21, 3, TravelerType.WORKER, TravelClass.ECONOMY, null, 0, false, false);
        assertEquals(true, FareRecommendationSystem.isYoungWorker(p7));

        AirlineCustomer p8 = new AirlineCustomer(21, 19, TravelerType.STUDENT, TravelClass.BUSINESS, null, 0, false, false);
        assertEquals(false, FareRecommendationSystem.isYoungWorker(p8));

        AirlineCustomer p9 = new AirlineCustomer(25, 0, TravelerType.STUDENT, TravelClass.ECONOMY, null, 0, false, false);
        assertEquals(false, FareRecommendationSystem.isYoungWorker(p9));

        AirlineCustomer p10 = new AirlineCustomer(25, 2, TravelerType.WORKER, TravelClass.BUSINESS, null, 0, false, false);
        assertEquals(false, FareRecommendationSystem.isYoungWorker(p10));

        AirlineCustomer p11 = new AirlineCustomer(30, 0, TravelerType.STUDENT, TravelClass.ECONOMY, null, 0, false, false);
        assertEquals(false, FareRecommendationSystem.isYoungWorker(p11));

        AirlineCustomer p12 = new AirlineCustomer(30, 2, TravelerType.WORKER, TravelClass.BUSINESS, null, 0, false, false);
        assertEquals(false, FareRecommendationSystem.isYoungWorker(p12));

        AirlineCustomer p13 = new AirlineCustomer(0, 3, TravelerType.STUDENT, TravelClass.ECONOMY, null, 0, false, false);
        assertEquals(false, FareRecommendationSystem.isYoungWorker(p13));

        AirlineCustomer p14 = new AirlineCustomer(0, 19, TravelerType.STUDENT, TravelClass.ECONOMY, null, 0, false, false);
        assertEquals(false, FareRecommendationSystem.isYoungWorker(p14));

        AirlineCustomer p15 = new AirlineCustomer(11, 0, TravelerType.STUDENT, TravelClass.ECONOMY, null, 0, false, false);
        assertEquals(false, FareRecommendationSystem.isYoungWorker(p15));

        AirlineCustomer p16 = new AirlineCustomer(11, 2, TravelerType.STUDENT, TravelClass.ECONOMY, null, 0, false, false);
        assertEquals(false, FareRecommendationSystem.isYoungWorker(p16));

        AirlineCustomer p17 = new AirlineCustomer(18, 3, TravelerType.STUDENT, TravelClass.ECONOMY, null, 0, false, false);
        assertEquals(false, FareRecommendationSystem.isYoungWorker(p17));

        AirlineCustomer p18 = new AirlineCustomer(18, 19, TravelerType.STUDENT, TravelClass.ECONOMY, null, 0, false, false);
        assertEquals(false, FareRecommendationSystem.isYoungWorker(p18));

        AirlineCustomer p19 = new AirlineCustomer(21, 0, TravelerType.STUDENT, TravelClass.ECONOMY, null, 0, false, false);
        assertEquals(false, FareRecommendationSystem.isYoungWorker(p19));

        AirlineCustomer p20 = new AirlineCustomer(21, 2, TravelerType.STUDENT, TravelClass.ECONOMY, null, 0, false, false);
        assertEquals(false, FareRecommendationSystem.isYoungWorker(p20));

        AirlineCustomer p21 = new AirlineCustomer(25, 3, TravelerType.STUDENT, TravelClass.ECONOMY, null, 0, false, false);
        assertEquals(false, FareRecommendationSystem.isYoungWorker(p21));

        AirlineCustomer p22 = new AirlineCustomer(25, 19, TravelerType.STUDENT, TravelClass.ECONOMY, null, 0, false, false);
        assertEquals(false, FareRecommendationSystem.isYoungWorker(p22));

        AirlineCustomer p23 = new AirlineCustomer(30, 3, TravelerType.STUDENT, TravelClass.ECONOMY, null, 0, false, false);
        assertEquals(false, FareRecommendationSystem.isYoungWorker(p23));

        AirlineCustomer p24 = new AirlineCustomer(30, 19, TravelerType.STUDENT, TravelClass.ECONOMY, null, 0, false, false);
        assertEquals(false, FareRecommendationSystem.isYoungWorker(p24));

        AirlineCustomer m1 = new AirlineCustomer(22, 3, TravelerType.WORKER, TravelClass.ECONOMY, null, 0, false, false);
        assertEquals(true, FareRecommendationSystem.isYoungWorker(m1));

        AirlineCustomer m2 = new AirlineCustomer(17, 3, TravelerType.WORKER, TravelClass.ECONOMY, null, 0, false, false);
        assertEquals(false, FareRecommendationSystem.isYoungWorker(m2));

        AirlineCustomer m3 = new AirlineCustomer(26, 3, TravelerType.WORKER, TravelClass.ECONOMY, null, 0, false, false);
        assertEquals(false, FareRecommendationSystem.isYoungWorker(m3));

        AirlineCustomer m4 = new AirlineCustomer(22, 3, TravelerType.STUDENT, TravelClass.ECONOMY, null, 0, false, false);
        assertEquals(false, FareRecommendationSystem.isYoungWorker(m4));

        AirlineCustomer m5 = new AirlineCustomer(22, 3, TravelerType.WORKER, TravelClass.BUSINESS, null, 0, false, false);
        assertEquals(false, FareRecommendationSystem.isYoungWorker(m5));

        AirlineCustomer m6 = new AirlineCustomer(22, 2, TravelerType.WORKER, TravelClass.ECONOMY, null, 0, false, false);
        assertEquals(false, FareRecommendationSystem.isYoungWorker(m6));
    }

    @Test
    public void isMidIncomeAdultTest() {

        AirlineCustomer p1 = new AirlineCustomer(0, 0, null, TravelClass.ECONOMY, Destination.EUROPE, 0, false, false);
        assertEquals(false, FareRecommendationSystem.isMidIncomeAdult(p1));

        AirlineCustomer p2 = new AirlineCustomer(0, 5, null, TravelClass.BUSINESS, Destination.ASIA, 10000, false, false);
        assertEquals(false, FareRecommendationSystem.isMidIncomeAdult(p2));

        AirlineCustomer p3 = new AirlineCustomer(21, 6, null, TravelClass.BUSINESS, Destination.AMERICA, 0, false, false);
        assertEquals(false, FareRecommendationSystem.isMidIncomeAdult(p3));

        AirlineCustomer p4 = new AirlineCustomer(21, 19, null, TravelClass.ECONOMY, Destination.OTHER, 10000, false, false);
        assertEquals(false, FareRecommendationSystem.isMidIncomeAdult(p4));

        AirlineCustomer p5 = new AirlineCustomer(25, 5, null, TravelClass.ECONOMY, Destination.AMERICA, 20000, false, false);
        assertEquals(false, FareRecommendationSystem.isMidIncomeAdult(p5));

        AirlineCustomer p6 = new AirlineCustomer(25, 0, null, TravelClass.BUSINESS, Destination.OTHER, 30000, false, false);
        assertEquals(false, FareRecommendationSystem.isMidIncomeAdult(p6));

        AirlineCustomer p7 = new AirlineCustomer(30, 19, null, TravelClass.BUSINESS, Destination.EUROPE, 20000, false, false);
        assertEquals(false, FareRecommendationSystem.isMidIncomeAdult(p7));

        AirlineCustomer p8 = new AirlineCustomer(30, 6, null, TravelClass.ECONOMY, Destination.ASIA, 30000, false, false);
        assertEquals(false, FareRecommendationSystem.isMidIncomeAdult(p8));

        AirlineCustomer p9 = new AirlineCustomer(0, 6, null, TravelClass.ECONOMY, Destination.OTHER, 35000, false, false);
        assertEquals(false, FareRecommendationSystem.isMidIncomeAdult(p9));

        AirlineCustomer p10 = new AirlineCustomer(0, 19, null, TravelClass.ECONOMY, Destination.AMERICA, 1000000, false, false);
        assertEquals(false, FareRecommendationSystem.isMidIncomeAdult(p10));

        AirlineCustomer p11 = new AirlineCustomer(21, 0, null, TravelClass.BUSINESS, Destination.ASIA, 35000, false, false);
        assertEquals(false, FareRecommendationSystem.isMidIncomeAdult(p11));

        AirlineCustomer p12 = new AirlineCustomer(21, 5, null, TravelClass.BUSINESS, Destination.EUROPE, 1000000, false, false);
        assertEquals(false, FareRecommendationSystem.isMidIncomeAdult(p12));

        AirlineCustomer p13 = new AirlineCustomer(25, 19, null, TravelClass.ECONOMY, Destination.ASIA, 0, false, false);
        assertEquals(false, FareRecommendationSystem.isMidIncomeAdult(p13));

        AirlineCustomer p14 = new AirlineCustomer(25, 6, null, TravelClass.ECONOMY, Destination.EUROPE, 10000, false, false);
        assertEquals(false, FareRecommendationSystem.isMidIncomeAdult(p14));

        AirlineCustomer p15 = new AirlineCustomer(30, 5, null, TravelClass.ECONOMY, Destination.OTHER, 0, false, false);
        assertEquals(false, FareRecommendationSystem.isMidIncomeAdult(p15));

        AirlineCustomer p16 = new AirlineCustomer(30, 0, null, TravelClass.ECONOMY, Destination.AMERICA, 10000, false, false);
        assertEquals(false, FareRecommendationSystem.isMidIncomeAdult(p16));

        AirlineCustomer p17 = new AirlineCustomer(0, 0, null, TravelClass.ECONOMY, Destination.ASIA, 20000, false, false);
        assertEquals(false, FareRecommendationSystem.isMidIncomeAdult(p17));

        AirlineCustomer p18 = new AirlineCustomer(0, 5, null, TravelClass.ECONOMY, Destination.EUROPE, 30000, false, false);
        assertEquals(false, FareRecommendationSystem.isMidIncomeAdult(p18));

        AirlineCustomer p19 = new AirlineCustomer(21, 6, null, TravelClass.ECONOMY, Destination.OTHER, 20000, false, false);
        assertEquals(false, FareRecommendationSystem.isMidIncomeAdult(p19));

        AirlineCustomer p20 = new AirlineCustomer(21, 19, null, TravelClass.ECONOMY, Destination.AMERICA, 30000, false, false);
        assertEquals(false, FareRecommendationSystem.isMidIncomeAdult(p20));

        AirlineCustomer p21 = new AirlineCustomer(25, 5, null, TravelClass.ECONOMY, Destination.EUROPE, 35000, false, false);
        assertEquals(false, FareRecommendationSystem.isMidIncomeAdult(p21));

        AirlineCustomer p22 = new AirlineCustomer(25, 0, null, TravelClass.ECONOMY, Destination.ASIA, 1000000, false, false);
        assertEquals(false, FareRecommendationSystem.isMidIncomeAdult(p22));

        AirlineCustomer p23 = new AirlineCustomer(30, 19, null, TravelClass.ECONOMY, Destination.AMERICA, 35000, false, false);
        assertEquals(false, FareRecommendationSystem.isMidIncomeAdult(p23));

        AirlineCustomer p24 = new AirlineCustomer(30, 6, null, TravelClass.ECONOMY, Destination.OTHER, 1000000, false, false);
        assertEquals(false, FareRecommendationSystem.isMidIncomeAdult(p24));

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

        AirlineCustomer p1 = new AirlineCustomer(0, 0, null, TravelClass.ECONOMY, Destination.EUROPE, 0, false, false);
        assertEquals(false, FareRecommendationSystem.isHighIncomeAdult(p1));

        AirlineCustomer p2 = new AirlineCustomer(0, 5, null, TravelClass.BUSINESS, Destination.ASIA, 30000, false, false);
        assertEquals(false, FareRecommendationSystem.isHighIncomeAdult(p2));

        AirlineCustomer p3 = new AirlineCustomer(21, 6, null, TravelClass.BUSINESS, Destination.AMERICA, 0, false, false);
        assertEquals(false, FareRecommendationSystem.isHighIncomeAdult(p3));

        AirlineCustomer p4 = new AirlineCustomer(21, 19, null, TravelClass.ECONOMY, Destination.OTHER, 30000, false, false);
        assertEquals(false, FareRecommendationSystem.isHighIncomeAdult(p4));

        AirlineCustomer p5 = new AirlineCustomer(25, 5, null, TravelClass.ECONOMY, Destination.AMERICA, 35000, false, false);
        assertEquals(false, FareRecommendationSystem.isHighIncomeAdult(p5));

        AirlineCustomer p6 = new AirlineCustomer(25, 0, null, TravelClass.BUSINESS, Destination.OTHER, 1000000, false, false);
        assertEquals(false, FareRecommendationSystem.isHighIncomeAdult(p6));

        AirlineCustomer p7 = new AirlineCustomer(30, 19, null, TravelClass.BUSINESS, Destination.EUROPE, 35000, false, false);
        assertEquals(false, FareRecommendationSystem.isHighIncomeAdult(p7));

        AirlineCustomer p8 = new AirlineCustomer(30, 6, null, TravelClass.ECONOMY, Destination.ASIA, 1000000, false, false);
        assertEquals(false, FareRecommendationSystem.isHighIncomeAdult(p8));

        AirlineCustomer p9 = new AirlineCustomer(0, 6, null, TravelClass.ECONOMY, Destination.OTHER, 35000, false, false);
        assertEquals(false, FareRecommendationSystem.isHighIncomeAdult(p9));

        AirlineCustomer p10 = new AirlineCustomer(0, 19, null, TravelClass.ECONOMY, Destination.AMERICA, 1000000, false, false);
        assertEquals(false, FareRecommendationSystem.isHighIncomeAdult(p10));

        AirlineCustomer p11 = new AirlineCustomer(21, 0, null, TravelClass.ECONOMY, Destination.ASIA, 35000, false, false);
        assertEquals(false, FareRecommendationSystem.isHighIncomeAdult(p11));

        AirlineCustomer p12 = new AirlineCustomer(21, 5, null, TravelClass.ECONOMY, Destination.EUROPE, 1000000, false, false);
        assertEquals(false, FareRecommendationSystem.isHighIncomeAdult(p12));

        AirlineCustomer p13 = new AirlineCustomer(25, 19, null, TravelClass.ECONOMY, Destination.ASIA, 0, false, false);
        assertEquals(false, FareRecommendationSystem.isHighIncomeAdult(p13));

        AirlineCustomer p14 = new AirlineCustomer(25, 6, null, TravelClass.ECONOMY, Destination.EUROPE, 30000, false, false);
        assertEquals(false, FareRecommendationSystem.isHighIncomeAdult(p14));

        AirlineCustomer p15 = new AirlineCustomer(30, 5, null, TravelClass.ECONOMY, Destination.OTHER, 0, false, false);
        assertEquals(false, FareRecommendationSystem.isHighIncomeAdult(p15));

        AirlineCustomer p16 = new AirlineCustomer(30, 0, null, TravelClass.ECONOMY, Destination.AMERICA, 30000, false, false);
        assertEquals(false, FareRecommendationSystem.isHighIncomeAdult(p16));

        AirlineCustomer m1 = new AirlineCustomer(40, 6, null, TravelClass.BUSINESS, Destination.ASIA, 50000, false, false);
        assertEquals(true, FareRecommendationSystem.isHighIncomeAdult(m1));

        AirlineCustomer m2 = new AirlineCustomer(25, 6, null, TravelClass.BUSINESS, Destination.ASIA, 50000, false, false);
        assertEquals(false, FareRecommendationSystem.isHighIncomeAdult(m2));

        AirlineCustomer m3 = new AirlineCustomer(40, 6, null, TravelClass.BUSINESS, Destination.ASIA, 34000, false, false);
        assertEquals(false, FareRecommendationSystem.isHighIncomeAdult(m3));

        AirlineCustomer m4 = new AirlineCustomer(40, 6, null, TravelClass.ECONOMY, Destination.ASIA, 50000, false, false);
        assertEquals(false, FareRecommendationSystem.isHighIncomeAdult(m4));

        AirlineCustomer m5 = new AirlineCustomer(40, 5, null, TravelClass.BUSINESS, Destination.ASIA, 50000, false, false);
        assertEquals(false, FareRecommendationSystem.isHighIncomeAdult(m5));

        AirlineCustomer m6 = new AirlineCustomer(40, 6, null, TravelClass.BUSINESS, Destination.EUROPE, 50000, false, false);
        assertEquals(false, FareRecommendationSystem.isHighIncomeAdult(m6));
    }

    @Test
    public void getFareTest() {

        AirlineCustomer g1 = new AirlineCustomer(15, 6, null, TravelClass.ECONOMY, null, 0, false, false);
        assertEquals("Pajarillo", FareRecommendationSystem.getFare(g1).getName());
        assertEquals(10, FareRecommendationSystem.getFare(g1).getDiscount());

        AirlineCustomer g2 = new AirlineCustomer(20, 9, TravelerType.STUDENT, TravelClass.ECONOMY, null, 0, false, true);
        assertEquals("Gorrión", FareRecommendationSystem.getFare(g2).getName());
        assertEquals(15, FareRecommendationSystem.getFare(g2).getDiscount());

        AirlineCustomer g3 = new AirlineCustomer(23, 3, TravelerType.WORKER, TravelClass.ECONOMY, null, 0, false, true);
        assertEquals("Travel While You Can", FareRecommendationSystem.getFare(g3).getName());
        assertEquals(5, FareRecommendationSystem.getFare(g3).getDiscount());

        AirlineCustomer g4 = new AirlineCustomer(23, 3, TravelerType.WORKER, TravelClass.ECONOMY, null, 0, false, false);
        assertEquals("Daring to Leave the Nest", FareRecommendationSystem.getFare(g4).getName());
        assertEquals(25, FareRecommendationSystem.getFare(g4).getDiscount());

        AirlineCustomer g5 = new AirlineCustomer(35, 6, null, TravelClass.ECONOMY, Destination.EUROPE, 25000, true, false);
        assertEquals("Discover Europe with Your Little Ones", FareRecommendationSystem.getFare(g5).getName());
        assertEquals(10, FareRecommendationSystem.getFare(g5).getDiscount());

        AirlineCustomer g6 = new AirlineCustomer(35, 6, null, TravelClass.ECONOMY, Destination.EUROPE, 25000, false, false);
        assertEquals("Discover Europe", FareRecommendationSystem.getFare(g6).getName());
        assertEquals(15, FareRecommendationSystem.getFare(g6).getDiscount());

        AirlineCustomer g7 = new AirlineCustomer(40, 6, null, TravelClass.BUSINESS, Destination.AMERICA, 35000, true, false);
        assertEquals("Discover the World with Your Little Ones", FareRecommendationSystem.getFare(g7).getName());
        assertEquals(10, FareRecommendationSystem.getFare(g7).getDiscount());

        AirlineCustomer g8 = new AirlineCustomer(40, 6, null, TravelClass.BUSINESS, Destination.AMERICA, 35000, false, false);
        assertEquals("Discover the World", FareRecommendationSystem.getFare(g8).getName());
        assertEquals(20, FareRecommendationSystem.getFare(g8).getDiscount());

        AirlineCustomer g9 = new AirlineCustomer(40, 1, null, TravelClass.BUSINESS, Destination.AMERICA, 35000, false, false);
        assertEquals(null, FareRecommendationSystem.getFare(g9));

    }

}
