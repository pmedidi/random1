class AmountDiscountItem extends Item {
    private double amountDiscount;

    public AmountDiscountItem(String name, double price, int quantity, boolean isGiftCard, double percentageDiscount) {
        super(name, price, quantity, isGiftCard);
        this.amountDiscount = percentageDiscount;
    }

    @Override
    public double getPrice() {
        return Math.max(0, price - amountDiscount);
    }  
}
