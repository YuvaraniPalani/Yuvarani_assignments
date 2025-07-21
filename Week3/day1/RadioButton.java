package Week3.day1;

public class RadioButton extends Button {
//child class
	public static void main(String[] args) {
		RadioButton rb = new RadioButton();
		rb.submit();
		rb.selectRadioButton();
		
		
	}
	public void  selectRadioButton() {
		System.out.println("Radio button selected");
	}

}
