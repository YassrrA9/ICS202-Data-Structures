package packagelist;

public class DLLTest {
	public static void main(String[] args) {
		DLL<String> test = new DLL<String>();
		for(int i = 1; i <= 10; i++)
			test.addToTail("B" + i);
		System.out.println("Normal List:");

		test.printAll();
		System.out.println();
		System.out.println("Reverse List:");

		test.printReverse();
		System.out.println();
		System.out.println();
		System.out.println("Starting deletion the 7th element:");
		
		System.out.println();
		while(!test.isEmpty()) {
			
			test.delete7();
			test.printAll();
			System.out.println();

			System.out.println("//Delete Again//");
			//test.printAll();
		}
	}
}
