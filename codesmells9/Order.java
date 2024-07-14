import java.util.List;

public class Order {
    private List<Item> items;
    private Customer customer;

    public Order(List<Item> items, Customer customer) {
        this.items = items;
        this.customer = customer;
    }


    public double calculateTotalPrice() {
        double total = 0.0;
        for (Item item : items) {
            double itemPrice = item.calculateDiscountedPrice();
            total += itemPrice * item.getQuantity();
            total += item.calculateTax();
        }
        if (customer.hasGiftCard()) {
            total -= 10.0; // subtract $10 for gift card
        }
        if (total > 100.0) {
            total *= 0.9; // apply 10% discount for orders over $100
        }
        return total;
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

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
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

