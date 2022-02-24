package packageA2;

import java.util.Scanner;
public class DequeueDriver{
	  public static void main(String[] args){
		//to be implemented by students, you may use the following getMenuChoice method  
		  MyDequeue<Integer> dequeue = new MyDequeue<Integer>();
		  Scanner scanner2 = new Scanner(System.in);
		  
		  int choice =0;
		  
		  do {
			 try { 
		   choice = getMenuChoice();
		  
		  switch(choice) {
		  
		  
		  
		  case 1:  
			  System.out.println("Enter number of elements to add:");
			  int numOfElements = scanner2.nextInt();
			  System.out.println("Enter "+numOfElements+" elements:");
			  for(int i=1; i<=numOfElements; i++ ) {
				  int number = scanner2.nextInt();
				  Integer element = new Integer(number);
				  dequeue.addToFront(element);
			  }

			  break;
		  case 2:
			  System.out.println("Enter number of elements to add:");
			   numOfElements = scanner2.nextInt();
			  System.out.println("Enter "+numOfElements+" elements:");
			  for(int i=1; i<=numOfElements; i++ ) {
				  int number = scanner2.nextInt();
				  Integer element = new Integer(number);
				  dequeue.addToRear(element);
			  }
			  break;
		  case 3:
			  dequeue.peekFront();
			  
			  break;
		  case 4:
			 
			  dequeue.peekRear();
			  
			  break;
		  case 5:
			  
			  dequeue.removeFront();
			  
			  break;
		  case 6:
			  
			  dequeue.removeRear();
			  
			  break;
			  
		  case 7:
			  if(dequeue.isEmpty()) {
				  System.out.println("The dequeue is Empty !");
			  }else {
			  System.out.println("Enter element to search:");
			  int input = scanner2.nextInt();
			  Integer numberToSearch = new Integer(input);
			  if((dequeue.search(numberToSearch))==true) {
				  System.out.println("Element is in dequeue");
			  }else {
				  System.out.println("Element is not in dequeue !");
			  }
			  }
			  break;
		  case 8:
			  
				  System.out.println("The dequeue size is "+dequeue.getSize());

			  
			  break;
		  case 9:
				  System.out.println(dequeue.toString());
			
			  break;
		  case 10:
			  break;
		  default:
			  break;
		  }
			 }catch(Exception e) {
				 System.out.println(e);
			 }
		  }while(choice!=10);
	  }
	  
	  public static  int  getMenuChoice(){
	     Scanner scanner = new Scanner(System.in);
	     int choice;
	    
	    do{
	        System.out.println("Please select the operation: ");
	        System.out.println("1. Add to front");
	        System.out.println("2. Add to rear");
	        System.out.println("3. Peek front");
	        System.out.println("4. Peek rear");
	        System.out.println("5. Remove front");
	        System.out.println("6. Remove rear");
	        System.out.println("7. Search");
	        System.out.println("8. Get size");
	        System.out.println("9. Display dequeue");
	        System.out.println("10. Exit");
	       
	         choice = scanner.nextInt();   
	         if(choice < 1 || choice > 10)
	              System.out.println("Error: Wrong operation!");
	    }while(choice < 1 || choice > 10);
	    
	    return choice;               
	  }
	}