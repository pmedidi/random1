import java.util.ArrayList;
import java.util.List;

public class main {
	public static void main(String[] args) {
        Item item1 = new Item("Book", 20, 1, new AmountDiscount(5), false);
        Item item2 = new TaxableItem("Laptop", 1000, 1, new PercentageDiscount(0.1), false);

        List<Item> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);
        EmailSender emailSender = new EmailSender();

        Customer customer = new Customer("John Doe", "johndoe@example.com", true);
        Order order = new Order(items, customer);
        OrderPriceCalculator orderPrice = new OrderPriceCalculator(order);

        System.out.println("Total Price: " + orderPrice.getPrice());

        emailSender.sendConfirmationEmail(items, customer.getCustomerName(), customer.getCustomerEmail(), orderPrice.getPrice());

        order.printOrder();
    }
}

