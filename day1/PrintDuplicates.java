package Week2.day1;

import java.util.Arrays;

public class PrintDuplicates {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int[] num = { 2, 5, 7, 7, 5, 9, 2, 3};

		Arrays.sort(num); // 2 2 3 5 5 7 7 9
		System.out.println("Total num count :" +num.length);
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
			
			if (i< num.length -1 && num[i] == num[i+1]) {
				
				System.out.print("It is a duplicate value : ");
				
			}
		}

	}
}
