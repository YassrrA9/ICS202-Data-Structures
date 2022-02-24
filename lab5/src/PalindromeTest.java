package pckg52;

public class PalindromeTest {
	public static void main(String[] args) {
		SLL<String> list = new SLL<String>();
		for(int i=0; i<5; i++) {
			list.addToHead("A"+i);
		}
		System.out.println(list.findPalindrome(list));
	}

}
