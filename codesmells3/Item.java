public class Item {
    private String name;
    private double price;
    private int quantity;
    private DiscountType discountType;
    private double discountAmount;
    private boolean hasGiftCard;

    public Item(String name, double price, int quantity, DiscountType discountType, double discountAmount, boolean hasGiftCard) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.discountType = discountType;
        this.discountAmount = discountAmount;
        this.hasGiftCard = hasGiftCard;
    }

    public String getName() {
        return name;
    }

    public double getDiscountedPrice() {
      switch (getDiscountType()) {
          case PERCENTAGE:
              return price - getDiscountAmount() * getPrice();
          case AMOUNT:
              return price - getDiscountAmount();
          default:
              return price;
      }
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

    public boolean getHasGiftCard() {
        return hasGiftCard;
    }

    public String toString() {
        return name + " - " + price;
    }
}
