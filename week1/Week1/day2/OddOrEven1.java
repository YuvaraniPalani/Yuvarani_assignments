package Week1.day2;

public class OddOrEven1 {

	public static void main(String[] args) {

		int[] values = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 ,78,90,100,67};
		for (int i = 0; i < values.length; i++) {

			// if(values[i]% 2 != 0)
			if (values[i] % 2 == 1)

				System.out.println(values[i] + " is an odd number");

			else
				System.out.println(values[i] + " is an even number");
		}
	}

}
