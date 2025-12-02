import es.uclm.esi.iso2.axx.command_Line_Interface.commandLine;
import es.uclm.esi.iso2.axx.command_Line_Interface.commandLineI;

public class testing2 {
    
    public static void main(String[] args) {
        commandLineI cli = new commandLine();
        AirlineCustomer customer = new AirlineCustomer();
        
        cli.printLine("=== AIRLINE FARE SYSTEM ===");
        
        try {
            cli.print("Age: ");
            customer.setAge(cli.readInt());
            
            cli.print("Flights per year: ");
            customer.setFlightsPerYear(cli.readInt());
            
            cli.print("Type (STUDENT/WORKER): ");
            String typeInput = cli.readString().toUpperCase();
            customer.setTravelerType(TravelerType.valueOf(typeInput));
            
            cli.print("Class (ECONOMY/BUSINESS): ");
            String classInput = cli.readString().toUpperCase();
            customer.setTravelClass(TravelClass.valueOf(classInput));
            
            cli.print("Destination (EUROPE/ASIA/AMERICA/OTHER): ");
            String destInput = cli.readString().toUpperCase();
            customer.setDestination(Destination.valueOf(destInput));
            
            cli.print("Annual income (€): ");
            customer.setIncome(cli.readDouble());
            
            cli.print("Travel with children? (true/false): ");
            customer.setTravelWithChildren(Boolean.parseBoolean(cli.readString()));
            
            cli.print("Lives with parents? (true/false): ");
            customer.setLivesWithParents(Boolean.parseBoolean(cli.readString()));
            
            TypeFare fare = FareRecommendationSystem.getFare(customer);
            
            cli.printLine("\n=== RESULT ===");
            if (fare != null) {
                cli.printLine("Fare: " + fare.getName());
                cli.printLine("Discount: " + fare.getDiscount() + "%");
            } else {
                cli.printLine("No fare available for this profile.");
            }
        } catch (IllegalArgumentException e) {
            cli.printLine("\nError: " + e.getMessage());
            cli.printLine("Please restart and enter valid values.");
        }
    }
}