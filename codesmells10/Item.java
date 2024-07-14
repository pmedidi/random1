class Item {
    private String name;
    private double price;
    private int quantity;
    private DiscountType discountType;
    private double discountAmount;
    private boolean isGiftCard;

    public Item(String name, double price, int quantity, DiscountType discountType, double discountAmount, boolean isGiftCard) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.discountType = discountType;
        this.discountAmount = discountAmount;
        this.isGiftCard = isGiftCard;
    }

    // new method
    public double calculateDiscountedPrice() {
        double tempDiscount = 0.0;
        if (discountType == DiscountType.PERCENTAGE) {
            tempDiscount = discountAmount * price;
        } else if (discountType == DiscountType.AMOUNT) {
            tempDiscount = discountAmount;
        }
        double finalPrice = price - tempDiscount;
        return finalPrice;
    }

    public double calculateTax() {
        return 0.0;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public DiscountType getDiscountType() {
        return discountType;
    }

    public double getDiscountAmount() {
        return discountAmount;
    }

    public boolean getIsGiftCard() {
        return isGiftCard;
    }
}
