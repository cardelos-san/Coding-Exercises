package affine_cipher_decoder;

/************************************************************************************************
* Creates a simple array with the alphabet letters in order.
* @author Carlos De Los Santos
*************************************************************************************************/

public class Alphabet {
    private char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray(); 
    private View view;

    /**
     * Constructor 
     */
    public Alphabet()
    {
        view = new View();
    }

    //Returns array object.
    public char getAlphabet(int i){
        return alphabet[i];
    }

    //Returns length of array list.
    public int getLength(){
        return alphabet.length;
    }

    //Prints all array objects contained list.
    public void printAll(){
        for (int i = 0; i < 26; i++){
            view.printChars(alphabet[i]);
        }
    }
}