package week5.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LeadAccountTest2 extends Baseclass {
	@DataProvider(name="fetchdatacreate")
	public String[][] data() {
		String[][] data = new String[3] [4];
		
		data[0][0] ="Yuvarani";
		data[0][1] ="P";
		data[0][2] ="Infosys";
		data[0][3]="Testing";
	
		data[1][0] ="Swathi";
		data[1][1] ="V";
		data[1][2] ="DXC";
		data[1][3]="Development";
				
		data[2][0] ="Suganya";
		data[2][1] ="Palani";
		data[2][2] ="Emphasis";
		data[2][3]="Development";
		
		return data;
	}
	@Test(dataProvider="fetchdatacreate")

	public void leadAccountTest(String firstname,String lastname,String companyname,String role) throws InterruptedException {

		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastname);
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyname);
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys(role);
		driver.findElement(By.className("smallSubmit")).click();

	}
}
