
public class TaxableItem extends Item {
    private double taxRate = 7;
    
    public TaxableItem(String name, double price, int quantity, DiscountType discountType, double discountAmount, boolean isGiftCard){
        super(name, price, quantity, discountType, discountAmount, isGiftCard);
    }

    public void setTaxRate(double rate) {
        if(rate>=0){
            taxRate = rate;
        }
    }

    public double getTax() {
        return taxRate / 100 * getPrice();
    }
}
