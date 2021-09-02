package file_reader;
import java.util.*;
import java.io.*;

/************************************************************************************************
 * View handles user interaction and printing tasks.
 * @author Carlos De Los Santos
 ************************************************************************************************/

public class View{
    private Scanner fileReader;
    private File myFile;
    private Scanner read_int;//Different scanners to avoid overflow.
    private Scanner read_str;
    
    public View(){
        read_int = new Scanner(System.in);
        read_str = new Scanner(System.in);
        try {  
            myFile = new File("src/placeholder/testData.txt");
            fileReader = new Scanner(myFile);
        }
        catch(FileNotFoundException e){
            this.printMessage("File not found");
            System.out.println(System.getProperty("user.dir"));
        }
    }
    
    public void resetFile(){
        fileReader.close();
        fileReader = null;
        try {  
        	myFile = new File("src/placeholder/testData.txt");
            fileReader = new Scanner(myFile);
        }
        catch(FileNotFoundException e){
            this.printMessage("File not found");
        }
    }
    
    public String readFile(){
        return fileReader.nextLine();
    }
    
    public Scanner getFile(){
        return fileReader;
    }

    public void printMessage(String msg){
        System.out.println(msg);
    }
    
    public String getUserWords(){
        String result = "n/a";
        try{
         result = read_str.nextLine();
        }
        catch(InputMismatchException e){}
        return result;
    }
    
    public int getUserNumber(){
        int result = 0;
        try{
         result = read_int.nextInt();
        }
        catch(InputMismatchException e){}
        return result;
    }
    
    public String topMenu(){
        String result;
        String line1 = "File " + myFile.getName()+ " has been loaded.\n";
        String line2 = "Would you like to display its content? (y/n)";
        return result = line1+line2;
    }
}

