package Week2.day2;

public class ConvertUpper {

	public static void main(String[] args) {
		String test = "changeme";
		for (int i = 0; i < test.length(); i++) {
			int num = i;
		char test1 = test.charAt(i);
			if (num % 2 == 1) {
			test1 = Character.toUpperCase(test1);
			}
			
			System.out.print(test1);
		}
	}

}
