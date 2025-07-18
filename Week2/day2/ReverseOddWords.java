package Week2.day2;

public class ReverseOddWords {

	public static void main(String[] args) {
		String test = "I am a software tester";
		 String[] splited = test.split(" ");
		for(int i=0;i<splited.length;i++)
		{
			int index = i;
			//System.out.println(splited[i]);
			if(index%2==1) 
			{
			String odd = splited[i];
			char[] reverse = odd.toCharArray();
		//	System.out.println(odd);
			for(int j = reverse.length-1;j>=0;j--) {
				char reversed = reverse[j];
				System.out.print(reversed);
			}
			}
			else {
				System.out.print(splited[i]);
			}
			System.out.print(" ");
			}		
		
		}


	}


