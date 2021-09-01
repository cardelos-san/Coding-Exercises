package mpg_calculator_2;
import java.util.Scanner;

/************************************************************************************************
 * Calculates miles per gallon using user input
 ************************************************************************************************/

class MilesPerGallon{
	
    public static void main(String[]args){
    	Scanner scan = new Scanner(System.in);
        double startMiles, endMiles, gallons;
        
        System.out.print("New car odometer reading: ");
        startMiles = scan.nextDouble();
        
        Car car = new Car(startMiles); 
        System.out.println("Filling Station Visit");
        System.out.println("Odometer reading ");
        endMiles = scan.nextDouble();
        
        System.out.print("Gallons to fill tank ");
        gallons = scan.nextDouble();
        
        car.fillUp(endMiles, gallons);
    
        System.out.println("Miles per gallon is " +car.calculateMPG());
        
        if(car.gasHog()==true){System.out.println("The car is a gas hog!");}
        
        if(car.economyCar()==true){System.out.println("Economy car!");}
        
        scan.close();
    }
}
