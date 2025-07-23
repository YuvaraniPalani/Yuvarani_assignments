package Week3.day3;

import java.util.LinkedHashSet;
import java.util.Set;

public class Duplicate {

	public static void main(String[] args) {
		String companyName = "google";
		char[] company = companyName.toCharArray();

		Set<Character> companyunique = new LinkedHashSet<Character>();
		for (int i = 0; i < company.length; i++) {
			companyunique.add(company[i]);
		}

		System.out.println(companyunique);
	}

}
