package mpg_calculator;

/************************************************************************************************
 * Creates car objects
 ************************************************************************************************/

public class Car{
	
    //Instance variables
    private double startMiles;
    private double endMiles;
    private double gallons;
    
    //Constructor
    public Car(double startOdo, double endingOdo, double gallons) {
        startMiles = startOdo;
        endMiles = endingOdo;
        this.gallons = gallons;
    }
    
    //Methods
    public double calculateMPG(){
        return (endMiles-startMiles)/gallons;
    }
    
    public boolean gasHog(){
    	
        if(this.calculateMPG()<15.0){return true;}
        
        else{return false;}
    }
    
    public boolean economyCar(){
    	
        if (this.calculateMPG()>30.0){return true;}
        
        else{return false;}
    }
}

