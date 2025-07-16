package Week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class FacebookAcc {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Yuva");
		driver.findElement(By.name("lastname")).sendKeys("P");
	
		WebElement day = driver.findElement(By.id("day"));
		Select option = new Select(day);
		option.selectByValue("1");
		
		WebElement month = driver.findElement(By.id("month"));
		Select option1 = new Select(month);
		option1.selectByVisibleText("Feb");
	
		WebElement year = driver.findElement(By.name("birthday_year"));
		Select option2 = new Select(year);
		option2.selectByValue("2001");
		
		driver.findElement(By.xpath("(//input[@id='sex'])[1]")).click();
		driver.findElement(By.name("reg_email__")).sendKeys("7676767677");
		driver.findElement(By.name("reg_passwd__")).sendKeys("star@256");
		driver.findElement(By.name("websubmit")).click();
	//	driver.close();	
		
	}
}
