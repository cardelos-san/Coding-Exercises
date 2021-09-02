package athlete_database_system;

/************************************************************************************************
 * BasketballPlayer is a concrete subclass of Athlete.
 * It models a particular type of athlete
 * with a particular set of statistics. 
 * @author K. Sanders for CS 212 and Carlos De Los Santos
 ************************************************************************************************/

public class BasketballPlayer extends Athlete
{
    // Instance variables
    private double points;

    /**
     * Constructor for objects of class BasketballPlayer
     */
    public BasketballPlayer(String last, String first, double pts) {
        super(last, first);
        this.points = pts;
    }

    public void printStatistics() {
        System.out.println(this.toString());
    }
    
    public String getType() {
        return "basketball";
    }
    
    public String toString() {
        return super.toString() +
        "\nPoints: " + this.points;
    }
}

