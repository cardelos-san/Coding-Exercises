package student_records;


/************************************************************************************************
 * This program creates student objects with various functionalities
 ************************************************************************************************/
public class StudentRecords{
	
	public static void main(String[] args){
		
	    //Create an object s1 of Student type
	    Student s1 = new Student("Carlos De Los Santos", "Computer Science", 2.5, 250);
	    System.out.println(s1);
	    s1.updateHours(10);
	    System.out.println(s1);
	}
}

