package Week3.day1;

public class CheckBoxButton extends Button {
//child class 
	public static void main(String[] args) {
		CheckBoxButton ch1 = new CheckBoxButton();
		ch1.submit();
		ch1.clickCheckButton();
		

	}
	public void clickCheckButton() {
		System.out.println("Checkboxbutton clicked");
	}

}
