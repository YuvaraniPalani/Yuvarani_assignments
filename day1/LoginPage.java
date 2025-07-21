package Week3.day1;

public class LoginPage extends BasePage{
	//child class for method overriding
	public static void main(String[] args) {
		LoginPage l1= new LoginPage();
		l1.findElement();
		l1.clickElement();
		l1.enterText();
		l1.performCommonTasks();
	
	}
	public void performCommonTasks() {
		System.out.println("performCommonTasks from Loginpage");
	}

}
