package Week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Missing {

	public static void main(String[] args) {
		Integer [] elements = {1, 2, 3, 4, 10, 6, 8};
		List<Integer> elementsc= new ArrayList<>(Arrays.asList(elements));
		Collections.sort(elementsc);
		for (int i = 0; i < elementsc.size()-1; i++) {
			int first = elementsc.get(i);
            int next = elementsc.get(i + 1);
			//System.out.println(elementsc.get(i));// first
            if (next != first + 1) {
               
                for (int j = first + 1; j < next; j++) {
                    System.out.println("Missing: " + j);
                }
	        }
			}
			
		}
	}


