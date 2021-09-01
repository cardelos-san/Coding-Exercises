package salary_formatter;

import java.util.Scanner;
public class InputData {
	String name;
	double salary;
	int age;
	
	public InputData() {
		Scanner scan = new Scanner(System.in);         
		System.out.printf("Name? ");
		name = scan.nextLine();
		System.out.printf("Age? ");
		age = scan.nextInt();
		System.out.printf("Salary? ");
		salary = scan.nextDouble();
		scan.close();
	}
	
	public void printInfo() {
		System.out.printf("%s is %d years old and earns $%.2f.%n",name, age, salary); 
    }
}	