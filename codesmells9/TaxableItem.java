
public class TaxableItem extends Item {
    private double taxRate = 7;
    
    public TaxableItem(String name, double price, int quantity, Discount discount, boolean giftCard){
        super(name, price, quantity, discount, giftCard);
    }

    public double getTaxRate(){
        return taxRate;
    }
    public void setTaxRate(double rate) {
        if(rate>=0){
            taxRate = rate;
        }
    }

    @Override
    public double calculateTax() {
        return price * (taxRate / 100.0);
    }
}
