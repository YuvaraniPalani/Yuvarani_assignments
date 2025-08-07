package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLeadStepDefiniton extends BaseClass{
	

	@And("click on Leads")
	public void click_on_leads() {
		driver.findElement(By.linkText("Leads")).click();
	}
	@And("click on the Create Lead button")
	public void click_on_the_create_lead_button() {
		driver.findElement(By.linkText("Create Lead")).click();
	}
	@And("Enter the firstName as (.*)$")
	public void enter_the_firstname_as(String firstname) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstname); 
	}
	@And("Enter the lastName as (.*)$")
	public void enter_the_lastname_as(String lastnames) {
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastnames);
	}
	@And("Enter the companyname as (.*)$")
	public void enter_the_companyname_as(String cmpname) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cmpname);
	}
	@And("Enter the profiletitle as (.*)$")
	public void enter_the_profiletitle_as(String profile) {
		 driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys(profile);
	}
	@When("Click on submit button")
	public void click_on_submit_button() {
		 driver.findElement(By.className("smallSubmit")).click();
	}
	@Then("Lead account will be created")
	public void lead_account_will_be_created() {
	    System.out.println("Lead account created");
	}

}
