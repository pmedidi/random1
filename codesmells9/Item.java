class Item {
    private String name;
    protected double price;
    private int quantity;
    private Discount discount;
    private boolean giftCard;

    public Item(String name, double price, int quantity, Discount discount, boolean giftCard) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.discount = discount;
        this.giftCard = giftCard;
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

    public Discount getDiscount() {
        return discount;
    }

    public boolean getGiftCard() {
        return giftCard;
    }


    public double calculateDiscountedPrice() {
        return price - discount.calculateDiscount(price);
    }


    public double calculateTax() {
        return 0;
    }
}
