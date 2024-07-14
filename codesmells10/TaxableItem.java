
public class TaxableItem extends Item {
    private double taxRate = 7;
    
    public TaxableItem(String name, double price, int quantity, DiscountType discountType, double discountAmount, boolean hasGiftCard){
        super(name, price, quantity, discountType, discountAmount, hasGiftCard);
    }

    // new method
    @Override
    public double calculateTax() {
        double tax = 0.0;
        if (this instanceof TaxableItem) {
            TaxableItem taxableItem = (TaxableItem) this;
            tax = taxableItem.getTaxRate() / 100.0 * this.getPrice();
        }
        
        return tax;
    }

    public double getTaxRate(){
        return taxRate;
    }
    public void setTaxRate(double rate) {
        if(rate>=0){
            taxRate = rate;
        }
    }
}
