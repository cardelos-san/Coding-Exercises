package item_inventory;

/***********************************************************************************************
 * Creates various items and inserts them into a list. Program then searches created items upon
 * user input.
 ************************************************************************************************/
import java.util.*;
public class ItemInventory{
    public static void main(String[] args){
        Scanner kbd = new Scanner(System.in);
        Catalog store = new Catalog(10);
        int itemnum;
        Item item;
        
        //Inserts item into the Catalog class
        item = new Music(1111, "Gold", 12.00, "Abba");
        store.insert(item);
        item = new Movie(2222, "Mamma Mia", 16.00, "Meryl Streep");
        store.insert(item);
        item = new Book(3333, "DaVinci Code", 8.00, "Dan Brown");
        store.insert(item);
        item = new Music(4444, "Legend", 15.00, "Bob Marley");
        store.insert(item);
        
        /*Searches for item, returns search fail or terminates the program. Continues until
        terminated*/
        int sentinel = 1;
        int i = 1;
        
        while (sentinel == i){
            System.out.println("Item number(0 to quit)? ");
            itemnum = kbd.nextInt();
            
            if (itemnum == 0){
            	kbd.close();
                System.exit(0);
            }
            
            Item a = store.find(itemnum);
            
            if (a == null){
                System.out.println("Sorry, item has been not found");
            }
            
            else{
                System.out.println(a);
            }
        }
    }
}

