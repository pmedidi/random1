public class TaxableItem extends Item {
    private double taxRate = 7;
    
    public TaxableItem(String name, double price, int quantity, DiscountType discountType, double discountAmount){
        super(name, price, quantity, discountType, discountAmount);
    }

    // Added method
    /* 
     * (3) SWITCH STATEMENTS
     */
    public double calculatePrice() {
        double priceBeforeTax = super.getPrice();
        double priceIncludingTax = super.getPrice() + calculateTax();

        if (super.getDiscount().getDiscountType() == DiscountType.PERCENTAGE) {
            priceIncludingTax -= super.getDiscount().getDiscountAmount() * priceBeforeTax;
        } else if (super.getDiscount().getDiscountType() == DiscountType.AMOUNT) {
            priceIncludingTax -= super.getDiscount().getDiscountAmount();
        }
        
        return priceIncludingTax;
    }

    public double calculateTax() {
        return taxRate / 100.0 * super.getPrice();
    }

    // Existing methods
    public double getTaxRate(){
        return taxRate;
    }
    public void setTaxRate(double rate) {
        if(rate>=0){
            taxRate = rate;
        }
    }

    // Added method
    /* 
     * (6) INAPPROPRIATE INTIMACY
     */
    public double getPriceWithTax() {
        return getPrice() + calculateTax();
    }
}
