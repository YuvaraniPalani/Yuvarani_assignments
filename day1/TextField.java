package Week3.day1;

public class TextField extends WebElement{

	public static void main(String[] args) {
		TextField t1 = new TextField ();
		t1.click();
		t1.setText("Child2 :TextField ");		
		t1.getText();

	}
	public void getText() {
		System.out.println("Gettext from Textfield class");
	}

}
