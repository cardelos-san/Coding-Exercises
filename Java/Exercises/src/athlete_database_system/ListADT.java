package athlete_database_system;

/************************************************************************************************
 * ListADT is an interface designed to be a model of any List class in this program.
 * @author K. Sanders and CS 212-02, Fall 2015 & Carlos De Los Santos
 ************************************************************************************************/

public interface ListADT {
	
    public int getCurrSize();
    
    public void insert(Athlete player);
    
    public void remove (int pos);
    
    public void playerToRemove(Athlete toRemove);
    
    public void printIndiv(Athlete toFind);
    
    public void printSport(String currType);
    
    public void printAll();
   
}

