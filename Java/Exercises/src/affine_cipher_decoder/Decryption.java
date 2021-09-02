package affine_cipher_decoder;

/*****************************************************************************************************
* Decryption is central to the program. Calls various methods needed to decipher an encrypted string.
* @author Carlos De Los Santos
******************************************************************************************************/

public class Decryption {

   private CipherAlphabet cipherLetters;
   private Alphabet alphabet;
   private View view;
   private int a;
   private int b;
   private int inverA;
   private int y;
   private int x; 
   private final int M = 26;
   private int length;
   private char letter;
   private String cipherText;
   private String plainText;

   /**
    * Constructor 
    */
   public Decryption(){
       a = 0;
       b = 0;
       plainText = "";
       view = new View();
       cipherLetters = new CipherAlphabet();
       alphabet = new Alphabet();
   }

   //Receives cipherText from user and calls upon another method.
   public void decryptionMenu(){
       view.printMessage("Please enter text you wish to decrypt\n");
       cipherText = view.getUserWords().toLowerCase();
       view.printMessage("\n");
       this.decrypt(cipherText);
   }

   //Handles user input and keeps track of keys being tested.
   public void decrypt(String cipherText){
       a++;
       b++;
       view.printMessage("Your text " + "'" + cipherText + "'" + " will now decode\n" );
       view.printMessage("Enter C to continue, or Q to stop the program\n" );
       String input = view.getUserWords();
       view.printMessage("\n" );
       while(!(input.equalsIgnoreCase("Q")) && a <= 27 && b <= 26){
           if(input.equalsIgnoreCase("C")){
               view.printMessage("Now using using the key values A = "+ a + " and B = " + b + "\n");
               this.formula(a, b);
               a = a + 2;
               if(a == 13){a = a + 2;}
               if(a == 27){b++; a = 1;}
               if (a == 1 && b == 27)
               { 
                   view.printMessage("All keys have been exhausted\n");
                   break;
               }
               view.printMessage("Enter C to continue, or Q to stop the program\n" );
               input = view.getUserWords();
               view.printMessage("\n" );
           }

           else{
               view.printMessage("Invalid input, try again\n");
               input = view.getUserWords();
               view.printMessage("\n" );
           }
       }

   }
   
   //Computes formula inverA(y-b)%26 and creates a cipher alphabet based on the result.
   public void formula(int a, int b){  
       for (int i = 0; i<26; i++){
           if(i*a%26==1){
               inverA = i;
               break;
           }
       }
       view.printMessage("Formula: " + inverA + "(y - " + b + ")\n" );
       for(y = 0; y < 26; y++){
           x = ((((inverA*(y - b)) % M) + M) % M);
           cipherLetters.insert(x, alphabet.getAlphabet(y));
       }
       this.decipherText();
   }
   
   //Access both Alphabet and cipherAlphabet arrays and computes deciphered text.
   public void decipherText(){
       length = cipherText.length();
       for(int i =0; i < length;i++){
           letter = cipherText.charAt(i);
           for(int atIndex = 0; atIndex < 26; atIndex++)
           {
               if(cipherLetters.getCipherAlphabet(atIndex) == letter) 
               {
                   plainText+= alphabet.getAlphabet(atIndex);
               }
           }
       }
       view.printMessage(plainText + "\n");
       plainText = "";
   }

}
