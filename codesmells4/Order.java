import java.util.List;

public class Order {
    private List<Item> items;
    private Customer customer; //Add new class Customer
    private final double GIFT_CARD_DEDUCTABLE = 10.0;
    private final double ORDER_DISCOUNT = 0.9;
    private final double DISCOUNT_REQUIREMENT = 100;

    public Order(List<Item> items, Customer customer) {
        this.items = items;
        this.customer = customer;
    }

    public double calculateTotalPrice() {
    	double total = 0.0;
    	for (Item item : items) {
            double price = calculateDiscountPrice(item);
        	total += price * item.getQuantity();
       	    if (item instanceof TaxableItem) {
                TaxableItem taxableItem = (TaxableItem) item;
                double tax = taxableItem.getTaxRate() / 100.0 * item.getPrice();
                total += tax;
            }
            if (item.getName().equals("Gift Card")) {
                total -= GIFT_CARD_DEDUCTABLE;
            }
        }
        if (total > DISCOUNT_REQUIREMENT) {
            total *= ORDER_DISCOUNT;    	
        }
    	return total;
    }
    
    private double calculateDiscountPrice(Item item) {
        double price = item.getPrice();
        switch (item.getDiscountType()) {
            case PERCENTAGE:
                price -= item.getDiscountAmount() * price;
                break;
            case AMOUNT:
                price -= item.getDiscountAmount();
                break;
            default:
                // no discount
                break;
        }
        return price;
    }

    public void sendConfirmationEmail() {
        String message = "Thank you for your order, " + customer.getCustomerName() + "!\n\n" +
                "Your order details:\n";
        for (Item item : items) {
            message += item.getName() + " - " + item.getPrice() + "\n";
        }
        message += "Total: " + calculateTotalPrice();
        sendEmail(customer.getCustomerEmail(), "Order Confirmation", message); //call method in Order instead of EmailSender
    }

    //Incorporated method from EmailSender into Order
    public static void sendEmail(String customerEmail, String subject, String message){
        System.out.println("Email to: " + customerEmail);
        System.out.println("Subject: " + subject);
        System.out.println("Body: " + message);
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

   public void printOrder() {
        System.out.println("Order Details:");
        for (Item item : items) {
            System.out.println(item.getName() + " - " + item.getPrice());
        }
   }

   public void addItemsFromAnotherOrder(Order otherOrder) {
        for (Item item : otherOrder.getItems()) {
            items.add(item);
        }
   }

}
