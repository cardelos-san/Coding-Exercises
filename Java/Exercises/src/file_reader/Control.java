package file_reader;

public class Control
{
    private View view;
    public Control(){
        
        view = new View();
    }
    
    public void run(){
    	
        this.doFile();
    }
    
    public void doFile()
    {
    	view.printMessage(view.topMenu());
        boolean doThis = true;
        String input;
        while(doThis){
            input = view.getUserWords();
            if(input.equals("y")){
                for(int i = 1; view.getFile().hasNextLine(); i++){
                    view.printMessage( i + " " + view.readFile());
                }
                view.printMessage("Displaying all information on file.\n");
                view.resetFile();
                view.printMessage("Read file again? (y/n)");
            }
            else if(input.equals("n")){
                view.printMessage("Exiting program.");
                break;
            }
            else{
                view.printMessage("Invalid input, try again.*"); //Else statement not working properly first time program is executed.
            }
        }
    }

}
