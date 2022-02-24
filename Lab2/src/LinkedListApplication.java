package packa;

import packa.SortedSLL.T;

public class LinkedListApplication {
    public static void main(String[] args) {
        SLL<String> fruitList = new SLL<String>();
      

    	fruitList.addToTail("Apple" );
    	fruitList.addToTail("Mango" );
    	fruitList.addToTail("Banana" );
    	fruitList.addToTail("Peach" );
    	fruitList.addToTail("Watermelon");
    	
    	
        
        
        
        
        fruitList.printAll();
        System.out.println("\n");


        

        System.out.println("Length : " + fruitList.length() + "\n");

        System.out.println("/// After insert Fruits before Apple");

        fruitList.insertBefore("Fruits","Apple");



        fruitList.printAll();
        System.out.println("\n");


        System.out.println();

        System.out.println("/// After insert Orange before Banana");

        fruitList.insertBefore("Orange","Banana");


        fruitList.printAll();
        System.out.println("\n");


        System.out.println();

        System.out.println("/// After delete before Apple ");

        fruitList.deleteBefore("Apple");

        fruitList.printAll();

        System.out.println("\n");

        fruitList.deleteAfter("Banana");

        System.out.printf("/// After delete after Banana \n ");

        fruitList.printAll();
        System.out.println();
        System.out.println();

        
SortedSLL<String> fruitList2 = new SortedSLL<String>();
        

    	SortedSLL llist = new SortedSLL(); 
        T new_node; 
        new_node = fruitList2.newNode(390); 
        fruitList2.insert(new_node); 
        new_node = fruitList2.newNode(100); 
        fruitList2.insert(new_node); 
        new_node = fruitList2.newNode(80); 
        fruitList2.insert(new_node); 
        new_node = fruitList2.newNode(7); 
        fruitList2.insert(new_node); 
        new_node = fruitList2.newNode(0); 
        fruitList2.insert(new_node); 
        new_node = fruitList2.newNode(11); 
        fruitList2.insert(new_node); 
        System.out.println("Created SORTED Linked List"); 
        fruitList2.printList(); 







    }
}
