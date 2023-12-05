package discount;

public class DiscountTypeL implements DiscountStrategy {
    @Override
    public double discount(double billAmount) {
        double discount = 0.75;
        return billAmount - (billAmount * discount);
    }
}
