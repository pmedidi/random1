import java.util.List;
import java.util.ArrayList;

public class Order {
    private List<Item> items;
    private Customer customer;
  
    public Order(List<Item> items, Customer customer) {
        this.items = items;
        this.customer = customer;
    }
  
    public void sendConfirmationEmail() {
      String message = "Thank you for your order, " + customer.getName() + "!\n\n" +
              "Your order details:\n";
      for (Item item : items) {
          message += item + "\n";
      }
      message += "Total: " + calculateTotalPrice();
      EmailSender.sendEmail(new Email(customer.getEmail(), "Order Confirmation", message));
  }
  
    public double calculateTotalPrice() {
        return OrderCalculator.calculateTotalPrice(items, hasGiftCard());
    }
  
    public void addItem(Item item) {
      items.add(item);
    }
  
    public void removeItem(Item item) {
        items.remove(item);
    }
  
    public List<Item> getItems() {
      return new ArrayList<>(items); 
    }
  
    public void setCustomer(Customer customer) {
      this.customer = customer;
    }
  
    public Customer getCustomer() {
      return customer;
    }
  
    public boolean hasGiftCard() {
      for (Item item : items) {
        if (item.getHasGiftCard()) {
            return true;
        }
      }
      return false;
    }
  
    public void printOrder() {
        System.out.println("Order Details:");
        for (Item item : items) {
          System.out.println(item);
        }
    }
  
      public void addItemsFromAnotherOrder(Order otherOrder) {
         for (Item item : otherOrder.getItems()) {
           items.add(item);
         }
      }
  }

