import java.util.ArrayList;
import java.util.List;

public class main {
	public static void main(String[] args) {
       	Item item1 = new AmountDiscountItem("Book", 20, 1, false, 5);
        Item item = new PercentageDiscountItem("Laptop", 1000, 1, false, 0.1);
        Item item2 = new TaxableItem(item);
        Item item3 = new Item("Gift Card", 10, 1, true);
        
	List<Item> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);
        items.add(item3);

        Order order = new Order(items, "John Doe", "johndoe@example.com");

        System.out.println("Total Price: " + order.calculateTotalPrice());

        order.sendConfirmationEmail();

        order.printOrder();
    }
}

