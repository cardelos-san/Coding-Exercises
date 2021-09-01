package odd_and_even_sum;
import java.util.*;

/************************************************************************************************
 * Finds the sum of all integers, odd and even from 1 to N
 ************************************************************************************************/

class OddAndEvenSum{
	public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N, sumAll = 0, sumEven = 0, sumOdd = 0;
        System.out.print("Enter limit value: ");
        N = scan.nextInt();
        int count = 1;
        
        while(count<=N){
            sumAll= sumAll+count;
            
            if(sumAll%2==0){sumEven = sumAll-count;}
            
            else{sumOdd = sumAll-count;}
            
            count = count + 1;
        }
        
        System.out.print("Sum of all: " + sumAll);
        System.out.print("\tSum of even: " + sumEven);
        System.out.println("\tSum of odd: " + sumOdd);
        scan.close();
    }
}



