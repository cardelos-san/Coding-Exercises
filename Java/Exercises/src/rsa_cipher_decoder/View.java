package rsa_cipher_decoder;
import java.util.*;

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
        System.out.print(msg);
    }
    
    //Prints an integer.
    public void printInt(int i){
        System.out.print(i);
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
        String line1 = "-- This program deciphers the ciphertext 'y' using the RSA decryption formula and ouputs\n";
        String line2 = "-- the plaintext 'x' and the private key 'd'. y = 1141 (n, e) = (2623, 2111)\n";
        String line3 = "-- n = 2623\n";
        String line4 = "-- e = 2111\n";
        String line5 = "-- y = 1141\n";
        return menu = line1+line2+line3+line4+line5;
    }
}

