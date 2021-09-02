package athlete_database_system;


/************************************************************************************************
 * SoccerPlayer is a concrete subclass of Athlete.
 * It models a particular type of athlete
 * with a particular set of statistics. 
 * @author K. Sanders for CS 212 & Carlos De Los Santos
 ************************************************************************************************/
public class SoccerPlayer extends Athlete
{
    // instance variables
    private double goals;

    /**
     * Constructor for objects of class SoccerPlayer
     */
    public SoccerPlayer(String last, String first, int g)
    {
        super(last, first);
        this.goals = g;
    }

    public void printStatistics(){
        System.out.println(this.toString());
    }
    
    public String getType(){
        return "soccer";
    }
    
    public String toString(){
        return super.toString() + 
        "\nGoals: " + this.goals;
    }
}
