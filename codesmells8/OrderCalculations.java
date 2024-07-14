// Added class
/* 
* (1) LARGE CLASS AND (2) LONG METHOD
*/
import java.util.List;

public class OrderCalculations {
    public static double calculateTotalPrice(List<Item> items, boolean hasGiftCard) {
        double total = 0.0;
        for (Item item : items) {
            double itemTotal = calculateItemTotal(item);
            total += itemTotal;
        }
        if (hasGiftCard) {
            total -= 10.0;
        }
        if (total > 100.0) {
            total *= 0.9;
        }
        return total;
    }

    private static double calculateItemTotal(Item item) {
        double totalPrice = item.calculatePrice() * item.getQuantity();
        return totalPrice;
    }
}
