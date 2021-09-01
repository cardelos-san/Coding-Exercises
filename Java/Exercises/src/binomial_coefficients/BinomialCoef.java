package binomial_coefficients;

/************************************************************************************************
 *Finds the binomial coefficients from 1 to N recursively 
 ************************************************************************************************/

public class BinomialCoef{
	
    public static void main(String[] args) {
        int n, k, coef;

        for (n = 0; n <= 10; ++n) {
        	
            for (k = 0; k <= n; ++k) {
                coef = binCoef(n,k);
                System.out.printf("%5d", coef);
            }
            
            System.out.printf("%n");
        }
    }

    public static int binCoef(int n, int k) {
    	
        if (k==0 || k==n) {return 1;} 
        
        else {return binCoef(n-1,k-1) + binCoef(n-1,k);}
    }
}