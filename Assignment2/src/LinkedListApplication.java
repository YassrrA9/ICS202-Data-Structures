package packageA2;
public class LinkedListApplication {
	   public static void main(String[] args) {
	      SLL<Double> myList = new SLL<Double>();
	      double[] array = {20, 30, 10, 15};
	      for(int i = 0; i < array.length; i++)
		 myList.addToTail(array[i]);
	         
	         
	      System.out.println("Array elements: ");	
	      myList.printAll();
	      double value = 10.0;
	      System.out.println("\nSum of elements greater than " + value + " is " + myList.sum(10.0));
	   }
	}