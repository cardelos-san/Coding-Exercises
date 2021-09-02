package athlete_database_system;

/************************************************************************************************
 * DummyPlayer is a concrete subclass of Athlete.
 * Designed to create a temporary Athlete object
 * with no particular set of statistics. 
 * @author K. Sanders for CS 212 and Carlos De Los Santos
 ************************************************************************************************/

public class DummyPlayer extends Athlete
{
    // Instance variables

    /**
     * Constructor for objects of class FootballPlayer
     */
    public DummyPlayer(String last, String first){
        // Initialize instance variables
        super(last, first);
    }

    public void printStatistics(){
        System.out.println(this.toString());
    }
    
    public String getType(){
        return "Dummy Player";
    }
    
    public String toString(){
        return super.toString();
    }
}

