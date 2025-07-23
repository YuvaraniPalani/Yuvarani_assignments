package Week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Intersection {

	public static void main(String[] args) {

	//	Integer[] arr1 = { 3, 2, 11, 4, 6, 7 };
//		take first value 
//	     take first value and compare
//		
//		
//		
//		
	//	Integer[] arr2 = { 1, 2, 8, 4, 9, 7 };
		
		List<Integer> arr1 = new ArrayList<Integer>();
		arr1.add(3);
		arr1.add(2);
		arr1.add(11);
		arr1.add(4);
		arr1.add(6);
		arr1.add(7);
		Collections.sort(arr1);
		List<Integer> arr2  = new ArrayList<Integer>();
		arr2.add(1);
		arr2.add(2);
		arr2.add(8);
		arr2.add(4);
		arr2.add(9);
		arr2.add(7);
		Collections.sort(arr2);
		for(int i=0;i<arr1.size();i++) {
			Integer firstfromarr1 = arr1.get(i);
			System.out.println("Arr first value to be checked "+ firstfromarr1);
			for(int j=0;j<arr2.size();j++) {
				Integer firstfromarr2 = arr2.get(j);
				if(firstfromarr1==firstfromarr2 )
				{
					System.out.println("match found for " + arr1.get(i));
	            }
				
			}
			
		}	
	}
}
