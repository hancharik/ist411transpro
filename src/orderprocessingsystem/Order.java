
package orderprocessingsystem;

public class Order extends Transaction {
    
    private int orderID;
    private int customerID;
    private int orderTotal;
    
    public Order (int orderID, int customerID, int orderTotal)
    {
        this.orderID= orderID;
        this.customerID= customerID;
        this.orderTotal= orderTotal;
        
    }
    
    
    
}
