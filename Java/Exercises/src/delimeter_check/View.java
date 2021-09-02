package delimeter_check;
import java.util.*;
import java.io.*;

/************************************************************************************************
 * View handles user interaction and printing tasks.
 * @author Carlos De Los Santos
 ************************************************************************************************/

public class View
{
    
    private Scanner read_int;//Different scanners to avoid overflow.
    private Scanner read_str;
    private View view;
    private Model model;
    
    //Constructor.
    public View(){
        read_int = new Scanner(System.in);
        read_str = new Scanner(System.in);
    }
    
    //Prints message to screen.
    public void printMessage(String msg){
        System.out.println(msg);
    }
    
    //Scanner for user input as String.
    public String getUserWords(){
        String found = "n/a";
        try{
            found = read_str.nextLine();
        }
        catch(InputMismatchException e){}
        return found;
    }
    
    //Scanner for user input as int.
    public int getUserNumber(){
        int found = 0;
        try{
            found = read_int.nextInt();
        }
        catch(InputMismatchException e){}
        return found;
    }
    
    //Top menu of the program.
    public String topMenu(){
        String prompt = "Would you like to check if the delimiters are balanced? (y/n)";
        return prompt;
    }
}