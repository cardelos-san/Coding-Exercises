package arrays;

/***********************************************************************************************
* Creates an Array and iterates to find the sum of all integers in the array
* 
************************************************************************************************/

public class Arrays{
	
	public static void main(String[] args){
		
		double[] TestScores = new double[30];
        
		//4b
        for (int i = 0; i < 10; i++){
           TestScores[i] = 10 * i;
        }
        
        for (int count = 9; count >= 0; count --){
             System.out.println(count + ": " + TestScores[count]);
        }
         
         //find and print the sum of all the items that are in TestScores 
        
        double sum = 0;
         
        for (double i: TestScores){
        	sum += i;
        }
    
        System.out.println(sum);
   }
}
