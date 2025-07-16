package Week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LeadAccount {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.className("crmsfa")).click();
	    driver.findElement(By.linkText("Leads")).click();
	    driver.findElement(By.linkText("Create Lead")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Yuvarani");
	    driver.findElement(By.id("createLeadForm_lastName")).sendKeys("P");
	    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
	    driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Automation Tester");
	    driver.findElement(By.className("smallSubmit")).click();
		driver.close();	
	}
}
