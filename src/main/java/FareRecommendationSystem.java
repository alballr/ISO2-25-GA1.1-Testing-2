public class FareRecommendationSystem {
    
    public static TypeFare getFare(AirlineCustomer c) {
        TypeFare fare = null;
        if (c.getAge() < 18 && c.getFlightsPerYear() >= 6) {
            fare = new TypeFare("Pajarillo", 10);
        }
        
        if (isStudent(c)) {
            fare = new TypeFare("Gorrión", 15);
        }
        
        if (isYoungWorker(c)) {
            if (c.isLivesWithParents()) {
                fare = new TypeFare("Travel While You Can", 5);
            } else {
                fare = new TypeFare("Daring to Leave the Nest", 25);
            }
        }
        
        if (isMidIncomeAdult(c)) {
            if (c.isTravelWithChildren()) {
                fare = new TypeFare("Discover Europe with Your Little Ones", 10);
            } else {
                fare = new TypeFare("Discover Europe", 15);
            }
        }
        
        if (isHighIncomeAdult(c)) {
            if (c.isTravelWithChildren()) {
                fare = new TypeFare("Discover the World with Your Little Ones", 10);
            } else {
                fare = new TypeFare("Discover the World", 20);
            }
        }
        
        return fare;
    }
    
    
    public static boolean isStudent(AirlineCustomer c) {
    	boolean result = false;
    	if(c.getAge() >= 18 && c.getAge() <= 25 
                && c.getTravelerType() == TravelerType.STUDENT
                && c.getTravelClass() == TravelClass.ECONOMY 
                && c.getFlightsPerYear() >= 9) {
    		result = true;
    	}
        return result;
    }
    
    public static boolean isYoungWorker(AirlineCustomer c) {
    	boolean result = false;
    	if(c.getAge() >= 18 && c.getAge() <= 25 
                && c.getTravelerType() == TravelerType.WORKER
                && c.getTravelClass() == TravelClass.ECONOMY 
                && c.getFlightsPerYear() >= 3) {
    		result = true;
    	}
        return result;
        
    }
    
    public static boolean isMidIncomeAdult(AirlineCustomer c) {
    	boolean result = false;
    	if(c.getAge() > 25 
                && c.getIncome() >= 20000 && c.getIncome() < 35000 
                && c.getTravelClass() == TravelClass.ECONOMY 
                && c.getFlightsPerYear() >= 6 
                && c.getDestination() == Destination.EUROPE) {
    		result = true;
    	}
        return result;
    }
    
    public static boolean isHighIncomeAdult(AirlineCustomer c) {
    	boolean result = false;
    	if(c.getAge() > 25 
                && c.getIncome() >= 35000 
                && c.getTravelClass() == TravelClass.BUSINESS 
                && c.getFlightsPerYear() >= 6 
                && (c.getDestination() == Destination.ASIA 
                    || c.getDestination() == Destination.AMERICA)) {
    		result = true;
    	}
        return result;
    }
}