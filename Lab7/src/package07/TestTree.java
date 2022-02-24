package package07;

public class TestTree
{
	public static void main(String[] args) {
		BST<String> tree = new BST<String>();
		tree.insert("D");
		tree.insert("B");
		tree.insert("A");
		tree.insert("C");
		tree.insert("F");
		tree.insert("H");
		
		System.out.println("Path is :");
		System.out.println(tree.getPath("C"));
		
		System.out.println("Number of RIGHT leaf is :");
		System.out.println(tree.getRightLeafCount());
		
		System.out.println("Number of element Greater the first, less than the second:");
		System.out.println(tree.rangeCounter("C", "H"));
		
		System.out.println("successor :");
		System.out.println(tree.successor("A"));
		
		System.out.println("predecessor :");
		System.out.println(tree.predecessor("F"));



		//Likewise test all other methods.

}
}