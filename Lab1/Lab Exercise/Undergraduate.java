package Practise;

public class Undergraduate extends Student{
	
	public Undergraduate(String ID, double GPA) {
		super(ID,GPA);
	}
	
	@Override
	public String getStatus() {
		if(GPA >=3.0) {
			return " HONOR ";
		}else if ( GPA >=2.0 ){
			return " GOOD " ;
		}else {
		}
			return " Probation ";
		}
	}


