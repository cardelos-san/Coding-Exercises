/*
This program finds the midpoint, slope and distance of 2 points on a graph*/
import java.util.Scanner;
import java.lang.Math;

class SlopeCalculator{
    private Scanner scan;
    
    public static void main(String[] args){
        new SlopeCalculator();
    }
    
    public SlopeCalculator(){
        scan = new Scanner(System.in);
        this.operations();
    }
    
    public void operations(){
        //Declarations
        double X1 = this.inputNumber("Enter X1 value: ");
        double Y1 = this.inputNumber("Enter Y1 value: ");
        double X2 = this.inputNumber("Enter X2 value: ");
        double Y2 = this.inputNumber("Enter Y2 value: ");
        //Midpoints
        double midX = (X1+X2)/2.0;
        double midY = (Y1+Y2)/2.0;
        System.out.println("Midpoint = ("+midX+","+midY+")");
        //Slope
        double m = (Y1-Y2)/(X1-X2);
        
        if(m==0){
            System.out.println("Undefined slope");
        }
        else{
            System.out.println("slope = "+ m);
        }
        //Distance
        double distance = (X1-X2)*(X1-X2)+(Y1-Y2)*(Y1-Y2);
        double squareDistance = Math.sqrt(distance);
        System.out.println("Distance between the 2 points = "+ squareDistance);
    }
    
    public Double inputNumber(String prompt){
        System.out.println(prompt);
        return scan.nextDouble();
    }
}
