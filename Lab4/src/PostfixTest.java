package pckg4;

import java.util.Scanner;

public class PostfixTest {
	public static void main(String[] args) {

		// Prompts the user to enter the postfix expression
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a postfix expression : ");
		System.out.println();
		String postfix = kb.nextLine();
		kb.close();

		int i = 0;
		double number, num1, num2, result;

		Stack list = new Stack();

		// Start the calculation
		while (i < postfix.length()) {

			if ((postfix.charAt(i) == ' ')) {
				i--;
				i++;
				
			} else if ((postfix.charAt(i) == '+')) {
				num2 = (double) list.pop();
				num1 = (double) list.pop();
				result = num1 + num2;
				list.push(result);
				System.out.println("Stack" + list);
				// Doing the addition and show the stack

			} else if ((postfix.charAt(i) == '-')) {
				num2 = (double) list.pop();
				num1 = (double) list.pop();
				result = num1 - num2;
				list.push(result);
				System.out.println("Stack" + list);
				// Doing the substraction and show the stack

			} else if ((postfix.charAt(i) == '*')) {
				num2 = (double) list.pop();
				num1 = (double) list.pop();
				result = num1 * num2;
				list.push(result);
				System.out.println("Stack" + list);
				// Doing the multiplication and show the stack
				
			} else if ((postfix.charAt(i) == '/')) {
				num2 = (double) list.pop();
				num1 = (double) list.pop();
				result = num1 / num2;
				list.push(result);
				System.out.println("Stack" + list);
				// Doing the division and show the stack

			} else {
				
				// ADDING THE NUMBER TO THE STACK
				number = Double.parseDouble(postfix.charAt(i) + "");
				// IF THE NUMBER IS >=10
				if ((postfix.charAt(i + 1) != '+') && (postfix.charAt(i + 1) != '-') && (postfix.charAt(i + 1) != '*')
						&& (postfix.charAt(i + 1) != '/') && (postfix.charAt(i + 1) != ' ')) {
					
					String t = postfix.charAt(i + 1) + "";
					number = Double.parseDouble(postfix.charAt(i) + t);
					list.push(number);
					System.out.println("Stack" + list);
					// ADDING THE NUMBER TO THE STACK and show the stack
					i++;
				} else {

					list.push(number);
					System.out.println("Stack" + list);
					// ADDING THE NUMBER TO THE STACK and show the stack


				}
			}
			i++;
		}

		// show the result
		System.out.println(list.pop());

	}

}
