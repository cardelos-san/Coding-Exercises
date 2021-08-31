package average_grade_calculator;
import java.util.*;
public class Methods{
    //Variable declarations
    Scanner scan = new Scanner(System.in);
    double scoreNumber;
    double average;
    double score;
    double scoreTotal;
    char grade;
    String name = new String();
    
    //Gets user input as a String
    public String getName(){
        System.out.println("Please enter your name: ");
        name = scan.nextLine();
        return name;
    }
    
    //Gets the number of input scores from the user
    public double getScoreNumber(){
        System.out.println("Please enter how many test scores you would like to submit: ");
        scoreNumber = scan.nextDouble();
        return scoreNumber;
    }
    
    //Gets the test scores and adds them
    public double getScores(){
       int count = 1;
       while(count<=scoreNumber){
        System.out.println("Please enter a test score: ");
        score = scan.nextInt();
        scoreTotal = score + scoreTotal;
        count++;
       }
       return scoreTotal;
    }
    
    //Finds the average
    public double Operations(){
        average = scoreTotal/scoreNumber;
        return average;
    }
    
    //Converts average to letter grade
    public char letterGrade(){
        if(average<=65){grade = 'F';}
        
        if(average>=66&&average<=69){grade = 'D';}
        
        if(average>=70&&average<=79){grade = 'C';}
        
        if(average>=80&&average<=89){grade = 'B';}
        
        if(average>=90&&average<=100){grade = 'A';}
        
        return grade;
    }
    
    //Output
    public void Print(){
        System.out.println("Results for student " +name);
        System.out.println("You have submitted "+(int)scoreNumber+" Test scores");
        System.out.println("Your total score number is " + scoreTotal);
        System.out.println("Your average grade is " + average);
        System.out.println("Your letter grade is " +grade);
    }
}

    
