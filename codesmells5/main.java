import java.util.ArrayList;
import java.util.List;

public class main {
	public static void main(String[] args) {
        Item item1 = new Item("Book", 20, 1, DiscountType.AMOUNT, 5, false);
        Item item2 = new TaxableItem("Laptop", 1000, 1, DiscountType.PERCENTAGE, 0.1);
        Item item3 = new Item("Gift Card", 10, 1, DiscountType.AMOUNT, 0, true);

        List<Item> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);
        items.add(item3);

        Customer customer = new Customer("John Doe", "johndoe@example.com");
        Order order = new Order(items, customer);

        System.out.println("Total Price: " + order.calculateTotalPrice());

        order.sendConfirmationEmail();

        order.printOrder();
    }
}

