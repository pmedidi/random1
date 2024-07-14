public class PercentageDiscount extends Discount {
    private double percentage;

    public PercentageDiscount(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public double calculateDiscount(double price) {
        return price * percentage;
    }

    @Override
    public DiscountType getDiscountType() {
        return DiscountType.PERCENTAGE;
    }
}
