public class Customer {
    private String customerName;
    private String customerEmail;
    private boolean giftcard;

    public Customer(String name, String email, boolean hasGiftcard) {
        this.customerName = name;
        this.customerEmail = email;
        this.giftcard = hasGiftcard;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public boolean hasGiftCard() {
        return giftcard;
    }

    public void setGiftcard(boolean hasGiftCard) {
        this.giftcard = hasGiftCard;
    }
}
