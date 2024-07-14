import java.util.List;

public class OrderCalculator {
    public static double calculateTotalPrice(List<Item> items, boolean hasGiftCard) {
        double total = calculateSubtotal(items);
        total += calculateTax(items);
        total -= calculateGiftCardDiscount(total, hasGiftCard);
        total -= calculateDiscount(total);
        return total;
    }

    private static double calculateSubtotal(List<Item> items) {
        double subtotal = 0.0;
        for (Item item : items) {
            double price = item.getDiscountedPrice();
            subtotal += price * item.getQuantity();
        }
        return subtotal;
    }

    private static double calculateTax(List<Item> items) {
        double tax = 0.0;
        for (Item item : items) {
            if (item instanceof TaxableItem) {
                TaxableItem taxableItem = (TaxableItem) item;
                tax += taxableItem.getTaxRate() / 100.0 * item.getPrice();
            }
        }
        return tax;
    }

    private static double calculateGiftCardDiscount(double subtotal, boolean hasGiftCard) {
        if (hasGiftCard) {
            return 10.0;
        }
        return 0.0;
    }

    private static double calculateDiscount(double subtotal) {
        if (subtotal > 100.0) {
            return subtotal * 0.1;
        }
        return 0.0;
    }
}