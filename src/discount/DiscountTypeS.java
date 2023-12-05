package discount;

public class DiscountTypeS implements DiscountStrategy{
    @Override
    public double discount(double billAmount) {
        double discount = 0.5;
        return billAmount - (billAmount * discount);
    }
}
