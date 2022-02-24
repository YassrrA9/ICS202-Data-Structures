package packageA2;

import java.util.Scanner;

public class Recursion01 {
	public static void main(String args []){
	    Scanner stdin = new Scanner(System.in);
	  
	      System.out.println("Enter array size: ");
	      int size = stdin.nextInt();
	      int[] array = new int[size];
	      System.out.println("Enter " + size + " array elements: ");
	      for(int k = 0; k < size; k++){
	         array[k] = stdin.nextInt();
	      }
	      
	      System.out.print("The array is: ");
	       for(int k = 0; k < size; k++)
	    	 System.out.print(array[k] + "   ");
	    	 
	      System.out.print("\nEnter the integer to test: ");
	      int value = stdin.nextInt();
	    
	       if(hasLessThan(array, value))
	          System.out.println("THE ARRAY HAS AN ELEMENT LESS THAN " + value);
	       else
	          System.out.println("THE ARRAY HAS NO ELEMENT LESS THAN " + value);
	       stdin.close();
	  }
	  
	  public static boolean hasLessThan(int[] x, int value){
	    // call to the auxillary method to be implemented by students
		  int index =0;
		  return hasLessThanAux(x,value,index);

	  }
	  
	   // auxillary method to be implemented by students
	   private static boolean hasLessThanAux(int[] x, int value, int index){
		   
		   
		   if(index == x.length) {
			   return false;
		   }
		   else if(value >= x[index]) {
			   return true;
		   }else {
			   return hasLessThanAux(x,value,++index);
		   }
		   
	   }
	
}
