class PercentageDiscountItem extends Item {
    private double percentageDiscount;

    public PercentageDiscountItem(String name, double price, int quantity, boolean isGiftCard, double percentageDiscount) {
        super(name, price, quantity, isGiftCard);
        this.percentageDiscount = percentageDiscount;
    }

    @Override
    public double getPrice() {
        return price * (1 - percentageDiscount);
    }
}