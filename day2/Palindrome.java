package Week1.day2;

public class Palindrome {
	public static void main(String[] args) {
		int input = 121; // You can change this to test other numbers
		int output = 0;
		int original = input;

		for (int i = input; i > 0; i = i / 10) {
			int rem = i % 10; // takes the last digit
			output = output * 10 + rem;
		}

		if (original == output) {
			System.out.println(original + " is a Palindrome");
		} else {
			System.out.println(original + " is not a Palindrome");
		}
	}
}
