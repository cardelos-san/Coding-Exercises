package binomial_coefficients;

/************************************************************************************************
 * Tracks how many recursive calls to the binCoef(int n, int k) were made
 ************************************************************************************************/

public class BinomialCoefRecursiveCount {
    public static int calls;

    public static void main(String[] args) {
        int n, k;

        for (n = 0; n <= 10; ++n) {
            for (k = 0; k <= n; ++k) {
                calls = 0;
                binCoef(n,k);
                System.out.printf("%5d", calls);
            }
            System.out.printf("%n");
        }
    }

    public static int binCoef(int n, int k) {
        ++calls;
        
         if (k==0 || k==n) {
            return 1;
        } 
         
        else { 
            return binCoef(n-1,k-1) + binCoef(n-1,k);
        }
    }
}
