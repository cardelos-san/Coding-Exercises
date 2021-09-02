package delimeter_check;

/****************************************************************************************************
 * This program reads a text file, and determines whether the delimiters are balanced(i.e. brackets)
 * Implements 3 types of data structures, linked lists, arrays, and stacks
 * For example, this program can check a java file and make sure every bracket or parenthesis is
 * balanced, for example:
 * 
 * {} is balanced
 * {{} is not balanced
 * 
 * Very useful for checking proper syntax
 * @author: Carlos De Los Santos
 ****************************************************************************************************/


public class DelimeterCheck{
    public static void main(String[]args){
        Control control = new Control();
        control.run();
    }
}
