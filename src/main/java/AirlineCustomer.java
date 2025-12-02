public class AirlineCustomer {
    private int age;
    private int flightsPerYear;
    private TravelerType travelerType;
    private TravelClass travelClass;
    private Destination destination;
    private double income;
    private boolean travelWithChildren;
    private boolean livesWithParents;
    
    public AirlineCustomer() {}
    
    public AirlineCustomer(int age, int flightsPerYear, TravelerType travelerType, 
                          TravelClass travelClass, Destination destination, 
                          double income, boolean travelWithChildren, boolean livesWithParents) {
        this.age = age;
        this.flightsPerYear = flightsPerYear;
        this.travelerType = travelerType;
        this.travelClass = travelClass;
        this.destination = destination;
        this.income = income;
        this.travelWithChildren = travelWithChildren;
        this.livesWithParents = livesWithParents;
    }
    
    // Getters and Setters
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    
    public int getFlightsPerYear() { return flightsPerYear; }
    public void setFlightsPerYear(int flightsPerYear) { this.flightsPerYear = flightsPerYear; }
    
    public TravelerType getTravelerType() { return travelerType; }
    public void setTravelerType(TravelerType travelerType) { this.travelerType = travelerType; }
    
    public TravelClass getTravelClass() { return travelClass; }
    public void setTravelClass(TravelClass travelClass) { this.travelClass = travelClass; }
    
    public Destination getDestination() { return destination; }
    public void setDestination(Destination destination) { this.destination = destination; }
    
    public double getIncome() { return income; }
    public void setIncome(double income) { this.income = income; }
    
    public boolean isTravelWithChildren() { return travelWithChildren; }
    public void setTravelWithChildren(boolean travelWithChildren) { this.travelWithChildren = travelWithChildren; }
    
    public boolean isLivesWithParents() { return livesWithParents; }
    public void setLivesWithParents(boolean livesWithParents) { this.livesWithParents = livesWithParents; }
}