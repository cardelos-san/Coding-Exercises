package delimeter_check;
import java.util.*;
import java.io.*;

/************************************************************************************************
 * Model class is designed to open, read and model the data in a file
 * @author Carlos De Los Santos
 ************************************************************************************************/

public class Model {
    private Scanner fileReader;
    private File myFile;
    private View view;
    //File address
    private final String FILE_ADDRESS = "src/delimeter_check/TestData.java";
    
    //Constructor
    public Model(){
        view = new View();
        try {  
            myFile = new File(FILE_ADDRESS);
            fileReader = new Scanner(myFile);
            view.printMessage(this.getFileName() + " has been loaded.\n");
            
        }
        catch(FileNotFoundException e){
            view.printMessage("File not found");
        }
    }
    
    //Sets scanner back to top of file.
    public void resetFile(){
        fileReader.close();
        fileReader = null;
        try {  
            fileReader = new Scanner(myFile);
        }
        catch(FileNotFoundException e){
            view.printMessage("File not found");
        }
    }
    
    //Reads each line in the file.
    public String readFile(){
        return fileReader.nextLine();
    }
    
    //Returns file.
    public Scanner getFile(){
        return fileReader;
    }
    
    public String getFileName() {
    	return myFile.getName();
    	
    }
}
