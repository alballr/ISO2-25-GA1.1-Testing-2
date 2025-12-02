public class TypeFare {
    private String name;
    private int discount;
    
    public TypeFare(String name, int discount) {
        this.name = name;
        this.discount = discount;
    }
    
    public String getName() {
        return name;
    }
    
    public int getDiscount() {
        return discount;
    }
}