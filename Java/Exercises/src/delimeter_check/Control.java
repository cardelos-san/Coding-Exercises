package delimeter_check;
import java.util.*;

/************************************************************************************************
 * Control holds program logic.
 * @author Carlos De Los Santos
 ************************************************************************************************/

public class Control {
    private View view;
    private StackADT<Object> myStack;
    private Model file;
    
    //Constructor.
    public Control(){
        view = new View();
        file = new Model();
    }
    
    //Starting point.
    public void run(){
        this.arrayorLinked();
        this.doFile();
    }
    
    //Creates an Array List Stack or Linked List Stack.
    public void arrayorLinked() {
        view.printMessage("There are two types of lists available for this program. \n1)Array List\n2)Linked List\nEnter -1 to exit now");
        boolean notQuit = true;
        String choice;
        while(notQuit) {
            choice = view.getUserWords();
            if (choice.equals("1")) {
                view.printMessage("Array List selected\n");
                myStack = new ArrayStack<Object>();
                break;
            } 

            else if (choice.equals("2")) {
                view.printMessage("Linked List selected\n");
                myStack = new LinkedStack<Object>();
                break;
            }
            else if(choice.equals("-1")){
                System.exit(0);
            }
            else{
                view.printMessage("Invalid input, try again\n");
            }
        }
    }
    
    //Handles the files and asks user to check to delimeters.
    public void doFile() {
        view.printMessage(view.topMenu());
        boolean notQuit = true;
        boolean balancedResult;
        int count = 0;
        String input;
        while(notQuit){
            input = view.getUserWords();
            if(input.equals("y")){
                this.displayFile();
                balancedResult = this.checkDelimiters();
                if(balancedResult){
                    view.printMessage("Delimiters are balanced\n");
                }
                view.printMessage("Check again? (y/n)");
            }
            else if(input.equals("n")){
                view.printMessage("Exiting program.\n");
                break;
            }
            else{
                view.printMessage("Invalid input, try again."); 
            }
        }
    }
    
    //Displays the file's content on screen.
    public void displayFile() {
        view.printMessage("");
        for(int i = 1; file.getFile().hasNextLine(); i++){
            view.printMessage( i + " " + file.readFile());
        }
        file.resetFile();
        view.printMessage("");
    }

    //Checks if delimiters in the file are balanced.
    public boolean checkDelimiters() {
        Character foundChar;
        boolean balanced = true;
        String currentLine;
        int length;
        int lineNumber = 1;
        while(file.getFile().hasNextLine()) {
            currentLine = file.readFile();
            length = currentLine.length();
            for(int i =0; i < length;i++){
                foundChar = currentLine.charAt(i);
                if(foundChar == '{' || foundChar == '}'  || foundChar == '('||
                foundChar == ')'|| foundChar == '[' || foundChar == ']' || foundChar == '<' || foundChar == '>') {
                    if (foundChar == '{' || foundChar == '('||
                    foundChar == '[' || foundChar == '<'){
                        myStack.push(foundChar);
                    }
                    else{
                        if(!(myStack.isEmpty()) && this.match(foundChar)){
                            myStack.pop();
                        }
                        else {
                            balanced = false;
                            view.printMessage("Delimiters are not balanced");
                            view.printMessage("Check line " + lineNumber + "\n");
                        }
                    }
                }
            }
            lineNumber++;
        }
        file.resetFile();
        return balanced;
    }
    
    //Verifies object on top of the stack and returns true if parameters match description.
    public boolean match(Character e) {
        boolean gotMatch = false;
        if( e == '}' ){
            if(myStack.peek()=='{'){
                gotMatch = true;
            }
        }

        else if(e == ']'){
            if(myStack.peek()=='['){
                gotMatch = true;
            }
        }

        else if(e == ')'){
            if(myStack.peek()=='('){
                gotMatch = true;
            }
        }

        else if(e == '>'){
            if(myStack.peek()=='<'){
                gotMatch = true;
            }
        }
       return gotMatch;
    }
}