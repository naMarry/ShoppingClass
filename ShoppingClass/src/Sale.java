public class Sale {
    Customer customer;
    private String date;
    private double serviceExpense;
    private double productExpense;
    public Sale(Customer customer, String date){
        this.customer = customer;
        this.date = date;
    }

    public String getDate(){
        return date;
    }
    public void setServiceExpense(double serviceExpense){
        this.serviceExpense = serviceExpense;
    }
    public void setProductExpense(double productExpense){
        this.productExpense = productExpense;
    }
    public double getServiceExpense(){
        return serviceExpense;
    }
    public double getProductExpense(){
        return productExpense;
    }
    public double getTotalExpense(){
        double total = productExpense + serviceExpense;
        total -= total * customer.getProductDiscountRate();
        total -= serviceExpense * customer.getServiceDiscountRate();
        return total;
    }
    public void displayInfo(){
        System.out.println("Service: " + getServiceExpense() + " Product: " + getProductExpense() + " Total: " + getTotalExpense());
    }

}
