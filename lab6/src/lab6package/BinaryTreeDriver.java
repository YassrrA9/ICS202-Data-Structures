package lab6package;

import java.util.NoSuchElementException;

public class BinaryTreeDriver {
	public static void main(String args[]) {

		BinaryTree<Integer> binaryTree = new BinaryTree<Integer>();
		binaryTree.root = new BTNode(1);
		binaryTree.root.right = new BTNode(3);
		binaryTree.root.left = new BTNode(2);
		binaryTree.root.left.left = new BTNode(4);
		binaryTree.root.left.right = new BTNode(5);
		binaryTree.root.left.right.left = new BTNode(12);


		System.out.println("The Tree is : ");
		System.out.println();
		binaryTree.printTree();
		System.out.println("------------------------------");

		System.out.println("\nThe number of nodes in the tree is " + binaryTree.count());
		System.out.println("The number of leaf nodes in the tree is " + binaryTree.countLeaves());
		System.out.println("The level of node with key 4 is " + binaryTree.getLevel(4));
		System.out.println();

		try {
			System.out.println("Trying to find the level of node with key 60 ...");
			binaryTree.getLevel(60);
		} catch (NoSuchElementException e) {
			System.out.println(e.toString());
		}
		System.out.println("\nPreorder Traversal is: ");
		binaryTree.preorderTraversal();
		System.out.println("\nInorder Traversal is: ");
		binaryTree.inorderTraversal();
		System.out.println("\n\nBefore deleting key 3,  level order traversal of binary tree is: ");
		binaryTree.levelOrderTraversal();
		System.out.println();

		System.out.println("\nThe tree is: ");
		binaryTree.printTree();
		binaryTree.deleteByCopying(3);
		System.out.println("\nAfter deleting key 3,  level order traversal of binary tree is: ");
		binaryTree.levelOrderTraversal();
		System.out.println();
		System.out.println("\nThe tree is: ");
		binaryTree.printTree();
	}
}