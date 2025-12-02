public class FareRecommendationSystem {
    
    public static TypeFare getFare(AirlineCustomer c) {
        
        // Rule 1: Minor with 6+ flights/year
        if (c.getAge() < 18 && c.getFlightsPerYear() >= 6) {
            return new TypeFare("Pajarillo", 10);
        }
        
        // Rule 2: Student 18-25, economy, 9+ flights
        if (isStudent(c)) {
            return new TypeFare("Gorrión", 15);
        }
        
        // Rule 3: Young worker 18-25
        if (isYoungWorker(c)) {
            if (c.isLivesWithParents()) {
                return new TypeFare("Travel While You Can", 5);
            } else {
                return new TypeFare("Daring to Leave the Nest", 25);
            }
        }
        
        // Rule 4: Adult >25, income 20k-35k, economy, Europe
        if (isMidIncomeAdult(c)) {
            if (c.isTravelWithChildren()) {
                return new TypeFare("Discover Europe with Your Little Ones", 10);
            } else {
                return new TypeFare("Discover Europe", 15);
            }
        }
        
        // Rule 5: Adult >25, income >35k, business, Asia/America
        if (isHighIncomeAdult(c)) {
            if (c.isTravelWithChildren()) {
                return new TypeFare("Discover the World with Your Little Ones", 10);
            } else {
                return new TypeFare("Discover the World", 20);
            }
        }
        
        return null;
    }
    
    // Helper methods for testing
    
    public static boolean isStudent(AirlineCustomer c) {
        return c.getAge() >= 18 && c.getAge() <= 25 
            && c.getTravelerType() == TravelerType.STUDENT
            && c.getTravelClass() == TravelClass.ECONOMY 
            && c.getFlightsPerYear() >= 9;
    }
    
    public static boolean isYoungWorker(AirlineCustomer c) {
        return c.getAge() >= 18 && c.getAge() <= 25 
            && c.getTravelerType() == TravelerType.WORKER
            && c.getTravelClass() == TravelClass.ECONOMY 
            && c.getFlightsPerYear() >= 3;
    }
    
    public static boolean isMidIncomeAdult(AirlineCustomer c) {
        return c.getAge() > 25 
            && c.getIncome() >= 20000 && c.getIncome() < 35000 
            && c.getTravelClass() == TravelClass.ECONOMY 
            && c.getFlightsPerYear() >= 6 
            && c.getDestination() == Destination.EUROPE;
    }
    
    public static boolean isHighIncomeAdult(AirlineCustomer c) {
        return c.getAge() > 25 
            && c.getIncome() >= 35000 
            && c.getTravelClass() == TravelClass.BUSINESS 
            && c.getFlightsPerYear() >= 6 
            && (c.getDestination() == Destination.ASIA 
                || c.getDestination() == Destination.AMERICA);
    }
}