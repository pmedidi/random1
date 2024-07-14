class Item {
    private String name;
    protected double price;
    private int quantity;
    private Discount discount;

    // Updated constructors
    public Item(String name, double price, int quantity, Discount discount) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.discount = discount;
    }

    public Item(String name, double price, int quantity, DiscountType discountType, double discountAmount) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.discount = new Discount(discountType, discountAmount);
    }

    // Added method
    public double calculatePrice() {
        double priceBeforeDiscount = this.price;
        double finalPrice = priceBeforeDiscount;
        if (discount.getDiscountType() == DiscountType.PERCENTAGE) {
            finalPrice -= discount.getDiscountAmount() * finalPrice;
        } else if (discount.getDiscountType() == DiscountType.AMOUNT) {
            finalPrice -= discount.getDiscountAmount();
        }

        return finalPrice;
    }

    // Existing methods
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public Discount getDiscount() {
        return discount;
    }

    public DiscountType getDiscountType() {
        return this.discount.getDiscountType();
    }

    // Add this method
    public double getDiscountAmount() {
        return this.discount.getDiscountAmount();
    }
}
