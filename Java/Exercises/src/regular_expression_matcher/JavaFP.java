package regular_expression_matcher;

/************************************************************************************************
* JavaFP main task is to use regular expression matching to verify that a floating point literal
* received as input is in valid Java floating point literal format.
* 
* For example, try the following as input:
* 
* 1.0f------> valid
* 1.0d------> valid
* 100 ------> not valid
* 
* @author: Carlos De Los Santos
*************************************************************************************************/

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaFP {
	
	Scanner scan = new Scanner(System.in);
	Matcher matcher;
	Pattern pattern;
	String input = new String();
	
	public void start(){
		String regularExpression = "[-+]?[0-9]*\\.?[0-9]+([eE][-+]?[0-9]+)?[DFdf]";
		pattern = Pattern.compile(regularExpression);
		this.user();
	}
	
	public void user(){
		
		print("Please input a floating point literal to be evaluated (input Q to exit the program)\n");
		int sentinel = 1;
		
		while(sentinel == 1){
			input = scan.nextLine();
			input = input.trim();
			
			if(input.equals("q") || input.equals("Q")){
				print("Program has been terminated");
				System.exit(0);
			}
			
			if(FPMatch(input)){
				print("'" + input +"'" + " is a valid string\n");
			}
			
			if(!FPMatch(input)){
				print("'" + input +"'" + "is not valid string\n");
			}
			
			print("Please input a floating point literal to be evaluated");
		}		
	}
			
	public boolean FPMatch(String stringToMatch){
		
		matcher = pattern.matcher(stringToMatch);
		return matcher.matches();
		
	}
	
	public void print(String message){
		
		System.out.println(message);
	}
	
}

