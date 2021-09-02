package rsa_cipher_decoder;

/*******************************************************************************************************
* Control uses a method to perform mod operations, finding d (e^-1) so that it can decrypt a ciphertext
* @author Carlos De Los Santos
********************************************************************************************************/

public class Control{
    private View view;
    private int e;
    private int y;
    private int x;
    private int n;
    private int d;
    private int p;
    private int q;
    private int m;
    
    /**
     * Constructor 
     */
    public Control(){
        view = new View();
        n = 2623;
        e = 2111;
        y = 1141;
        p = 61;
        q = 43;
    }

    //Runs the program.
    public void run(){
        view.printMessage(view.topMenu());
        this.Phi(n);
        this.findInverse();
        this.RSADecryption();
    }
    
    //Finds Euler's phi function value ϕ(n)
    public void Phi(int n){
        m = (p-1)*(q-1);
    }
    
    //Finds the inverse of e, e^-1.
    public void findInverse(){
        int sentinel = 1;
        for(int i = 1; sentinel == 1; i++){
            if(i*e%m==1){
                d = i;
                break;
            }
        }
    }
    
    //Exponentiating y^d and then applying mod n (y^d mod n). Then displaying results.
    public void RSADecryption(){
        int p;
        x = 1;
        for(int i = 0; i < d; i++){
            p = x * y;
            x = ((((p) % n) + n) % n);;
        }
        view.printMessage("Decryption results:\n");
        view.printMessage("d: ");
        view.printInt(d);
        view.printMessage("\n");
        view.printMessage("x: ");
        view.printInt(x);
        view.printMessage("\n");
    }
}
