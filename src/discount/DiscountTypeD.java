package discount;

public class DiscountTypeD implements DiscountStrategy{
    @Override
    public double discount(double billAmount) {
        double discount = 0.1;
        return billAmount - (billAmount * discount);
    }
}
