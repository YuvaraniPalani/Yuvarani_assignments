package Week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingCollection {

	public static void main(String[] args) {
		//String[] cmp ={"HCL, Wipro, Aspire Systems, CTS"} ;
		List<String> cmp = new ArrayList<String>();
        cmp.add("HCL");
        cmp.add("Wipro");
        cmp.add("Aspire Systems");
        cmp.add("CTS");
        System.out.println("Before sorting :" + cmp);

		Collections.sort(cmp, Collections.reverseOrder());
		System.out.println("After Sorting: " +cmp);

	}

}
