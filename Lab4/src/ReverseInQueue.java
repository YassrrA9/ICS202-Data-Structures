package pckg4;

import java.util.Scanner;

public class ReverseInQueue {
	public static void main(String[] args) {

		Stack s = new Stack();
		Queue q = new Queue();

		Scanner kb = new Scanner(System.in);
		System.out.print("Enter a string :  ");
		String input = kb.nextLine();
		kb.close();

		// Add elements to the stack
		for (int i = 0; i < input.length(); i++)
			s.push(input.charAt(i) + "");

		// Add elements from the stack to the queue

		while (!s.isEmpty()) {
			q.enqueue(s.pop());
		}

		System.out.println("The reversed string is: ");

		while (!q.isEmpty()) {
			System.out.print(q.dequeue());
		}

		System.out.println();

	}
}
