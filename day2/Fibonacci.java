package Week1.day2;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * starts with 0 and 1 add both then and with previous
		 */
		int a = 0, b = 1;
		for (int i = 0; i < 8; i++) {
			System.out.println(a + " "); // 0 then loop starts 1,1,2,3,5,8
			int lastvalue = a + b;// 1,2,3,5,8
			a = b;// 1, 1 ,2 ,3
			b = lastvalue; // 1, 2 ,3 ,5
		}
	}

}
