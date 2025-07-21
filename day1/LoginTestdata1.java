package Week3.day1;

public class LoginTestdata1 extends TestData {

	public static void main(String[] args) {
		LoginTestdata1 data =  new LoginTestdata1();
		 data.enterCredentials();
		 data.enterUsername();
		 data.enterPassword();
		 data.navigateToHomePage(); 
	}

	public void enterUsername() {
        System.out.println("Username1");
	}

	public void enterPassword() {
		System.out.println("Password1");
	}
}
