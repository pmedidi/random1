// Added class
/* 
* (5) DATA CLUMPS
*/

public class Discount {
    
    private DiscountType type;
    private double amount;

    public Discount(DiscountType type, double amount) {
        this.type = type;
        this.amount = amount;
    }

    public DiscountType getDiscountType() {
        return type;
    }

    public double getDiscountAmount() {
        return amount;
    }
}