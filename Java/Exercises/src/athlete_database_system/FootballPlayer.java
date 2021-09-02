package athlete_database_system;


/************************************************************************************************
 * FootballPlayer is a concrete subclass of Athlete.
 * It models a particular type of athlete
 * with a particular set of statistics. 
 * @author K. Sanders for CS 212 & Carlos De Los Santos
 ************************************************************************************************/

public class FootballPlayer extends Athlete {
    // instance variables
    private double touchdowns;

    /**
     * Constructor for objects of class FootballPlayer
     */
    public FootballPlayer(String last, String first, double tds) {
        // Initialize instance variables
        super(last, first);
        this.touchdowns = tds;
    }

    public void printStatistics() {
        System.out.println(this.toString());
    }
    
    public String getType() {
        return "football";
    }
    
    public String toString() {
        return super.toString() + 
        "\nTouchdowns: " + this.touchdowns;
    }
}

