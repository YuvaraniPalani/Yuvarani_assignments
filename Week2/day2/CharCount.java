package Week2.day2;

import java.util.Arrays;

public class CharCount {

    public static void main(String[] args) {
        String input = "TestLeaf";
        
 char[] input1 = input.toCharArray();
 char target = 'e';
        int count = 0;
        for(int i=0;i<input1.length;i++) {
        	char c1 = input1[i];
        	if (c1==target) {
        		count++;
        	}
        }
        System.out.println(target+"'s count is " +count);

    }
}