public class NoDiscount extends Discount {

    @Override
    public double calculateDiscount(double price) {
        return 0;
    }

    @Override
    public DiscountType getDiscountType() {
        return DiscountType.NONE;
    }
}
