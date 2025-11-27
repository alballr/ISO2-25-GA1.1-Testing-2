public class FareRecommendationSystem {
    
    public static TypeFare determineFareType(AirlineCustomer customer) {
        int age = customer.getAge();
        int travelFrequency = customer.getTravelFrequency();
        String travelerType = customer.getTravelerType();
        String preferredClass = customer.getPreferredClass();
        String preferredDestination = customer.getPreferredDestination();
        double financialMeans = customer.getFinancialMeans();
        boolean travelWithChildren = customer.isTravelWithChildren();
        
        // Minor with 6+ flights per year
        if (age < 18 && travelFrequency >= 6) {
            return new TypeFare("Pajarillo", 10);
        }
        
        // Student 18-25 years old
        if (age >= 18 && age <= 25 && "student".equals(travelerType) && 
            "economy".equals(preferredClass) && travelFrequency >= 9) {
            return new TypeFare("Gorrión", 15);
        }
        
        // Working young adult 18-25 years old
        if (age >= 18 && age <= 25 && "working".equals(travelerType) && 
            "economy".equals(preferredClass) && travelFrequency >= 3) {
            if ("parents".equals(preferredDestination)) {
                return new TypeFare("Travel While You Can", 5);
            } else {
                return new TypeFare("Daring to Leave the Nest", 25);
            }
        }
        
        // Adult 25+ with income €20k-€35k
        if (age > 25 && financialMeans >= 20000 && financialMeans < 35000 && 
            "economy".equals(preferredClass) && travelFrequency >= 6 && 
            "Europe".equals(preferredDestination)) {
            if (travelWithChildren) {
                return new TypeFare("Discover Europe with Your Little Ones", 10);
            }
            return new TypeFare("Discover Europe", 15);
        }
        
        // Adult 25+ with income above €35k
        if (age > 25 && financialMeans >= 35000 && 
            "business".equals(preferredClass) && travelFrequency >= 6 && 
            ("Asia".equals(preferredDestination) || "America".equals(preferredDestination))) {
            if (travelWithChildren) {
                return new TypeFare("Discover the World with Your Little Ones", 10);
            }
            return new TypeFare("Discover the World", 20);
        }
        
        return null; // No suitable fare found
    }
}

public class TypeFare {
    private String fareName;
    private double discount;
    
    public TypeFare(String fareName, double discount) {
        this.fareName = fareName;
        this.discount = discount;
    }
    
    public double getDiscountedPrice(double basePrice) {
        return basePrice * (1 - discount / 100);
    }
    
    public String getFareName() {
        return fareName;
    }
    
    public double getDiscount() {
        return discount;
    }
}

public class AirlineCustomer {
    public int age;
    public int travelFrequency;
    public String travelerType;
    public String preferredClass;
    public String preferredDestination;
    public double financialMeans;
    public boolean travelWithChildren;
    
    // Constructor, getters...
    public int getAge() { return age; }
    public int getTravelFrequency() { return travelFrequency; }
    public String getTravelerType() { return travelerType; }
    public String getPreferredClass() { return preferredClass; }
    public String getPreferredDestination() { return preferredDestination; }
    public double getFinancialMeans() { return financialMeans; }
    public boolean isTravelWithChildren() { return travelWithChildren; }
}
public class testing2 {
    public static void main(String[] args) {
        AirlineCustomer customer = new AirlineCustomer();
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter age: ");
        customer.age = scanner.nextInt();
        
        System.out.print("Enter travel frequency (flights per year): ");
        customer.travelFrequency = scanner.nextInt();
        
        System.out.print("Enter traveler type (student/working): ");
        customer.travelerType = scanner.next();
        
        System.out.print("Enter preferred class (economy/business): ");
        customer.preferredClass = scanner.next();
        
        System.out.print("Enter preferred destination (Europe/Asia/America): ");
        customer.preferredDestination = scanner.next();
        
        System.out.print("Enter financial means (€): ");
        customer.financialMeans = scanner.nextDouble();
        
        System.out.print("Travel with children? (true/false): ");
        customer.travelWithChildren = scanner.nextBoolean();
        
        scanner.close();
        TypeFare fare = FareRecommendationSystem.determineFareType(customer);
        if (fare != null) {
            System.out.println("Recommended Fare: " + fare.getFareName());
            System.out.println("Discount: " + fare.getDiscount() + "%");
        } else {
            System.out.println("No suitable fare found.");
        }
    }

}
    
