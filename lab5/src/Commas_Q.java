package pckg52;

import java.util.Scanner;

public class Commas_Q {
	
	
	 public static void main(String[] args) {
		 
		 String modifiedNumber = putCommas(1234567);
			System.out.println("Number after adding commas: "+modifiedNumber);

		}

	public static String putCommas(int x){

	    if(x<1000) {
	    	return String.valueOf(x);
	    }
	    int div = x%1000;
	    String value =String.valueOf(div);

	    if(value.equals("0")||value.length()==1) {
	    	value="00"+value;
	    }
	    else if(value.length()==2) {
	    	value="0"+value;
	    }

	    String number =putCommas(x/1000)+ ","+value;
	    return number;
	}   
}

