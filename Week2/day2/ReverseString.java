package Week2.day2;
public class ReverseString {
    public static void main(String[] args) {
    	String companyName= "TestLeaf";
        String reversed = "";
        System.out.println(companyName.length() - 1) ;
        System.out.println(companyName.length()) ;
        for (int i = companyName.length() - 1; i >= 0; i--) {
        	//i=7;7>=0;7--)
        	//for (int i = companyName.length(); i >= 0; i--)
            reversed += companyName.charAt(i);
        }

        System.out.println("Reversed String: " + reversed);
    }
}