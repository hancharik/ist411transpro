
package orderprocessingsystem;


public class Customer {
    
    private int CustomerID;
    private String name;
    private String address;
    private int phoneNumber;
   
    public Customer (int CustomerID, String name, String address, int phoneNumber)
    {
        this.CustomerID= CustomerID;
        this.name= name;
        this.phoneNumber= phoneNumber;
        this.address= address;      
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
        name= name;
    }
    
    public String getAddress()
    {
        return address;
    }
    
    public void setAddress(String address)
    {
        address= address;
    }
    
    public int getPhoneNumber()
    {
        return phoneNumber;
    }
    
    public void setPhoneNumber(int phoneNumber)
    {
        phoneNumber= phoneNumber;
    }
    
   

}

