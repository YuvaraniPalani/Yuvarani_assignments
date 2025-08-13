package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginfbStepDefinition extends BaseClassfb {

	@Given("Launch the browser")
	public void launchBrowser() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		driver = new ChromeDriver(options);
	}

	@And("Load the url")
	public void load_the_url() {
		driver.get("https://en-gb.facebook.com/");
	}

	@And("click on Create new account link")
	public void click_on_create_new_account_link() {
		driver.findElement(By.linkText("Create new account")).click();
	}

	@And("Enter the firstname as {string}")
	public void enter_the_firstname_as(String firstname) {
		driver.findElement(By.name("firstname")).sendKeys(firstname);
	}

	@And("Enter the lastname as {string}")
	public void enter_the_lastname_as(String lastname) {
		driver.findElement(By.name("lastname")).sendKeys( lastname);
	}

	@And("Collect all options for day and select {string}")
	public void collect_all_options_for_day_and_select(String birthdate) {
		WebElement day = driver.findElement(By.id("day"));
		Select option = new Select(day);
		option.selectByValue(birthdate);
		
	}
	
	@And("Collect all options for month and select {string}")
	public void collect_all_options_for_month_and_select(String birthmonth) {

		WebElement month = driver.findElement(By.id("month"));
		Select option1 = new Select(month);
		option1.selectByVisibleText(birthmonth);
	
	}
	
	@And("Collect all options for year and select {string}")
	public void collect_all_options_for_year_and_select(String birthyear) {

		WebElement year = driver.findElement(By.name("birthday_year"));
		Select option2 = new Select(year);
		option2.selectByValue(birthyear);
	}
	
	@And("click on gender button")
	public void click_on_gender_button() {
		driver.findElement(By.xpath("(//input[@id='sex'])[1]")).click();
	}
	
	@And("Add registered mail as {string}")
	public void add_registered_mail_as(String mail) {
		driver.findElement(By.name("reg_email__")).sendKeys(mail);
	}
	
	@And("Add registered password as {string}")
	public void add_registered_password_as(String password) {
		driver.findElement(By.name("reg_passwd__")).sendKeys(password);
	}
	
	@When("click on submit button")
	public void clcik_on_submit_button() {
		driver.findElement(By.name("websubmit")).click();
	}
	
	@Then("Account will be created successfully")
	public void account_will_be_created_successfully() {
	 System.out.println("Account created successfully");
	}


}
