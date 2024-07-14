public class OrderPriceCalculator {

    private Order order;

    public OrderPriceCalculator(Order order) {
        this.order = order;
    }

    public double getPrice() {
        double total = 0.0;
        for (Item item : order.getItems()) {
            double price = item.getPrice();
            price -= item.getDiscount().calculateDiscount(price);
            total += price * item.getQuantity();
            if (item instanceof TaxableItem) {
                TaxableItem taxableItem = (TaxableItem) item;
                double tax = taxableItem.getTaxRate() / 100.0 * item.getPrice();
                total += tax;
            }
        }
        if (order.getCustomer().hasGiftCard()) {
            total -= 10.0; // subtract $10 for gift card
        }
        if (total > 100.0) {
            total *= 0.9; // apply 10% discount for orders over $100
        }
        return total;
    }
}
