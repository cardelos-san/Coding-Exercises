package athlete_database_system;


/***************************************************************************************************************************
 * LinkedList contains and regulates traffic for the Nodes used to create a linked list containing objects of Athlete type.
 * @author K. Sanders and CS 212-02, Fall 2015 & Carlos De Los Santos
 ***************************************************************************************************************************/

public class LinkedList implements ListADT {
    
    private Node first;
    private int currSize;
    private View view;
    private Athlete returnPlayer;
    
    /**
     * Constructor for objects of class LinkedList
     */
    public LinkedList(){
        view = new View();
        this.first = null; 
        this.currSize = 0;
        this.insert(new FootballPlayer("Brady","Tom",7));
        this.insert(new BasketballPlayer("Bird","Larry",2));
        this.insert(new SoccerPlayer("Ronaldo", "Christiano", 3));
    }
    
    //Inserts object of Athlete type into the linked list.
    public void insert(Athlete player) {
        Node newNode = new Node(player);
        newNode.setNext(this.first);
        this.first = newNode;      
        this.currSize++; // remember that list is bigger now
    }
    
    //Removes object held in the designated position.
    public void remove (int pos) {
        if (pos < 0) {
            // do nothing, item not found
        } else if (pos == 0) { // deleting first item
            this.first = this.first.getNext();
            this.currSize--; // remember that list is smaller now
        } else { // deleting some item after the first one
             // first find the node *before* the one to be deleted
            Node thingBefore = null;
            Node current = this.first;
            while (current != null && (!current.getElement().equals(returnPlayer))){ 
                thingBefore = current;
                current = current.getNext();
            }
            // then connect the node before to the one after, bypassing toDelete
            thingBefore.setNext(current.getNext()); 
            this.currSize--; // remember that list is smaller now
        }
    }
    
    //Searches Athlete object to be removed from the linked list, then uses remove method to remove object.
    public void playerToRemove(Athlete toRemove){
        int pos = 0;
        boolean found = false;
        for (Node current = this.first; 
                  current != null && !found;
                  current = current.getNext()) {
            if (current.getElement().equals(toRemove)){
                returnPlayer = current.getElement();
                found = true;
            } else {
                pos++; 
            }
        } 
        if (!found){
            pos = -1;
            view.printMessage(toRemove.getFirstName() + " " + toRemove.getLastName() +  " not found. Try again.");
        }// signal that we didn't find it
        if(found){
            this.remove(pos);
            view.printMessage(toRemove.getFirstName() + " " + toRemove.getLastName() + " successfully deleted.");
        }
    }
    
    //Receives Athlete reference object from Logic class, compares and finds the object in the list, then uses printIndivHelper method to print the object's attributes.
    public void printIndiv(Athlete toFind){
        int pos = 0;
        boolean found = false;
        for (Node current = this.first; 
                  current != null && !found;
                  current = current.getNext()) {
            if (current.getElement().equals(toFind)){
                found = true;
            } else {
                pos++; 
            }
        } 
        if (!found){
            pos = -1;
            view.printMessage(toFind.getFirstName() + " " + toFind.getLastName() +  " not found. Try again.");
        }
         // signal that we didn't find it
        if(found)this.printIndivHelper(pos);
    }
    
    //Prints object's attributes in the designated pos. 
    public void printIndivHelper(int pos){
        Node current = this.first;
        for (int i = 0; i < pos; i++) {
            current = current.getNext();  
        } 
        view.printIndividualStats(current.getElement());
    }
    
    //Returns current size of the linked list.
      public int getCurrSize(){
        return currSize;
    }
    
    //Prints Athlete objects based on their type.
    public void printSport(String currType){
        boolean found = false;
        for (Node current = this.first; 
                  current != null;
                  current = current.getNext()) {
                 if(current.getElement().getType().equals(currType)){
                 view.printIndividualStats(current.getElement());
                 found = true;
                }
               } 
        if (!found) {
            view.printMessage("Sorry, we have no " + "information about athletes of that type.");
        }
    }
    
    //Prints all Athlete objects contained in the linked list.
    public void printAll(){
        boolean found = false;
        for (Node current = this.first; 
                  current != null;
                  current = current.getNext()) {
             view.printIndividualStats(current.getElement());
             found = true;
        }
        if(!found){
            view.printMessage("Sorry, database is empty.");
        }
    }
}

