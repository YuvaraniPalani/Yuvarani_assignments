package testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LeadAccountTest extends Baseclass {
	
	@BeforeTest
	public void setValues() {
		filename="LeadAccount";
	}
	@Test(dataProvider="fetchdata")
	public void leadAccountTest(String firstname,String lastname,String companyname,String role) throws InterruptedException {

		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastname);
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyname);
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys(role);
		driver.findElement(By.className("smallSubmit")).click();

	}
}
