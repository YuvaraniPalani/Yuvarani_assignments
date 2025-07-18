package Week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
	    driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("Infosys");
	    driver.findElement(By.xpath("//td /input[@name='firstName']")).sendKeys("Yuvarani");	    
	    driver.findElement(By.xpath("//td /input[@name='lastName']")).sendKeys("P");	    
        driver.findElement(By.xpath("//td /input[@name='firstNameLocal']")).sendKeys("Yuvarani");
	    driver.findElement(By.xpath("//td /input[@name='departmentName']")).sendKeys("Testing");
	    driver.findElement(By.cssSelector("[name='description']")).sendKeys("This is for Week 2 day4 Edit lead assignment");
	    driver.findElement(By.cssSelector("#createLeadForm_primaryEmail")).sendKeys("abc189@gmail.com") ;
	    WebElement Province =driver.findElement(By.name("generalStateProvinceGeoId"));
	    Select Provincename =new Select(Province);
	    Provincename.selectByVisibleText("New York");
	    driver.findElement(By.cssSelector("[name='submitButton']")).click();
	    driver.findElement(By.linkText("Edit")).click();
	    driver.findElement(By.id("updateLeadForm_description")).clear();
	    driver.findElement(By.name("importantNote")).sendKeys("updating this as part of Week 2 day4 Edit lead assignment");
	    driver.findElement(By.cssSelector("[value='Update']")).click();
	    System.out.println(driver.getTitle());
	   
	    
	}

}
