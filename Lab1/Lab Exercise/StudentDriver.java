package Practise;

public class StudentDriver {
	public static void main(String[] args) {
		
		Student[] arrayOfStudents = new Student[10];
		
		arrayOfStudents[0] = new Graduate("201363000",2.5);
		arrayOfStudents[1] = new Undergraduate("201769877",4.0);
		arrayOfStudents[2] = new Undergraduate("201800877",2.0);
		arrayOfStudents[3] = new Graduate("201461550",3.5);
		arrayOfStudents[4] = new Undergraduate("201988977",4.0);
		arrayOfStudents[5] = new Undergraduate("201711827",1.0);
	    arrayOfStudents[6] = new Graduate("201300000",4.0);
		arrayOfStudents[7] = new Graduate("201212000",3.5);
		arrayOfStudents[8] = new Graduate("201203300",2.5);
		arrayOfStudents[9] = new Undergraduate("202000987",4.0);

		
		for( int i= 0; i< arrayOfStudents.length; i++) {
			
			System.out.println((arrayOfStudents[i].displayStudent())+"\t "+(arrayOfStudents[i].getStatus()));
		}
	}

}
