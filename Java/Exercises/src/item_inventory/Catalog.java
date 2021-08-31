package item_inventory;

public class Catalog{
    private Item[] list;
    private int size;

    // Construct an empty catalog with the specified capacity.
    public Catalog(int capacity){
        list = new Item[capacity];
        size = 0;
    }

    // Insert a new item into the catalog.
    public void insert(Item obj){
         list[size] = obj;
         ++size; 
    }

    /*Search the catalog for the item whose item number
     * is the parameter id.  Return the matching object. 
     * If the search succeeds.  Return null if the search fails. */
     public Item find(int id){
    	 int match = id;
    	 
    	 for(int i = 0; i < size; i++){ 
    		 if (list[i].getItemNumber()==match){
    			 return list[i];
    		 }
    	 }
      return null;
    }
}
