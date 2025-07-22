package Week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Largest {

	public static void main(String[] args) {
		Integer[] numbers ={3, 2, 11, 4, 6, 7};
		List<Integer> numlist = new ArrayList <>(Arrays.asList(numbers));
		Collections.sort(numlist); //sorting using collection
		System.out.println(numlist);//sorted ist
		int totallength =numlist.size();
		System.out.println("Second largest is "+numlist.get(totallength-2)); //  numlist.get(2);
		
		
		
		}

	

}
