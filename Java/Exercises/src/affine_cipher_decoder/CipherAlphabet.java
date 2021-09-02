package affine_cipher_decoder;

/************************************************************************************************
* Receives a stream of cipher letters then inserts into array depending on a given formula.
* @author Carlos De Los Santos
*************************************************************************************************/

public class CipherAlphabet {
    private char[] cipherAlphabet;
    private final int SIZE;
    private View view;

    /**
     * Constructor 
     */
    public CipherAlphabet() {
        SIZE = 26;
        view = new View();
        cipherAlphabet = new char[SIZE];
    }

    //Inserts object into array.
    public void insert(int index, char letter) {
        cipherAlphabet[index] = letter;
    }

    //Prints all array objects contained in the list.
     public void printAll(){
        for (int i = 0; i < 26; i++){
            view.printChars(cipherAlphabet[i]);
        }
    }
    
    //Returns object based on param.
    public char getCipherAlphabet(int i) {
        return cipherAlphabet[i];
    }
}