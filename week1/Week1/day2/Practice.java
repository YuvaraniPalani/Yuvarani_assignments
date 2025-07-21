package Week1.day2;

public class Practice {
	public static void main(String[] args) {

		int num = 17;
//	int[] values = {2,6,8,89,54,10};
//	System.out.println(values.length);
		if (num % 2 != 0)
			System.out.println(num + " is an odd number");

		else
			System.out.println(num + " is an even number");

		System.out.println("-----------");
		int[] values = { 2, 6, 8, 89, 54, 10 };
		for (int i = 0; i < values.length; i++) {

			System.out.println(values[i]);
			System.out.println(" ");
		}
		System.out.println("reverse order");

		for (int i = values.length - 1; i >= 0; i--)
		/*
		 * 5;5>=0;i-- 10 4,4>=0;i-- 54 3,3>=0;i--89 2,2>=6;i-- 08 1,1>=0;i--06
		 * 0,0>=0;i-- 02 -1,0>=0;i-- stops
		 * 
		 */
		{
			System.out.print(values[i]);
			System.out.print(" ");
		}
	}
}