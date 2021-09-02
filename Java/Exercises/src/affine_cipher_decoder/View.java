package affine_cipher_decoder;
import java.util.*;
import java.io.*;

/************************************************************************************************
* View handles user interaction and printing tasks.
* @author Carlos De Los Santos
*************************************************************************************************/

public class View {

    private Scanner read_int;//Different scanners to avoid overflow.
    private Scanner read_str;

    //Constructor.
    public View(){
        read_int = new Scanner(System.in);
        read_str = new Scanner(System.in);
    }

    //Prints message to screen.
    public void printMessage(String msg){
        System.out.println(msg);
    }
    
    //Prints an integer.
    public void printInt(int i){
        System.out.println(i);
    }
    
    //Prints a single char.
    public void printChars(char chars){
        System.out.println(chars);
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
        String menu;
        String line1 = "-- This program deciphers any string encrypted with an affine cipher using lowercase letters.\n";
        String line2 = "-- Brute force will be used to decipher the text. All keys will be tested.\n";
        String line3 = "-- Enter D to decrypt a message (Or Q to quit the program).\n";
        return menu = line1+line2+line3;
    }
}