package Week3.day1;

public class LoginTestdata2 extends TestData {

	public static void main(String[] args) {
		 LoginTestdata2 data =  new LoginTestdata2();
		 data.enterCredentials();
		 data.enterUsername();
		 data.enterPassword();
		 data.navigateToHomePage(); 
	}

	public void enterUsername() {
        System.out.println("Username2");
	}

	public void enterPassword() {
		System.out.println("Password2");
	}
}
