package temperature_converter;
import java.util.Scanner;

/************************************************************************************************
 * Converts user given temperate values to either Fahrenheit or Celsius
 ************************************************************************************************/

class TemperatureConverter{
	
    public static void main (String[] args){
        double centigrade2Fahrenheit;
        double fahrenheit2Centigrade;
        double centigrade;
        double fahrenheit;
        int answer;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 0 for Fahrenheit or 1 for Centigrade: ");
        answer = scan.nextInt();
        
        if (answer == 1){
            System.out.println("Please enter the temperature in Centigrade :");
            centigrade = scan.nextDouble();
            centigrade2Fahrenheit = ((centigrade*9/5.0)+32);
            System.out.println("Tempreature in Centigrade was input as "+centigrade);
            System.out.println("Tempreature in Fahrenheit was calculated as "+centigrade2Fahrenheit);
        }
        
        if (answer == 0){
            System.out.println("Please enter the temperature in Farenheit: ");
            fahrenheit = scan.nextDouble();
            fahrenheit2Centigrade = (5/9.0)*(fahrenheit-32);
            System.out.println("Tempreature in Fahrenheit was input as "+fahrenheit);
            System.out.println("Tempreature in Centigrade was calculated as "+fahrenheit2Centigrade);
        }
        
        scan.close();
        
    }
}
        
        
          


           
                
        
        
        
        
