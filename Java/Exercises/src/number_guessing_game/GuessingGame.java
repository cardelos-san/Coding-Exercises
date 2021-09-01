package number_guessing_game;

import  java.util.*;

public class GuessingGame{
	
  public static void main (String[] args){
	  Scanner input = new Scanner( System.in );
	  Random rand = new Random();
	  int limit;
	  int userGuess;
	  int count;
	  int number;
	  boolean found;
	  int count2;
	  System.out.println("A guessing game from 1 to any limit provided");
	  System.out.println("Please enter a limit for your guess");
	  limit = input.nextInt();
	  number = rand.nextInt(limit)+1;
	  found = false;
	  count = 1;
	  count2 = 10;
	  
	  while (count <= 10 && !found){ 
		  System.out.println("Please enter your guess as an integer, you can only guess "+(count2)+" time(s)");
		  userGuess = input.nextInt();
  
		  if (userGuess == number) { found = true; }
		  
		  else {
			  
			  if (userGuess < number){System.out.println("The number is higher");}
			  
			  if (userGuess > number){System.out.println("The number is lower");}
		  }
		  
      count = count + 1; 
      count2 = count2 - 1;
    } 
	  
    if (found){
       System.out.println("You guessed the number "+number+" correctly");
       System.out.println("You did a great job!!!");
    }
    
    System.out.println("You have reached the limit of guesses, you lose!"); 
    input.close();
  }
}


