package athlete_database_system;

import java.util.*;

/************************************************************************************************
 * View handles user interaction and printing tasks.
 * @author K. Sanders and CS 212-02, Fall 2015 & Carlos De Los Santos
 ************************************************************************************************/

public class View
{
    private Scanner kbd; // ivar for efficiency
    /**
     * Constructor for objects of class View
     */
    public View()
    {
         kbd = new Scanner(System.in); 
    }
    
    public int getUserNumber(String prompt){
        System.out.println(prompt);
        int result = 0;
        try{
         result = kbd.nextInt();
        }catch(InputMismatchException e){}
        kbd.nextLine(); // eat up extra newline
        return result;
    }
    
    public int getUserNumberNoPrompt(){
        int result = 0;
        try{
         result = kbd.nextInt();
        }catch(InputMismatchException e){kbd.nextLine();}
        return result;
    }
    
    public String getUserWords(String prompt){
        System.out.println(prompt);
        String result = "a";
        try{
            result = kbd.nextLine();
        }catch(InputMismatchException e){}
        return result;
    }
    
     public String getUserWordsNoPrompt(){
        String result = "a";
        try{
            result = kbd.nextLine();
        }catch(InputMismatchException e){}
        return result;
    }
    
    public void printMessage(String msg){
        System.out.println(msg);
    }
    
        public void printIndividualStats(Athlete athlete){
        this.printMessage(athlete.toString());
    }
    
    public String topMenu(){
        String result = "\nEnter the number of your choice. You can:\n";
        result += "1) add a player\n";
        result += "2) remove a player\n";
        result += "3) print stats for one player\n";
        result += "4) print stats for all players " +
        "in a given sport\n";
        result += "5) print stats for all players\n";
        result += "Enter -1 to quit.";
        return result;
    }
}
