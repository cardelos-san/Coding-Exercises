package mpg_calculator_2;

/************************************************************************************************
 * Creates Car objects and calculates MPG
 ************************************************************************************************/

public class Car{
	
    //Instance variables
    private double startMiles;
    private double endMiles;
    private double gallons;
    //Constructor
    public Car(double startOdo) {
        startMiles = startOdo;
    }
    
    //Methods
    public double calculateMPG(){
        return (endMiles-startMiles)/gallons;
    }
    
    public boolean gasHog(){
    	
        if(this.calculateMPG()<15.0){return true;}
        
        else{return false;}
    }
    
    public void fillUp( double miles, double gallons ){
    	endMiles = miles;
     	this.gallons = gallons;
    }
    
    public boolean economyCar(){
    	
        if (this.calculateMPG()>30.0){return true;}
        
        else{return false;}
    }
}
