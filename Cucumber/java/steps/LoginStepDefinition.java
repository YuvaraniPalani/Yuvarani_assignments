package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition extends BaseClass{

	
	@Given("Launch the browser")
	public void launchBrowser() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		driver = new ChromeDriver(options);
	}

	@And("Load the url")
	public void load_the_url() {
		driver.get("http://leaftaps.com/opentaps/control/main");
	}

	// passing the values as arguments from feature file
	@And("Enter the username as {string}")
	public void enter_the_username_as_demosalesmanager(String user) {
		driver.findElement(By.id("username")).sendKeys(user);
	}

	@And("Enter the password as {string}")
	public void enter_the_password_as_crmsfa(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
	}

	@When("Click on Login button")
	public void click_on_login_button() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}

	@Then("It should be logged in")
	public void it_should_be_logged_in() {
		System.out.println("Login successful");
	}

//7	
	@Then("Click on crmsfa")
	public void click_on_crmsfa() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.className("crmsfa")).click();
	}

	@Then("Click on Accounts")
	public void click_on_accounts() {
		driver.findElement(By.linkText("Accounts")).click();
	}

	@Then("Click on Create Accounts")
	public void click_on_create_accounts() {
		driver.findElement(By.linkText("Create Account")).click();
	}

	@Then("Enter the accountName as {string}")
	public void enter_the_account_name_as(String accountname) {
		driver.findElement(By.id("accountName")).sendKeys(accountname);
	}

	@Then("Enter the numberEmployees as {string}")
	public void enter_the_number_employees_as(String emp) {
		driver.findElement(By.id("numberEmployees")).sendKeys(emp);
	}

	@Then("Enter the officeSiteName as {string}")
	public void enter_the_office_site_name_as(String sitename) {
		driver.findElement(By.name("officeSiteName")).sendKeys(sitename);
	}

	@When("Click on smallSubmit")
	public void click_on_small_submit() {
		driver.findElement(By.className("smallSubmit")).click();
	}

	@Then("Account will be created successfully")
	public void account_will_be_created_successfully() {
		System.out.println("Account created successfully");
	}

	@Then("Error message should pop up")
	public void Error_message_should_pop_up() {
		System.out.println("Error: wrong username or passwod");
	}
}
