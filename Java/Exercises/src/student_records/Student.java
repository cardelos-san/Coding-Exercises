package student_records;

public class Student{
	String name;
	String major;
	double gpa;
	int hours;
   
	public Student(String newName, String newMajor, double newGPA, int newHours){   
		name = newName;
        major = newMajor;
        gpa = newGPA;
        hours = newHours;
	}

	//Updates the Student's number of credit hours. 
	public void updateHours(int updateHours){
		hours += updateHours;
    }
 
	/* Prints an object of type Student as follows: 
    Name:
    Major: 
    GPA = 
    # Credit hours =
    */
    public String toString(){
    	String name, major, gpa, hours, output;
        name = String.format("Name: %s%n",this.name);
        major = String.format("Major: %s%n", this.major);
        gpa = String.format("GPA = %.1f%n", this.gpa);
        hours = String.format("# Credit Hours: %d%n", this.hours);
        output = name + major + gpa + hours;
        return output;
    }
}

