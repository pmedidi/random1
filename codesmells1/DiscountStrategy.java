/**
 * This is the implementation that can decide which discount to use
 * depending on which type. Instead of the switch statements, the abstract
 * DiscountStrategy class can handle the three possible types:
 * Percentage
 * Amount
 * Default (no discount)
 */
abstract class DiscountStrategy {
    public double applyDiscount(double price, double discountAmount) {
        return 0;
    }
}

class PercentStrategy extends DiscountStrategy {
    @Override
    public double applyDiscount(double price, double percentage) {
        return price * (1 - percentage);
    }
}

class AmountStrategy extends DiscountStrategy {
    @Override
    public double applyDiscount(double price, double amount) {
        return price - amount;
    }
}

class Default extends DiscountStrategy {
    @Override
    public double applyDiscount(double price, double amount) {
        return price;
    }
}