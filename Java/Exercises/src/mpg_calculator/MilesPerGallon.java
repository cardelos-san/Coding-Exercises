package mpg_calculator;
import java.util.Scanner;

/************************************************************************************************
 * Collects values for Car objects and calculates MPG
 ************************************************************************************************/

class MilesPerGallon{
	
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        double startMiles, endMiles, gallons;
        
        System.out.print("Enter starting miles: ");
        startMiles = scan.nextDouble();
        
        System.out.print("Enter ending miles: ");
        endMiles = scan.nextDouble();
        
        System.out.print("Enter gallons consumed" );
        gallons = scan.nextDouble();
        
        Car car = new Car(startMiles, endMiles, gallons); 
        
        System.out.println("Miles per gallon is " +car.calculateMPG());
        
        if(car.gasHog()==true) { System.out.println("The car is a gas hog!");}
        
        if(car.economyCar()==true){System.out.println("Economy car!");}
        
        scan.close();
    }
}