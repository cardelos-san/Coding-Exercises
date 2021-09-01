package factorials;
import java.util.*;

/************************************************************************************************
 * Finds the factorial of N
 ************************************************************************************************/

public class Factorials{
	
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        long N, fact = 1;
        System.out.print("Enter N: ");
        N = scan.nextLong();
        int i=1;
        
        if (N>=0){
        	
            while(i<=N){
                fact=fact*i;
                i++;
            }
            
            System.out.println("Factorial is " + fact);
        }
        
        else{System.out.println("N must be zero or greater");}
        
        scan.close();
    }
}
