package Practise;

public class Graduate extends Student{
	
	public Graduate(String ID, double GPA) {
		super(ID,GPA);
	}
	
	@Override
	public String getStatus() {
		if(GPA >=3.0) {
			return " GOOD ";
		}else {
			return " Probation ";
		}
	}

}