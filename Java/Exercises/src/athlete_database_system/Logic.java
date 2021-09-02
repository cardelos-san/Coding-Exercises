package athlete_database_system;

import java.util.*;

/************************************************************************************************
 * Logic controls the flow of the application. 
 * @author K. Sanders and CS 212-02, Fall 2015 & Carlos De Los Santos
 ************************************************************************************************/

public class Logic {
    //Declaring constants:
    private final int QUIT = -1;
    private final int INSERT = 1;
    private final int REMOVE = 2;
    private final int PRINT_ALL = 5;
    private final int PRINT_INDIV = 3;
    private final int PRINT_SPORT = 4;
    private View view; //Initializes reference point for View class.
    private ListADT myList;//Initializes myList as an ListADT interface.
    private boolean arrayOrLinked;//Gets user choice for list type
    
    /**
     * Constructor for objects of class View
     */
    public Logic() {
        view = new View();
        arrayOrLinked = this.ArrayOrLinked();
        if(arrayOrLinked){
            myList = new ArrayList();//Creates a myList object of ArrayList type
        }
        else if(!arrayOrLinked){
            myList = new LinkedList();//Creates a myList object of LinkedListType
        }
    }
    
    //Method in charge of selecting a list type.
    public boolean ArrayOrLinked()
    
    {
        final int ARRAY = 1;
        final int LINKED = 2;
        final int QUIT = -1;
        boolean answer = true;
        view.printMessage("Welcome to AnchorFlame Tech's Athlete database!");
        view.printMessage("There are two types of lists available for this program.\nPlease enter a number to select Array List or Linked List and begin.\n");
        view.printMessage("**Note: Array List has capacity for 10 players. Already contains 3 players, room for 8 more.\nLinked List already contains 3 players, " +
        "capacity for as many as needed.\n\n1)Array List\n2)Linked List\nEnter -1 to skip (Array List is selected by default)");
        int choice = view.getUserNumberNoPrompt();
        while(choice != QUIT){
            if (choice == ARRAY) {
                view.printMessage("Array List selected");
                answer = true;
                break;
            } 
        
            else if (choice == LINKED) {
                view.printMessage("Linked List selected");
                answer = false;
                break;
            }
            else{
                view.printMessage("Invalid output, try again");
            }
            choice = view.getUserNumberNoPrompt();
        }
        return answer;
    }
    
    //Runs the main menu.
    public void start(){
        this.runMenu();
    }
    
    //Main menu
    public void runMenu(){
        int choice = view.getUserNumber(view.topMenu());
        while (choice != QUIT) {
            if (choice == INSERT){
                String last = view.getUserWords("Last name: ");
                String first = view.getUserWords("First name: ");
                String playerType = view.getUserWords(
                        "Soccer, football, or basketball? ");
                int statistic;
                if (playerType.equalsIgnoreCase("soccer")){
                    statistic = view.getUserNumber("Number of goals: ");
                    myList.insert(new SoccerPlayer(last, first, statistic));
                } 
                else if (playerType.equalsIgnoreCase("basketball")){
                    statistic = view.getUserNumber("Number of points: ");
                    myList.insert(new BasketballPlayer(last, first, statistic));
                } 
                else if (playerType.equalsIgnoreCase("football")){
                    statistic = view.getUserNumber("Number of touchdowns: ");
                    myList.insert(new FootballPlayer(last, first, statistic));
                } 
                else {
                    view.printMessage("Sorry, we don't include " + 
                        playerType + ". Try again.");
                }
            }
            else if (choice == REMOVE){
                String last = view.getUserWords("Player's last name: ");
                String first = view.getUserWords("Player's first name: ");                
                myList.playerToRemove(new DummyPlayer(last, first));  
            }
            else if (choice == PRINT_INDIV){
                String last = view.getUserWords("Player's last name: ");
                String first = view.getUserWords("Player's first name: ");
                myList.printIndiv(new DummyPlayer(last, first));
            } 
            else if (choice == PRINT_SPORT){
                String currType = view.getUserWords(
                        "Enter the type of sport you're interested in.\n" +
                        "soccer, basketball, or football: ");
               myList.printSport(currType);        
            } 
            else if (choice == PRINT_ALL){
                myList.printAll();
            } 
            else {
                view.printMessage("Invalid input. Try again.");
            }
            choice = view.getUserNumber(view.topMenu());
        }
        view.printMessage("Goodbye and thanks for using our database!");
    }
}
