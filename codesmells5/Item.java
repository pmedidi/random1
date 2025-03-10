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

    public boolean isGiftCard() {
        return isGiftCard;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getPriceForOrder() {
        switch (discountType) {
            case PERCENTAGE:
                return price - discountAmount * price;
            case AMOUNT:
                return price - discountAmount;
            default:
                return price;
        }
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
}
