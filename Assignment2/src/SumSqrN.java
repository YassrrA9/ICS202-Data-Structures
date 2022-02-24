package packageA2;

import java.util.Scanner;

public class SumSqrN{
  public static void main(String args []){
	//test method to be implemented by students
	  Scanner kb = new Scanner(System.in);
	  System.out.println("Enter the integer n:");
	  int n = kb.nextInt();
	  System.out.println("The sum of squares of the first "+n+" integers is: "+sumSqrN(n));
	  kb.close();
  }
  
  public static int sumSqrN(int n){
	//to be implemented by students
	  if(n<=1) {
		  return n;
	  }else {
		  return ((n*n)+(sumSqrN(--n)));
	  }
  }
}