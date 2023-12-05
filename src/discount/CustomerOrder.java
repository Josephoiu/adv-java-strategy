package discount;

public class CustomerOrder {

    private String customerName;
    private double billAmount;
    private char discountType;
    private DiscountStrategy discountStrategy;

    public CustomerOrder(String customerName, double billAmount, char discountType) {
        this.customerName = customerName;
        this.billAmount = billAmount;
        this.discountType = discountType;
    }

    public double getBillAmount() {
        double tempBill;
        switch (discountType) {
            case 'S':
            case 's':
                setDiscountStrategy(new DiscountTypeS());
                tempBill = discountStrategy.discount(billAmount);
                break;
            case 'D':
            case 'd':
                setDiscountStrategy(new DiscountTypeD());
                tempBill = discountStrategy.discount(billAmount);
                break;
            case 'L':
            case 'l':
                setDiscountStrategy(new DiscountTypeL());
                tempBill = discountStrategy.discount(billAmount);
                break;
            default:
                tempBill = billAmount;
        }
        return tempBill;
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setDiscountStrategy(DiscountStrategy strategy) {
        this.discountStrategy = strategy;
    }

    @Override
    public String toString() {
        return "Customer{"
                + "customerName='" + customerName + '\''
                + ", billAmount=" + billAmount
                + ", discountType=" + discountType
                + '}';
    }
}
