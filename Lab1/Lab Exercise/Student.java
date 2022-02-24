package Practise;

public abstract class Student {
	
	String ID;
	double GPA;
	
	public Student(String ID, double GPA) {
		this.ID = ID;
		this.GPA = GPA;
	}
	
	public abstract String getStatus();
	public final String displayStudent() {
		return String.format("ID : %S \t GPA = %.2f ", this.ID,this.GPA);
		
	}
}
