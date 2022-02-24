package packagelab11;

import java.util.Scanner;

public class Driver {
	public static void main(String args[]) {
        int sizeOfHashTable;
        Scanner kb = new Scanner(System.in);

        // Prompt the user for the size of the table 
        System.out.println("Enter the size of the Hashtable: ");
        sizeOfHashTable = kb.nextInt();
        Hashtable hashingTest = new Hashtable(sizeOfHashTable);

        int choice=0;
        while (choice!=5) {
            System.out.println("1. Insertion");
            System.out.println("2. Deletion");
            System.out.println("3. Find");
            System.out.println("4. Print");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");
            System.out.println();

            choice = kb.nextInt();

            // A variable to check if the task is done 
            boolean status = true;
            switch (choice) {
            
                case 1: 
                    System.out.println("Enter the element to be inserted: ");
                    int number = kb.nextInt();
                    status = hashingTest.insert(number);
                    if (status) {
                        System.out.println(number + " is successfully inserted\n");
                    } else {
                        System.out.println(number + " is not inserted\n");
                    }
                    break;

                case 2:  
                    System.out.println("Enter the element to be deleted: ");
                     number = kb.nextInt();
                    status = hashingTest.delete(number);
                    if (status) {
                        System.out.println(number + " is successfully deleted\n");
                    } else {
                        System.out.println(number + " is not deleted\n");
                    }
                    break;

                case 3: 
                    System.out.println("Enter the element to be searched: ");
                    number = kb.nextInt();
                    status = hashingTest.find(number);
                    if (status) {
                        System.out.println(number + " is present\n");
                    } else {
                        System.out.println(number + " is not present\n");
                    }
                    break;

                case 4:  
                	hashingTest.toString();
                    break;

                case 5:  
                    return;

                default:  
                    System.out.println("Enter a valid choice\n");
            }
        }
    }
	
	


}