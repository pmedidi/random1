
public class TaxableItem extends Item {
    private double taxRate = 7;
    
    public TaxableItem(Item item){
      super(item.getName(), item.getPrice(), item.getQuantity(),
                item.getIsGiftCard());
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
