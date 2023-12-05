package discount;

public interface DiscountStrategy {
    /**
     * Receives an initial bill amount,
     * returns the newly calculated bill
     * amount with the rightful discount.
     * @param billAmount Initial bill amount.
     * @return Newly calculated bill amount with the rightful discount.
     */    double discount(double billAmount);
}
