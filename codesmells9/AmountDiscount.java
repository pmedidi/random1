public class AmountDiscount extends Discount {
    private double amount;

    public AmountDiscount(double amount) {
        this.amount = amount;
    }

    @Override
    public double calculateDiscount(double price) {
        return amount;
    }

    @Override
    public DiscountType getDiscountType() {
        return DiscountType.AMOUNT;
    }
}
