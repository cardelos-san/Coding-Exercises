package string_manipulation;
import java.util.*;
/************************************************************************************************
 * This program demonstrates various operations with strings
 ************************************************************************************************/
public class StringModifier{
	private Scanner kbd;
	
	public static void main (String[] args){
		new StringModifier();
	}
  
   public StringModifier(){
	   kbd = new Scanner(System.in);
       this.doCommands();
   }
   
   public void doCommands(){
	   
	   boolean run = true;
	   
	   while(run) {
		   
		   switch(this.menu()){
		   		case "a":
		   			this.concatenate();
		   			break;
		   		case "b":
		   			this.compareStrings();
		   			break;
		   		case "c":
		   			this.searchForSubstrings();
		   			break;
		   		case "d":
		   			this.extractSubstrings();
		   			break;
		   		case "e":
		   			this.replaceSubstrings();
		   			break;
		   		case "q":
		   			run = false;
		   			break;
		   		default:
		   			System.out.println("Not a valid input");
		   }
	   }
   }
   
   public void concatenate(){
        String str1, str2, str3;
        int len1, len2;
        str1= this.setString ("Enter the first string: ");
        str2= this.setString("Enter the second string: ");
        len1 = str1.length();
        System.out.printf("The length of str1 is %d.%n", len1);
        System.out.printf("str1 is \"%s\".%n", str1);
        len2 = str2.length();
        System.out.printf("The length of str2 is %d.%n", len2);
        System.out.printf("str2 is \"%s\".%n", str2);
        str3 = str1 + str2;
        System.out.printf("str1 + str2 is \"%s\".%n", str3);
   } 
   
   public void compareStrings(){
       String str1, str2;    
       str1= this.setString("Enter the first string: ");
       str2= this.setString("Enter the second string: ");
       
       if (str1.compareTo(str2) < 0)
         System.out.printf("%s < %s%n", str1, str2);
         else if (str1.compareTo(str2) == 0)
         System.out.printf("%s = %s%n", str1, str2);
         else if (str1.compareTo(str2) > 0)
         System.out.printf("%s > %s%n", str1, str2);
   }
   
   public void searchForSubstrings(){
       String  source, target;
       int  posn;
       source = this.setString ("Enter the source string: ");          
       target =  this.setString("Enter the target string:  ");
       posn = source.indexOf(target);
       
       if (posn < 0){
            System.out.printf("The target was not found.%n");
       }
       
       else{
    	   System.out.printf("The target was found at position %d.%n", posn);
       }
   }
   
   public void extractSubstrings(){
       String  str, substr;
       int  start, finish;
       str = this.setString ("Enter the string: ");          
       System.out.printf("Enter the starting position: ");
       start = kbd.nextInt();
       System.out.printf("Enter the ending position: ");
       finish = kbd.nextInt();
       substr = str.substring(start,finish);
       System.out.printf("The substring is \"%s\".%n", substr);
   }
   
   public void replaceSubstrings(){
      String  str, oldstr, newstr;
      str =setString ("Enter the string: ");          
      oldstr = this.setString("Enter the substring to replace: ");
      newstr= this.setString("Enter the replacement string: ");
      str = str.replace(oldstr, newstr);
      System.out.printf("The new string is \"%s\".%n", str);
   }
   
   public String setString(String amessage){
       System.out.println(amessage);
       return kbd.nextLine();
   }
   
   public String menu() {
	   String input = setString("\n"
		   		+ "Please select action to perform with strings\n"
		   		+ "\n"
		   		+ "a)Concatenate\n"
		   		+ "b)Compare\n"
		   		+ "c)Search\n"
		   		+ "d)Extract\n"
		   		+ "e)Replace\n"
		   		+ "q)Quit");
	   return input;
	   
   }
   
}