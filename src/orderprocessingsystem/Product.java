
package orderprocessingsystem;

public class Product {
    private String productName;
    private int productQuantity=5;
    private double productPrice;
    private int productID;


    public Product(String productName, int quantity, double productPrice, int productID)
    {
        this.productName= productName;
        this.productQuantity= quantity;
        this.productPrice= productPrice;
        this.productID= productID;
    }
    
    public String getProductName()
    {
        return productName;
    }
    
    public void setProductName(String productName)
    {
        productName= productName;
    }
    
    public int getProductQuantity()
    {
        return productQuantity;
    }
    
    public void setproductQuantity(int productQuantity)
    {
        if (productQuantity > 0) 
        {
            quantity= productQuantity;
	}
        else {quantity= 0};
    }
    
    public double getProductPrice()
    {
        return productPrice;
    }
    
    public void setProductPrice()
    {
        productPrice= productPrice;
    }
    
    public int getProductID()
    {
        return productID;
    }
    
    public void setProductID()
    {
        productID= productID;
    }
}
