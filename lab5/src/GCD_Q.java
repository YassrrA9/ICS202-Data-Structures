package pckg52;

import java.util.Scanner;

public class GCD_Q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter two integers To find Greatest Common Divisor :");
		
		  int num1 = kb.nextInt();
		  int num2 = kb.nextInt();
	      int gcd = GCD(num1, num2);
	       

	        System.out.printf("%nGCD of %d and %d is = %d.", num1, num2, gcd);
	    }

	    public static int GCD(int num1, int num2)
	    {
	        if (num2 != 0)
	            return GCD(num2, num1 % num2);
	        else
	            return num1;
	    }
	}