package Week3.day1;

public class Button extends WebElement {
//parent for checkbox and radio button
	public static void main(String[] args) {
		Button b1 = new Button();
		b1.click();
		b1.setText("Child1 : Button");
	    b1.submit();

	}
	public void submit() {
		System.out.println("submit from button class");
	}

}
