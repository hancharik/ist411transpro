
package orderprocessingsystem;


public class InventoryItems {
  int inventorySize = 30;
    private Product items[] = new Product[inventorySize];

    public void addProduct(inventorystore.Product item) 
    {
            for (int i= 0; i < inventorySize; i++) 
            {
                if (items[i] == null) 
                {
                items[i]= item;
                return;
                }
            }
    }   
    
    public double getTotalInventoryValue() 
    {
        double sumOfInventory = 0;
            for (int i= 0; i < items; i++) 
            {
		if (items != null) 
                {
                    sumOfInventory += items.getItemValue();
		}
            }
		return sumOfInventory;
    }
}
