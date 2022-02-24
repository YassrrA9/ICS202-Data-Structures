package pckg4;

import java.util.Scanner;

public class BalancedParentheses {
	public static void main(String[] args) {

		//Prompts the user to input an expression
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter an expression to check:");
		String expression = kb.nextLine();
		String expressionWithout = "";

		kb.close();
		
		Stack list = new Stack();

		// make a new string without non-parentheses characterts
		for (int i = 0; i < expression.length(); i++) {
			char ch = expression.charAt(i);
			if ((ch == '[') || (ch == ']') || (ch == '{') || (ch == '}') || (ch == '(') || (ch == ')')) {
				expressionWithout += ch;

			}
		}

		int j = 0;
		
		// checking if the expression is balanced or not
		while (j < expressionWithout.length()) {

			char character = expressionWithout.charAt(j);

			if ((character == '[') || (character == '{') || (character == '(')) {
				list.push(character);
			} else if ((character == ']') || (character == '}') || (character == ')')) {
				
				if (list.isEmpty()) {
					System.out.println("\nExpression is not balanced");
					
					return;
				} else {
					char charInList = (char) list.pop();
					
					if ((charInList == '[') && (character == ']')) {

					} else if ((charInList == '{') && (character == '}')) {

					} else if ((charInList == '(') && (character == ')')) {

					} else {
						System.out.println("\nExpression is not balanced");
						return;
					}
				}
			}

			j++;
		}
		

		if (j == (expressionWithout.length())) {
			System.out.println("\nExpression is  balanced");
		}

	}

}
