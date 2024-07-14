class Item {
    private String name;
    protected double price;
    private int quantity;
    private boolean isGiftCard;

    public Item(String name, double price, int quantity, boolean isGiftCard) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.isGiftCard = isGiftCard;
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

    public boolean getIsGiftCard() {
        return isGiftCard;
    }
}
