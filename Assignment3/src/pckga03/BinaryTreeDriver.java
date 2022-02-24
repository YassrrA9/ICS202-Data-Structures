package pckga03;

public class BinaryTreeDriver{     
    public static void main(String args[])  { 
         // TREE1 IS NOT A BST, THEREFORE IT IS NOT AN AVL TREE
         BinaryTree<Integer>  myBinaryTree1   = new BinaryTree<Integer>();
       	myBinaryTree1.insert(3);
	      myBinaryTree1.insert(40);
	      myBinaryTree1.insert(10);
	      myBinaryTree1.insert(5);
	      myBinaryTree1.insert(20);
	      myBinaryTree1.insert(8);

         myBinaryTree1.iterativeInorderTraversal();
          System.out.println();
         
         // TREE2 IS A BST AND ALSO AN AVL TREE
         BinaryTree<Integer>  myBinaryTree2   = new BinaryTree<Integer>();
       	myBinaryTree2.insert(50);
	      myBinaryTree2.insert(40);
	      myBinaryTree2.insert(60);
	      myBinaryTree2.insert(10);
	      myBinaryTree2.insert(45);
	      myBinaryTree2.insert(53);
         myBinaryTree2.insert(70);
         myBinaryTree2.insert(2);
         myBinaryTree2.iterativeInorderTraversal();
         System.out.println();
         
         // TREE3 IS A BST BUT NOT AN AVL
         BinaryTree<Integer>  myBinaryTree3   = new BinaryTree<Integer>();
         myBinaryTree3.root = new BTNode<Integer>(50);
         myBinaryTree3.root.left = new BTNode<Integer>(40); 
         myBinaryTree3.root.left.right = new BTNode<Integer>(45);
         
         myBinaryTree3.iterativeInorderTraversal();         
    } 
} 