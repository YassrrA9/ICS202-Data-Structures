package pckg8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class TestAVL {
	public static void main(String[] args) throws FileNotFoundException {
			//Example which works with Left Rotation
         AVLTree<String> t = new AVLTree<String>();
         for(int i = 1; i <= 5; i++)
				t.insertAVL("A" + i);
			t.breadthFirst();
			System.out.println();
			System.out.println();
			System.out.println();

         System.out.println("Exercise 2");
         int[] values = {8, 14, 12, 18, 23, 20, 15, 13, 7, 16};
         AVLTree<Integer> tree = new AVLTree<Integer>();
         for(int i=0; i<values.length; i++)
        	 tree.insertAVL(values[i]);
			tree.breadthFirst();
			System.out.println();
			Scanner kb = new Scanner(System.in);
			System.out.println("Enter 3 elements to delete");
			int num1 = kb.nextInt();
			int num2 = kb.nextInt();
			int num3 = kb.nextInt();
			 tree.deleteAVL(num1);
			 tree.deleteAVL(num2);
			 tree.deleteAVL(num3);
				tree.breadthFirst();
				System.out.println();
				kb.close();


				System.out.println();
				System.out.println();

         System.out.println("Exercise 3");
         //read the text file, insert unique words into the AVL tree and print its inorder traversal
         AVLTree<String> tree2 = new AVLTree<String>();
         File file = new File("sampletextfile.txt");
         Scanner reader = new Scanner(file);
         String word;
         reader.next();
         while(reader.hasNextLine()) {
        	 word = reader.next();
        	 if(!tree2.isInTree(word)) {
        		 tree2.insert(word);
        	 }
             reader.next();

         }
         reader.close();
         tree2.inorder();
	}
}