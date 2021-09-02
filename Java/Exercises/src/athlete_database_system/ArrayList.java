package athlete_database_system;

/************************************************************************************************
 * ArrayList contains and regulates traffic for the athletes array.
 * @author K. Sanders and CS 212-02, Fall 2015 & Carlos De Los Santos
 ************************************************************************************************/

public class ArrayList implements ListADT {
    // instance variables
    private Athlete[] athletes; // ivar because it's central to class
    private int currSize; // current number of athletes in the array    
    private final int MAX_NUM_ATHLETES = 10; // vary if needed
    private View view;
   
    /**
     * Constructor for objects of class Logic
     */
    public ArrayList() {
        // initialise instance variables
        athletes = new Athlete[MAX_NUM_ATHLETES];
        // start with some athletes upfront
        athletes[0] = new FootballPlayer("Brady","Tom",7);
        athletes[1] = new BasketballPlayer("Bird","Larry",2);
        athletes[2] = new SoccerPlayer("Ronaldo", "Christiano", 3);
        currSize = 3;
        view = new View();
    }
    
    //Returns the current size of the list.
    public int getCurrSize() {
        return currSize;
    }
    
    //Inserts new object into the list.
    public void insert(Athlete player) {
        try {
            athletes[this.currSize] = player;
            this.currSize++;
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Sorry -- no room for more athletes!");
        }
    }
    
    //Removes object from the list.
    public void remove (int pos) {
        int lastButOne = this.currSize - 1;
        // shift items left (first shift will overwrite deleted item)
        for (int i = pos; i < lastButOne; i++){ 
            athletes[i] = athletes[i+1]; 
        }
        // then take care of duplicate value
        athletes[lastButOne] = null; 
        // and remember that array is smaller now
        this.currSize--;
    }
    
    //Receives object from Logic class to be removed and calls remove method.
    public void playerToRemove(Athlete toRemove) {
        boolean foundNothing = true; 
        for (int i = 0; i < this.currSize && foundNothing; i++){
            if (athletes[i].equals(toRemove)){
                this.remove(i);
                foundNothing = false;
            } // Note: removes first athlete with same name. 
        }
        if (foundNothing){
            view.printMessage(toRemove.getFirstName() + " " + toRemove.getLastName() +  " not found. Try again.");
        }
        else{
            view.printMessage(toRemove.getFirstName() + " " + toRemove.getLastName() + " successfully deleted.");
        }
    }
    
    //Prints specific athlete object
      public void printIndiv(Athlete toPrint) {
        boolean foundNothing = true; 
        for (int i = 0; i < this.currSize; i++){
            if (athletes[i].equals(toPrint)){
                view.printIndividualStats(athletes[i]);
                foundNothing = false;
            } // Note: if > 1 athlete matches, user will see all.
        }
        if (foundNothing){
                    view.printMessage("Sorry, " + toPrint.getFirstName() + " " 
                        + toPrint.getLastName() + " not found. Try again.");
        }
    }
    
    //Prints specific athlete object based on type.
    public void printSport(String currType) {
        boolean foundNothing = true;
        for (int i = 0; i < this.currSize; i++){
            if (athletes[i].getType().equalsIgnoreCase(currType)) {
                view.printIndividualStats(athletes[i]);
                foundNothing = false;
            }
        }
        if (foundNothing) {
            view.printMessage("Sorry, we have no " + "information about athletes of that type.");
        }
    }
    
    //Prints all athlete objects contained in the linked list.
    public void printAll() {
        boolean foundNothing = true;
        for (int i = 0; i < this.currSize; i++) {
            view.printIndividualStats(athletes[i]);
            foundNothing = false;
        }
        if (foundNothing){
            view.printMessage("Sorry, our database is empty.");
        }
    }
}

