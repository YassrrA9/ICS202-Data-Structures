package Practicee;

public class BookDriver {
	public static void main(String[] args) {
		
		Book[] arrayOfBooks = new Book[10];
		        arrayOfBooks[0] = new Book("Mathmatics",1489);
				arrayOfBooks[1] = new Book("Information",2189);
				arrayOfBooks[2] = new Textbook("Physics",599,"PHYS");
				arrayOfBooks[3] = new Book("Chemistry art",5690);
				arrayOfBooks[4] = new Textbook("Newton Knowledge",1211,"NWT");
				arrayOfBooks[5] = new Book("Software Engeering",4300);
				arrayOfBooks[6] = new Textbook("Physical Education",119,"PE");
				arrayOfBooks[7] = new Textbook("Albert Enistien",1729,"AE");
				arrayOfBooks[8] = new Book("Marketing Power",3000);
				arrayOfBooks[9] = new Book("Industry",2500);
				
				int count =0;
				
				for (int i= 0 ; i<arrayOfBooks.length ; i++) {
					
					if(arrayOfBooks[i] instanceof Textbook) {
						count++;
					}
		            System.out.print((arrayOfBooks[i].toString()));
		            System.out.println("\n");
		            
		        }
	            System.out.println("\nNumber of Books = " +(10-count));
	            System.out.println("\nNumber of TextBooks = " +(count));



				
	}

}
