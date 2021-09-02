package affine_cipher_decoder;

/************************************************************************************************
* Control handles the main logic of the program. Redirects program based on user input.
* @author Carlos De Los Santos
*************************************************************************************************/

public class Control{
    private View view;
    Decryption decrypt;

    /**
     * Constructor 
     */
    public Control(){
        view = new View();
        decrypt = new Decryption();
    }

    //Runs the program.
    public void run(){
        this.topMenu();
    }

    //Prints top menu and commences process.
    public void topMenu(){
        view.printMessage(view.topMenu());
        String input = view.getUserWords();
        while(!(input.equalsIgnoreCase("Q"))){
            if(input.equalsIgnoreCase("D")){
                view.printMessage("Commencing brute-force decryption \n");
                decrypt.decryptionMenu();
                break;
            }
            else{
                view.printMessage("Invalid input, try again\n");
                input = view.getUserWords();
                view.printMessage("\n" );
            }
        }
    }
}
