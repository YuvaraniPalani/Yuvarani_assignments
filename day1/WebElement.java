package Week3.day1;

public class WebElement {

	public static void main(String[] args) {
		WebElement e1 = new WebElement();
		e1.click();
		e1.setText(" Parent : Webelement ");

	}
	public void click() {
		System.out.println("click from webelement base class");
	}
	
	public void setText(String text){
		
		System.out.println(text);
	}

}
