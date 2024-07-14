
public class GiftCardItem extends Item {
    public GiftCardItem(String name, double amount, int quantity, DiscountType discountType, double discountAmount){
        super(name, amount, quantity, DiscountType.NONE, 0);
    }

}
