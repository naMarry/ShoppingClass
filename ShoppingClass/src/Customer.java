public class Customer implements DiscountRate {
    private String customerName;
    private String customerType;

    Customer(String customerName, String customerType){
        this.customerName = customerName;
        this.customerType = customerType;
    }
    public String getCustomerName(){
        return customerName;
    }
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    public String getCustomerType(){
        return customerType;
    }
    public void setCustomerType(String customerType){
        this.customerType = customerType;
    }

    @Override
    public double getServiceDiscountRate() {
        switch (customerType.toLowerCase()) {
            case "premium":
                return 0.20;
            case "gold":
                return 0.15;
            case "silver":
                return 0.10;
            default:
                return 0.0;
        }
    }


    @Override
    public double getProductDiscountRate() {
        switch (customerType.toLowerCase()) {
            case "premium":
            case "gold":
            case "silver":
                return 0.10;
            default:
                return 0.0;
        }
    }
}

