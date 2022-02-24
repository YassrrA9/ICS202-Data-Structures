package pckg52;

public class Q1_Driver {
	public static void main(String[] args) {
		String[] list = new String[5];
		list[0] = "Mango";
		list[1] = "nut";
		list[2] = "Watermelon";
		list[3] = "Apple";
		list[4] = "banana";

		System.out.println("Smallest String is " + findSmallest(list, 0));
		System.out.println("Longest String is " + findLongest(list, 0));

	}

	public static String findSmallest(String list[], int n) {
		String current = list[n];
		return smallestAux(list, n, current);
	}

	private static String smallestAux(String list[], int n, String current) {
		String min = current;
		if (n + 1 == list.length) {
			return min;
		} else {
			if (list[n + 1].length() < min.length()) {
				min = list[n + 1];
				return smallestAux(list, n + 1, min);

			}

			return smallestAux(list, n + 1, min);
		}
	}

	public static String findLongest(String list[], int n) {
		String current = list[n];
		return longestAux(list, n, current);
	}

	private static String longestAux(String list[], int n, String current) {
		String max = current;
		if (n + 1 == list.length) {
			return max;
		} else {
			if (list[n + 1].length() > max.length()) {
				max = list[n + 1];
				return longestAux(list, n + 1, max);

			}

			return longestAux(list, n + 1, max);
		}
	}
}