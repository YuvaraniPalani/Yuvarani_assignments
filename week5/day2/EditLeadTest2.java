package week5.day2;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class EditLeadTest2 extends Baseclass{
	
	@BeforeTest
	public void setValues() {
		filename="EditLead";
	}
	
	@Test(dataProvider="fetchdata")
	
	public void editLeadTest(String companyname,String firstname,String lastname,String mailid) {
		
	    driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys(companyname);
	    driver.findElement(By.xpath("//td /input[@name='firstName']")).sendKeys(firstname);	    
	    driver.findElement(By.xpath("//td /input[@name='lastName']")).sendKeys(lastname);	    
        driver.findElement(By.xpath("//td /input[@name='firstNameLocal']")).sendKeys(firstname);
	    driver.findElement(By.xpath("//td /input[@name='departmentName']")).sendKeys("Testing");
	    driver.findElement(By.cssSelector("[name='description']")).sendKeys("This is for Week 2 day4 Edit lead assignment");
	    driver.findElement(By.cssSelector("#createLeadForm_primaryEmail")).sendKeys(mailid) ;
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
